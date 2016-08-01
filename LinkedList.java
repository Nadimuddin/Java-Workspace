package com.bridgelabz.utility;
import com.bridgelabz.utility.Node;
public class LinkedList<T>
{
	Node head;
	Node temp;
	T data;
	public void add(int num)
	{
		Node<Integer> head = this.head;
		Node<Integer> previous = this.head;
		Node<Integer> next;// = previous.getNext();
		temp = new Node(num);
		if(this.head == null)
			this.head = new Node(num);
		else if(head.data > num)
		{
			this.head = temp;
			temp.setNext(previous);
		}
		else
		{
			next = previous.getNext();
			while(previous.getNext() != null)
			{
				if(previous.data < num && num < next.data)
				{
					previous.setNext(temp);
					temp.setNext(next);
					break;
				}
				previous = previous.getNext();
				next = next.getNext();
			}
			if(previous.getNext() == null)
				previous.setNext(temp);
		}
	}
	public <T>void add(T data)
	{
		if(head == null)
		{
			head = new Node(data);
		}
		else
		{
			Node current = head;
			temp = new Node(data);
			if(head != null)
			{
				while(current.getNext() != null)
					current = current.getNext();
				current.setNext(temp);
			}
		}
	}

	public void addAtAppropriatePosition(int num)
	{
		Node<Integer> head = this.head;
		Node<Integer> previous = this.head;
		Node<Integer> next = previous.getNext();
		temp = new Node(num);
		if(head.data > num)
		{
			this.head = temp;
			temp.setNext(previous);
		}
		else
		{
			while(previous.getNext() != null)
			{
				if(previous.data < num && num < next.data)
				{
					previous.setNext(temp);
					temp.setNext(next);
					break;
				}
				previous = previous.getNext();
				next = next.getNext();
			}
			if(previous.getNext() == null)
				previous.setNext(temp);
		}
	}

	//public void add(T data, int pos)

	public void displayData()
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
	
	public String getAllData()
	{
		String list="";
		Node current = head;
		if(head == null)
			System.out.println("List is empty");
		else
		{
			while(current != null)
			{
				list = list+current.data.toString()+" ";
				//System.out.print(current.data+"->");
				current = current.getNext();
			}
			//System.out.println(current);
		}
		//System.out.println(list);
		return list;
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
	
	public boolean searchData(int num)
	{
		Node current = head;
		if(head == null)
			System.out.println("List is empty");
		else
		{
			while(current != null)
			{
				if(current.data == num)
					return true;
				current = current.getNext();
			}
			if(current == null)
				return false;
		}
		return false;
	}
	public int searchDataIndex(String str)
	{
		int index = -1;
		int i=0;
		Node current = head;
		if(head == null)
			System.out.println("List is empty");
		else
		{
			while(current != null)
			{
				if(current.data.equals(str))
					return index = i;
				current = current.getNext();
				i++;
			}
			if(current == null)
				return -1;
		}
		return index;
	}

	public int searchDataIndex(int num)
	{
		int index = -1;
		int i=0;
		Node current = head;
		if(head == null)
			System.out.println("List is empty");
		else
		{
			while(current != null)
			{
				if(current.data == num)
					return index = i;
				current = current.getNext();
				i++;
			}
			if(current == null)
				return -1;
		}
		return index;
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
				current = current.getNext();
			}
			if(current == null)
				return;
		}
	}
	
	public void removeData(int num)
	{
		Node current = head;
		if(head == null)
			System.out.println("List is empty");
		else
		{
			while(current != null)
			{
				if(head.data == num)
				{
					head = head.getNext();
					return;
				}
				else if(current.getNext().data == num)
				{
						current.setNext(current.getNext().getNext());
						System.out.println("data removed");
						return;
				}
				current = current.getNext();
			}
			if(current == null)
				return;
		}
	}
}
