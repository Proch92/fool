public class BoolNode extends Node {

	private boolean val;
	
	public BoolNode (boolean n) {
		val=n;
	}
	
	public String toPrint(String s) {
	if (val) return s+"Bool:true\n";
		else return s+"Bool:false\n";
	}
	
	public Node typeCheck() {
		return new BoolTypeNode();
	}
	
	public String codeGeneration() {
		if (val==false) return "push 0\n";
			else return "push 1\n";
	}
}	