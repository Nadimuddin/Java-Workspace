package com.bridgelabz.main;
import com.bridgelabz.utility.Utility;
import com.bridgelabz.utility.LinkedList;
class LinkedListMain
{
    int choice,index;
    String data;

	LinkedListMain()throws Exception
	{
        Utility u = new Utility();
        LinkedList<String> ll = new LinkedList();
		System.out.println("***************    Linked List    ***************");
		System.out.println("1. Add item\n2. Add at specific position\n3. Remove item\n4. Remove item from specific position\n5. Search item\n6. Display list\n7.exit");
        while(choice != 7)
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
                    System.out.println("Option under construction");
                break;
                case 3:
                    System.out.print("Enter data to remove: ");
                    data = u.getStringInput();
                    if(ll.searchData(data))
                        ll.removeData(data);
                    else
                        System.out.println("Data not found in the list");
                break;
                case 4:
                    System.out.println("Option under construction");
                break;
                case 5:
                    System.out.println("Enter item to search");
                    index = ll.searchDataIndex(u.getStringInput());
                    System.out.println("Data found at "+index+" index");
                    
                break;
                case 6:
                    ll.displayData();
                break;
                case 7:
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
		new LinkedListMain();
	}
}
