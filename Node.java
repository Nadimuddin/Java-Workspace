package Utility;
public class Node
{
	int data;
	Object head;
	public void add(Object data)
	{
		if(head == null)
		{
			System.out.println("head was null");
			head = data;
		}
		else
			System.out.println("head is not null");
		
/*		this.data = data;
		nptr = this.data;
		return nptr;*/
	}
}
