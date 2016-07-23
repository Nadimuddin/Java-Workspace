package com.bridgelabz.utility; 
class Node
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
}
