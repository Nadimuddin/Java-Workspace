package com.bridgelabz.utility;
import com.bridgelabz.utility.Node;
public class LinkedList
{
	Node head;
	Node temp;
	String data;
	public void add(String data)
	{
		if(head == null)
		{
			head =new Node(data);
		}
		else
		{
			Node current = head;
			temp = new Node(data);
			if(head != null)
			{
				while(current.getNext() != null)
				{
					current = current.getNext();
				}
				current.setNext(temp);
			}
		}
	}

	public void printAllData()
	{
		Node current = head;
		if(head == null)
			System.out.println("List is empty");
		else
		{
			while(current != null)
			{
				System.out.print(current.data+"->");
				current = current.getNext();
			}
			System.out.println(current);
		}
	}

	public boolean searchData(String str)
	{
		Node current = head;
		if(head == null)
			System.out.println("List is empty");
		else
		{
			while(current != null)
			{
				if(current.data.equals(str))
					return true;
				current = current.getNext();
			}
			if(current == null)
				return false;
		}
		return false;
	}

	public void removeData(String str)
	{
		Node current = head;
		if(head == null)
			System.out.println("List is empty");
		else
		{
			while(current != null)
			{
				if(head.data.equals(str))
				{
					head = head.getNext();
					return;
				}
				else if(current.getNext().data.equals(str))
				{
						current.setNext(current.getNext().getNext());
						return;
				}
				/*if(current.data.equals(str))
				{
					if(current == head)
						head = head.getNext();
					else
						
				}*/
				current = current.getNext();
			}
			if(current == null)
				return;
		}
	}
}
/*class Node
{
	String data;
	Node next;

	public Node()
	{}
	public Node(String dataValue)
	{
		data = dataValue;
		next = null;
	}
	public void setNext(Node nextValue)
	{
		next = nextValue;
	}
	public Node getNext()
	{
		return next;
	}
}*/
