public class FOOLlib {

	private static int newlabel=0;
		
	private static String funCode = "";

	public static boolean isSubtype (Node a, Node b) {
		boolean ret=false; 
		if ( (a.toPrint("")).equals(b.toPrint("")) ) ret=true;
		if ( (a.toPrint("")).equals("bool") && (b.toPrint("")).equals("int") ) ret=true;
		return ret;
	} 
	
	public static String freshLabel() {
		return "label"+newlabel++;
	}
	
	public static void putCode(String c) {
		funCode += c;
	}

	public static String getCode() {
		return funCode;
	}
}