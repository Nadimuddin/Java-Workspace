package com.bridgelabz.main;
import com.bridgelabz.utility;
class BinarySearch
{
	public static void main(String arg[]) throws Exception
	{
        	Utility u = new Utility();
		int arr[]={1, 5, 16, 25, 29, 39};	//Defining array of numbers
		int i,num,index;
		System.out.println("Given array-->");
		for(i=0; i<arr.length; i++)			//Print defined array
			System.out.print(arr[i]+"\t");
		System.out.println("\nEnter No. to find");
		num = u.getIntegerInput();			//Take number to find
		index = u.binarySearch(arr,num);	//Perform binary search to find it
		if(index == -1)
			System.out.println("Number not found");
		else
			System.out.println("Number found at "+index+" position");
	}
}
