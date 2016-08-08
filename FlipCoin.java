package com.bridgelabz.main;
import com.bridgelabz.utility.Utility;
public class FlipCoin
{
	public static void main(String args[])
	{
		Utility u = new Utility();
		int n;
		float head=0,tails=0;
		double ran;
		float percent_head,percent_tails;
		
		System.out.println("Enter the number of times to flip coin");
		n = u.getIntegerInput();
		for(int i=0; i<n; i++)
		{
			if(Math.random() <0.5)
				tails++;
			else
				head++;
		}
		percent_head = (head*100)/n;
		percent_tails = (tails*100)/n;
		System.out.println("Percentage of head-> "+percent_head+
				 			"\nPercentage of tails-> "+percent_tails);
	}
}
