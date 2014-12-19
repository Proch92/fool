public class ParNode extends Node {

	private String id;
	private Node type;
	
	public ParNode (String i, Node t) {
		id=i;
		type=t;
	}
	
	public String toPrint(String s) {
		return "";
	}
	
	public Node typeCheck () {
		return type;
	}
	
	public String codeGeneration() {
		return "";
	}
}