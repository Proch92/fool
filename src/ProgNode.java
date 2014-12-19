import java.util.ArrayList;

public class ProgNode extends Node {

	private Node exp;

	public ProgNode (Node e) {
		exp=e;
	}

	public String toPrint(String s) {

		return "Prog\n" + exp.toPrint("	") ;
	}

	public Node typeCheck() {
		return exp.typeCheck();
	} 

	public String codeGeneration() {
		return exp.codeGeneration()+
			"halt\n";
	}

}	
