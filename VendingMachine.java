package com.bridgelabz.main;
import com.bridgelabz.utility.Utility;
class VendingMachine
{
	Utility u = new Utility();
	int change[]={1000,500,100,50,10,5,2,1};
	int i=0,quotient;
	VendingMachine()
	{
		System.out.println("Enter the amount of money: ");
		int money = u.getIntegerInput();
		calculate(money);
	}
	void calculate(int money)
	{
		while(money >= change[i])
		{
			quotient = money/change[i];
			System.out.println(change[i]+" x "+quotient);
			money = money%change[i];
		}
		i++;
		if(money == 0)
			return;
		else
			calculate(money);
	}
	public static void main(String args[])
	{
		new VendingMachine();
	}
}
