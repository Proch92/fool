public class IntTypeNode extends Node {
	
	public IntTypeNode () {
	}
	
	public String toPrint(String s) {
				return "int";
	}
	
	public Node typeCheck() {
		return new IntTypeNode();
	}
	
	public String codeGeneration() {
		return "";
	}
}