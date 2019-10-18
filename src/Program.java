import java.io.Console;

public class Program {
	public static void main(String[] args) {
		LinkedList list = new LinkedList(4);
		list.insertSorted(2);
		list.insertSorted(5);
		list.insertSorted(89);
		list.insertSorted(56);
		int i= list.getSize();
		System.out.print(i);
		
	}
}
