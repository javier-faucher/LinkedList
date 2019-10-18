
public class Node {
	public Node(int p_value) {
		value=p_value;
	}
	int value;
	Node nextNode;
	
	public int getSize(int count) {
		if (nextNode!=null) {
			count=nextNode.getSize(count);
		}
		return count+1;
	}
	
	public Node insertSorted(int n) {
		
		if (n>value) {
			if(nextNode!=null) {
				Node newNode= nextNode.insertSorted(n);
				if ( newNode!=null) {
					nextNode=newNode;
				};
				return null;
			}else {
				nextNode= new Node(n);
				return null;
			}
		}else {
			Node newNode= new Node(n);
			newNode.nextNode=this;
			return newNode;
		}
	}
}
