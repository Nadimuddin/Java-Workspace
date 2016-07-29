package com.bridgelabz.utility;
public class Queue<T >
{	
		
	int arr[],size,rear,front,i;
	char word[];
	Object obj[];
	public Queue(int size)
	{
		this.size = size;
		obj = new Object[size];
		rear = -1;
		front = -1;
	}
	public void add(T data)
	{
		if(front == size-1)
			System.out.println("Queue is full!");
		else
		{
			if(isEmpty())
			{
				obj[++rear] = data;
				front = rear;
			}
			else
			{
				for(i=front; i>=0; i--)
					obj[i+1] = obj[i];
				obj[rear] = data;
				front++;
			}
		}
	}
	public void remove()
	{
		if(isEmpty())
			System.out.println("Queue is empty!");
		else 
			front--;
		if(front == -1)
			rear = front;
	}
	public void display()
	{
		System.out.print("rear->");
		for(i=0; i<=front; i++)
		{
			System.out.print(obj[i]+" ");
		}
		System.out.println("<-front");
	}
	public void displayCustomerQueue()
	{
		for(i=0; i<=front; i++)
		{
			System.out.print("P"+obj[i]+" ");
		}
	}
	public boolean checkPalindrome(String str)
	{
		
		for(i=0; i<=front; i++)
			if(str.charAt(i) != obj[i])
				return false;
		return true;
	}
	public boolean isEmpty()
	{
		if(rear == -1 && front==-1)
			return true;
		return false;
	}
}
