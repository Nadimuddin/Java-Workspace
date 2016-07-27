package com.bridgelabz.main;
import com.bridgelabz.utility.Utility;
import com.bridgelabz.utility.LinkedList;
class OrderedLinkedList
{
	int choice,index;
	int data;

	OrderedLinkedList()throws Exception
	{
		Utility u = new Utility();
		LinkedList<String> ll = new LinkedList<>();
		System.out.println("***************   Ordered Linked List    ***************");
		System.out.println("1. Add item\n2. Remove item\n3. Search item\n4. Display list\n5.exit");
		while(choice != 5)
		{
			System.out.println("Enter your choice:");
			choice = u.getIntegerInput();
			switch(choice)
			{
				case 1:
				System.out.print("Enter data to add: ");
				ll.add(u.getIntegerInput());
				System.out.println("data added");
				break;
				case 2:
				System.out.print("Enter data to remove: ");
				data = u.getIntegerInput();
				if(ll.searchData(data))
					ll.removeData(data);
				else
					System.out.println("Data not found in the list");
				break;
				case 3:
				System.out.println("Enter item to search");
				index = ll.searchDataIndex(u.getIntegerInput());
				if(index==-1)
					System.out.println("Data not found");
				else
				System.out.println("Data found at "+index+" index");
				break;
				case 4:
				ll.displayData();
				break;
				case 5:
				System.exit(0);
				break;
				default:
				System.out.println("Wrong input");
				System.exit(0);
				break;
			}
		}
	}
	public static void main(String args[])throws Exception
	{
		new OrderedLinkedList();
	}
}
