package com.bridgelabz.main;
import com.bridgelabz.utility.Utility;
class Harmonic
{
	public static void main(String args[]) throws Exception
	{
		Utility u = new Utility();
		int N,i,a[]={1,1},option;
		float b;
		
		System.out.println("Enter Harmonic value");
		N = u.getIntegerInput();		//get harmonic value N
		for(i=1;i<N;i++)
			a = add(a[0],a[1],1,i+1);	//add inverse of series of numbers from 1 to N
		System.out.println("In integer ->  "+a[0]+"/"+a[1]);
		b = (float)a[0]/a[1];
		System.out.println("in decimal ->  "+b);
		
	}
	
	/*Method to calculate Nth value of harmonic series*/
	static int[] add(int nem1,int dem1,int nem2,int dem2) 
	{
		int NumDem[] = new int[2];
		NumDem[0] = (nem1*dem2)+(nem2*dem1);
		NumDem[1] = dem1*dem2;
		return NumDem;
	}
}
