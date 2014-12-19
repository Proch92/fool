public class BoolTypeNode extends Node {
	
	public BoolTypeNode () {
	}
	
	public String toPrint(String s) {
		return "bool";
	}
		
	public Node typeCheck() {
		return new BoolTypeNode();
	}
	
	public String codeGeneration() {
		return "";
	}
}