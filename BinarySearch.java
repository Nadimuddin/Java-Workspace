package com.bridgelabz.main;
import com.bridgelabz.utility;
class BinarySearch
{
	public static void main(String arg[]) throws Exception
	{
        Utility u = new Utility();

		//Defining array of numbers
		int arr[]={1, 5, 16, 25, 29, 39};
		
		int i,num,index;
		System.out.println("Given array-->");
		
		/*
		*	Print defined array	*/
		for(i=0; i<arr.length; i++)
			System.out.print(arr[i]+"\t");
		System.out.println("\nEnter No. to find");
		
		//Take number to find
		num = u.getIntegerInput();
		
		//Perform binary search to find it
		index = u.binarySearch(arr,num);
		
		if(index == -1)
			System.out.println("Number not found");
		else
			System.out.println("Number found at "+index+" position");
	}
}
