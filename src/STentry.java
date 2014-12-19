public class STentry {

	private Node dec;
	private int nl;
	private Node type;
	private int offset;

	public STentry (Node d, int n) {
		dec=d;
		nl=n;
	}

	public STentry (Node d, int n, int os) {
		dec=d;
		nl=n;
		offset = os;
	}

	public STentry (Node d, int n, Node t) {
		dec=d;
		nl=n;
		type=t;
	}

	public STentry (Node d, int n, Node t,int os) {
		dec=d;
		nl=n;
		type=t;
		offset=os;
	}

	public void addType (Node t) {
		type=t;
	}

	public Node getType () {
		return type;
	}

	public int getOffset () {
		return offset;
	}

}	
