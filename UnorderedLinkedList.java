package com.bridgelabz.main;
import com.bridgelabz.utility.Utility;
import com.bridgelabz.utility.LinkedList;
class UnorderedLinkedList
{
	int choice,index;
	String data;

	UnorderedLinkedList()throws Exception
	{
		Utility u = new Utility();
		LinkedList<String> ll = new LinkedList<>();
		System.out.println("***************   Unordered Linked List    ***************");
		System.out.println("1. Add item\n2. Remove item\n3. Search item\n4. Display list\n5.exit");
		while(choice != 5)
		{
			System.out.println("Enter your choice:");
			choice = u.getIntegerInput();
			switch(choice)
			{
				case 1:
				System.out.print("Enter data to add: ");
				ll.add(u.getStringInput());
				System.out.println("data added");
				break;
				case 2:
				System.out.print("Enter data to remove: ");
				data = u.getStringInput();
				if(ll.searchData(data))
					ll.removeData(data);
				else
					System.out.println("Data not found in the list");
				break;
				case 3:
				System.out.println("Enter item to search");
				index = ll.searchDataIndex(u.getStringInput());
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

	public static void main(String arg[])throws Exception
	{
		new UnorderedLinkedList();
	}
}
