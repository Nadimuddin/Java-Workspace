package com.bridgelabz.main;
import com.bridgelabz.utility.Utility;
public class LeapYear
{
	public static void main(String args[])throws Exception
	{
		Utility u = new Utility();
		int year=0;
		String str="";
		do
		{
			System.out.println("Enter the year");

			//Take year as input
			str = u.getStringInput();		
			year = Integer.parseInt(str);	
		}

		//while loop to again ask for input if it's length is less than 4
		while(str.length() <4 || str.length()>4);
			if(u.isLeapYear(year))
				System.out.println("Entered year is leap year");
			else
				System.out.println("Entered year is not leap year");
	}
}
