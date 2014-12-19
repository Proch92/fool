import java.util.ArrayList;
public class LetInNode extends Node {

	private ArrayList<Node> dec;
	private Node exp;
	
	public LetInNode (ArrayList<Node> d, Node e) {
		dec=d;
		exp=e;
	}
	
	public String toPrint(String s) {
		return "";	 
	}
	
	public Node typeCheck () {
		for (int i=0; i<dec.size(); i++)
			(dec.get(i)).typeCheck();
		return exp.typeCheck();
	}
	
	public String codeGeneration() {
		String varDecl = "push 0\n"; //valore fittizio
		for (int i=0; i < dec.size(); i++)
			varDecl+= (dec.get(i)).codeGeneration();
		return varDecl + exp.codeGeneration() + "halt\n";
	}
}