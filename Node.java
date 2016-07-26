package com.bridgelabz.utility; 
class Node<T>
{
	T data;
	Node next;

	public Node()
	{}
	public Node(T dataValue)
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
