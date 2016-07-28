package com.bridgelabz.utility;
public class Queue<T>
{
	int arr[],size,rear,front,i;
	public Queue(int size)
	{
		this.size = size;
		arr = new int[size];
		rear = -1;
		front = -1;
	}
	public void add(int data)
	{
		if(front == size-1)
			System.out.println("Queue is full!");
		else
		{
			if(isEmpty())
			{
				arr[++rear] = data;
				front = rear;
			}
			else
			{
				for(i=front; i>=0; i--)
					arr[i+1] = arr[i];
				arr[rear] = data;
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
	}
	public void display()
	{
		System.out.print("rear->");
		for(i=0; i<=front; i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println("<-front");
	}
	public void displayCustomerQueue()
	{
		for(i=0; i<=front; i++)
		{
			System.out.print("P"+arr[i]+" ");
		}
	}
	public boolean isEmpty()
	{
		if(front==-1)
			return true;
		return false;
	}
}
