public abstract class Node {
		
	abstract public String toPrint(String indent);

	abstract public Node typeCheck();
	
	abstract public String codeGeneration();
	
}