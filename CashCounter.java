package com.bridgelabz.main;
import com.bridgelabz.utility.Utility;
import com.bridgelabz.utility.Queue;
class CashCounter
{
	int option=0,value=0,op;
	
	//declare an account balance of Rs. 50000
	int balance=50000;
	
	Utility u = new Utility();
	
	/*
	*	create object of library class Queue
	*	it will create a queue of specific size
	*/
	Queue<Integer> q = new Queue(5);
	
	CashCounter()
	{
		System.out.println("*****   Queue System for Cash Counter in Bank   *****");
		System.out.println("\t1.Enter customer\n\t2.Process customer\n\t3.Exit program");
		while(option != 4)
		{
			System.out.print("Enter your option ");
			option = u.getIntegerInput();
			switch(option)
			{
				case 1:
				//add customer to the queue
				q.add(++value);
				q.displayCustomerQueue();
				System.out.println("->[cash balance="+balance+"]");
				break;
				case 2:
				if(q.isEmpty())
					System.out.println("No any customer to process");
				else
				{
					transaction();
					
					//after processing customer remove him/her from queue
					q.remove();
					
					q.displayCustomerQueue();
					System.out.println("->[cash balance="+balance+"]");
				}
				break;
				case 3:
				System.exit(0);
				break;
				default:
				System.out.println("Invalid option selected");
				break;
			}
		}
	}
	
	/*
	*transaction method to calculate ledger balance in the account
	*after servicing the customer
	*/	
	void transaction()
	{
		System.out.println("1.Deposit\n2.Withdraw\nEnter your option");
		op = u.getIntegerInput();
		System.out.print("Enter amount: ");
		if(op == 1)
		{
			balance = balance + u.getIntegerInput();
		}
		else if(op == 2)
		{
			balance = balance - u.getIntegerInput();
		}
		System.out.println("Account balance after transaction"+balance);
	}
	public static void main(String arg[])
	{
		new CashCounter();
	}
}
