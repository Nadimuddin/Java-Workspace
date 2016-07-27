package com.bridgelabz.main;
import com.bridgelabz.utility.Utility;
import com.bridgelabz.utility.Stack;
class StackDemo
{
	public static void main(String args[])throws Exception
	{
		Utility u = new Utility();
		int choice=0;
		
		Stack stack = new Stack(10);
		System.out.println("**********     Stack Demo     **********");
		System.out.println("1. push\n2. pop\n3. peak\n4. display stack\n5. get size\n6. exit");
		while(choice != 6)
		{
			System.out.print("Enter your choice: ");
			choice = u.getIntegerInput();
			switch(choice)
			{
				case 1:
				System.out.print("Enter data to push: ");
				stack.push(u.getStringInput());
				break;
				case 2:
				stack.pop();
				break;
				case 3:
				System.out.println(stack.peak()+" <-peak");
				break;
				case 4:
				stack.displayStack();
				break;
				case 5:
				System.out.println("under construction");
				break;
				case 6:
				System.exit(0);
				break;
				default:
					System.out.println("Wrong choice selected!");
				break;
			}
		}
	}
}
