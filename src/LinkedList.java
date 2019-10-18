
public class LinkedList {
	

	
	public LinkedList() {
		startNode=null;
	}
	public LinkedList(int startValue) {
		startNode= new Node(startValue);
	}
	public Node startNode;
	int count = 0;
	public int getSize() {
	
		return startNode.getSize(count);
	}	
	public void insertSorted(int n) {
		Node newNode= startNode.insertSorted(n);
		if ( newNode!=null) {
			startNode=newNode;
		};
	}
}
