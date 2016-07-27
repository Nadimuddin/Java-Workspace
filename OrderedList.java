package com.bridgelabz.main;
import com.bridgelabz.utility.Utility;
import com.bridgelabz.utility.ReadFile;
import com.bridgelabz.utility.WriteFile;
import com.bridgelabz.utility.LinkedList;
class OrderedList
{
	ReadFile read = new ReadFile();
	WriteFile write = new WriteFile();
	Utility u = new Utility();
	LinkedList ll = new LinkedList();
	String fileContent,words[];
	int array[],i,search;
	public static void main(String args[])throws Exception
	{
		new OrderedList();
	}
	OrderedList()throws Exception
	{
		fileContent = read.readFile("OrderedList");
		System.out.println(fileContent);
		words = fileContent.split(" ");
		array = new int[words.length];
		for(i=0; i < words.length; i++)
			array[i] = Integer.parseInt(words[i]);
		array = u.bubbleSort(array);
		for(i=0; i < array.length; i++)
			ll.add(array[i]);
		System.out.println("created linked list:");
		ll.displayData();
		System.out.print("Enter number to search: ");
		search = u.getIntegerInput();
		if(ll.searchData(search))
		{	
			System.out.println("Data found & will remove from the list");
			System.out.println("Updated List");
			ll.removeData(search);
		}
		else
		{
			System.out.println("Data not found & will insert into the list");
			ll.addAtAppropriatePosition(search);
		}	
		ll.displayData();
		write.writeFile("OrderedList",ll.getAllData());
		//ll.getAllData();
			
	}
}
