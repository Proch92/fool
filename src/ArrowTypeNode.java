import java.util.ArrayList;

public class ArrowTypeNode extends Node {

	private ArrayList<Node> par; 
	private Node ret;
	
	public ArrowTypeNode (ArrayList<Node> p, Node r) {
		par=p;
		ret=r;
	}
		
	public String toPrint(String s) {
		return "";
	}
	
	public Node getRet () {
		return ret;
	}
	
	public ArrayList<Node> getPar () {
		return par;
	}

	
	public Node typeCheck () {
		return new ArrowTypeNode (par, ret);
	}
	
	public String codeGeneration() {
		return "";
	}
}	