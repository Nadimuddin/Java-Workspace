package com.bridgelabz.main;
public class Powerof2
{
	public static void main(String arg[])
	{
		int number,power=1;

		//take input from command line argument
		number = Integer.parseInt(arg[0]);
		for(int i=0; i<number; i++)
		{
			for(int j=0; j<=i;j++)
				power = power*2;	//Multiply by 2 till n
			System.out.println(power);
			power=1;
		}
	}
}
