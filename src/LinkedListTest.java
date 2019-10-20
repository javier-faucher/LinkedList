import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * 
 */

/**
 * @author javie
 *
 */
class LinkedListTest {
	@Test
	void constructorNoParamTest() {
		LinkedList list = new LinkedList();
		assertTrue(list.startNode==null);
	}
	
	@Test
	void constructorWithParamTest() {
		LinkedList list = new LinkedList(2);
		assertTrue(list.startNode.getValue()==2);
		assertTrue(list.getSize()==1);
		assertTrue(list.startNode.nextNode==null);
	}
	
	@Test
	void insertSingleValueIncreasesListSizeTest() {
		LinkedList list = new LinkedList(6);
		list.insertSorted(7);
		assertTrue(list.getSize()==2);
		list.insertSorted(90);
		assertTrue(list.getSize()==3);
	}
	@Test
	void insertSortedInsertsAtCorrectPositionTest() {
		LinkedList list = new LinkedList(15); // list {15}
		list.insertSorted(5);//list {5,15}
		assertTrue(list.startNode.getValue()==5);// test for insert at start of list 
		list.insertSorted(7);//list {5,7,15}
		assertTrue(list.startNode.nextNode.getValue()==7);// test for insert in middle of list
		list.insertSorted(20);// list {5,7,15,20}
		assertTrue(list.startNode.nextNode.nextNode.nextNode.getValue()==20);//test for insert at end of list		
	}
	
	@Test
	void insertSortedNegativeValueTest() {
		LinkedList list = new LinkedList (7);
		list.insertSorted(-3);// list {-3,7}
		assertTrue(list.getSize()==2);
		assertTrue(list.startNode.getValue()==-3);
		list.insertSorted(-2);// list{-3,-2,7}
		assertTrue(list.startNode.nextNode.getValue()==-2);
		
	}

	@Test
	void test() {
		fail("Not yet implemented");
	}

}
