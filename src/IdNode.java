public class IdNode extends Node {

	private String id;
	private STentry entry;
	private int diffNesting;
	
	public IdNode (String i, STentry st, int dn) {
		id=i;
		entry=st;
		diffNesting = dn;
	}
	
	public String toPrint(String s) {
		return "";
	}
	
	public Node typeCheck () {
		 return entry.getType();
	}

	public String codeGeneration() {
		String getActivationRecord="";
		for (int i=0; i!=diffNesting; i++)
			getActivationRecord+="lw\n";

		return "push "+entry.getOffset()+"\n"+
					"lfp\n"+
					getActivationRecord+
					"add\n"+
					"lw\n";
	}
}