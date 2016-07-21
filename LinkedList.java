package com.bridgelabz.utility;
public class LinkedList
{
	MyNode head;
	MyNode temp;
	public void add(String data)
	{
		head = new MyNode();
		//head = new MyNode(data);
		/*if(head == null)
			Node head =new Node(data);
		else
		{
			Node temp = new Node(data);
			head.setNext(temp);
		}*/
	}
}
class MyNode
{
	String data;
	Node next;

	public void Node()
	{}
	void MyNode(String dataValue)
	{
		data = dataValue;
		next = null;
	}
	public void setNext(Node nextValue)
	{
		next = nextValue;
	}
}
