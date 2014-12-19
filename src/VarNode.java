public class VarNode extends Node {

	private String id;
	private Node type;
	private Node value;

	public VarNode (String i, Node t, Node v) {
		id=i;
		type=t;
		value=v;
	}

	public String toPrint(String s) {
		return "";
	}

	public Node typeCheck () {
		Node t=type.typeCheck();
		if (! (FOOLlib.isSubtype(value.typeCheck(),t)) ){			
			System.out.println("incompatible value for variable "+id);
			System.exit(0);
		}
		return t;
	}

	public String codeGeneration() {
		return value.codeGeneration();
	}
}
