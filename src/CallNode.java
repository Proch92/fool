import java.util.ArrayList;

public class CallNode extends Node {

	private String id;
	private STentry st; 
	private ArrayList<Node> par;
	private int diffNesting;
	
	public CallNode (String i, STentry e, ArrayList<Node> p, int dn) {
		id=i;
		st=e;
		par = p;
		diffNesting = dn;
	}
	
	public String toPrint(String s) {
		return "";
	}
	
	public Node typeCheck () {
		Node t = st.getType();
		if ( !(t instanceof ArrowTypeNode) ) {
			System.out.println("Invocation of a non-function "+id);
			System.exit(0);
		}
		ArrayList<Node> p = ((ArrowTypeNode) t).getPar();
		if ( !(p.size() == par.size()) ) {
			System.out.println("Wrong number of parameters in the invocation of "+id);
			System.exit(0);
		}
		for (int i=0; i<par.size(); i++) 
			if ( !(FOOLlib.isSubtype( (par.get(i)).typeCheck(), p.get(i)) ) ) {
				 System.out.println("Wrong type for "+(i+1)+"-th parameter in the invocation of "+id);
				 System.exit(0);
			} 
		return ((ArrowTypeNode) t).getRet();
	}

	//creation of new stack frame
	public String codeGeneration() {
		String parCode = "";

		for(int i=par.size()-1; i>=0; i--)
			parCode += par.get(i).codeGeneration();

		String getActivationRecord="";
		for (int i=0; i!=diffNesting; i++)
			getActivationRecord+="lw\n";

		return "lfp\n" + parCode +
					//definizione access link
					"lfp\n" +
					getActivationRecord + 
					//ricerca del target del jump
					"push " + st.getOffset() + "\n" +
					"lfp\n" +
					getActivationRecord +
					"add\n" +
					"lw\n" +
					"js";
	}
}	