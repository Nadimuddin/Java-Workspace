package com.bridgelabz.main;
import com.bridgelabz.utility.Utility;
class SumOfThree
{
	public static void main(String arg[])throws Exception
	{
		Utility u = new Utility();
		int a[],size,i,j,k,count=0;
		System.out.println("Enter the size of array");
		size = u.getIntegerInput();
		a = new int[size];
		System.out.println("Enter elements in array");
		for(i=0;i<size;i++)
			a[i] = u.getIntegerInput();
		for(i=0;i<size;i++)
			for(j=i+1;j<size;j++)
				for(k=j+1;k<size;k++)
					if((a[i]+a[j]+a[k]) == 0)
					{
						count++;
						System.out.println("\n\n"+count+". "+a[i]+"+("+a[j]+")+("+a[k]+")="+(a[i]+a[j]+a[k]));
					}
		if(count == 0)
			System.out.println("There are no such distinct triples");
	}
}
