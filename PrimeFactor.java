package com.bridgelabz.main;
import com.bridgelabz.utility.Utility;
class PrimeFactor
{
	public static void main(String arg[])throws Exception
	{
		Utility u = new Utility();
		int i,num,p[];

		System.out.println("enter number to find prime factor of it");
		num = u.getIntegerInput();	//get input
		for(i=2; i<=num;)			//execute loop i=2 to number(input get from user)
		{
			if(num%i == 0)				// if number can be completely divided by i
			{
				System.out.print(i+" ");
				num=num/i;				//store quotient to num
			}
			else if(num == i)
				System.out.println(i);	// if provided input is prime then print as it is
			else
				i++;
		}
		
	}
}
