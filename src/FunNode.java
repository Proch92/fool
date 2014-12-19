import java.util.ArrayList;

public class FunNode extends Node {

	private String id;
	private Node type; 
	private ArrayList<Node> par; 
	private ArrayList<Node> def; 
	private Node body;
	
	public FunNode (String i, Node t) {
		id=i;
		type=t;
		par = new ArrayList<Node>();
	}
	
	public void addDecBody (ArrayList<Node> d, Node b) {
		def=d;
		body=b;
	}	
	
	public void addPar (Node p) {
		par.add(p);
	}	
	
	public String codeGeneration() {
		String funl=FOOLlib.freshLabel();

		String decLocal = "";
		for(int i=0; i!=def.size(); i++)
			decLocal += def.get(i).codeGeneration();

		String pop = "";
		for(int i=0; i!=def.size(); i++)
			pop += "pop\n";

		String popParam = "";
		for(int i=0; i!=par.size(); i++)
			popParam += "pop\n";

		FOOLlib.putCode(
			funl + ":\n" +
			"cfp\n" + //allineo fp e sp
			"lra\n" + //salvo return address
			decLocal + //dichiarazioni locali
			body.codeGeneration() +
			"srv\n" + //return value. valore che viene restituito al chimaante (int o bool)
			pop + //pop per variabili locali
			"sra\n" + //pop return address nel registro
			"pop\n" + //butto via access link
			popParam + //pop per parametri locali
			"sfp\n" + //riallineo il fp con il frame precedente
			"lra\n" + //imposto il program counter
			"js\n"
		);

		return "push " + funl + "\n";
	}
	
	public String toPrint(String s) {
		return "";
	}
	
	public Node typeCheck () {
		ArrayList<Node> pt = new ArrayList<Node>();
		for (int i=0; i<par.size(); i++) 
			pt.add( (par.get(i)).typeCheck() );
		for (int j=0; j<def.size(); j++) 
			(def.get(j)).typeCheck();
		if ( !(FOOLlib.isSubtype(body.typeCheck(),type)) ){
			System.out.println("Wrong return type for function "+id);
			System.exit(0);
		}	
		return new ArrowTypeNode (pt, type);
	}
		
}	