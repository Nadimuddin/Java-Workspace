public class CrunchifyLinkedListTest {
	public static CrunchifyLinkedList crunchifyList;
 
	public static void main(String[] args)
	{
 
		// Default constructor - let's put "0" into head element.
		crunchifyList = new CrunchifyLinkedList();
 
		// add more elements to LinkedList
		crunchifyList.add("1");
		crunchifyList.add("2");
		crunchifyList.add("3");
		crunchifyList.add("4");
		crunchifyList.add("5");
 
		/*
		 * Please note that primitive values can not be added into LinkedList directly. They must be converted to their
		 * corresponding wrapper class.
		 */
 
		System.out.println("Print: crunchifyList: \t\t" + crunchifyList);
		/*System.out.println(".size(): \t\t\t\t" + crunchifyList.size());
		System.out.println(".get(3): \t\t\t\t" + crunchifyList.get(3) + " (get element at index:3 - list starts from 0)");
		System.out.println(".remove(2): \t\t\t\t" + crunchifyList.remove(2) + " (element removed)");
		System.out.println(".get(3): \t\t\t\t" + crunchifyList.get(3) + " (get element at index:3 - list starts from 0)");
		System.out.println(".size(): \t\t\t\t" + crunchifyList.size());
		System.out.println("Print again: crunchifyList: \t" + crunchifyList);*/
	}
 
}

class CrunchifyLinkedList
{
	private static int counter;
	private Node head;
	
	// Default constructor
	public CrunchifyLinkedList() {
		System.out.println("Default constructor");
 
	}

	public void add(Object data)
	{
 
		// Initialize Node only incase of 1st element
		if (head == null)
		{
			head = new Node(data);
		}
 
		Node crunchifyTemp = new Node(data);
		Node crunchifyCurrent = head;
 
		// Let's check for NPE before iterate over crunchifyCurrent
		if (crunchifyCurrent != null)
		{
 
			// starting at the head node, crawl to the end of the list and then add element after last node
			while (crunchifyCurrent.getNext() != null)
			{
				crunchifyCurrent = crunchifyCurrent.getNext();
			}
 
			// the last node's "next" reference set to our new node
			crunchifyCurrent.setNext(crunchifyTemp);
		}
 
		// increment the number of elements variable
		incrementCounter();
	}

	private static void incrementCounter() {
		counter++;
	}
	
	private class Node
	{
		// reference to the next node in the chain, or null if there isn't one.
		Node next;
 
		// data carried by this node. could be of any type you need.
		Object data;

		// Node constructor
		public Node(Object dataValue)
		{
			next = null;
			data = dataValue;
		}

		public Node getNext() {
			return next;
		}

		public void setNext(Node nextValue) {
			next = nextValue;
		}
	}
}
