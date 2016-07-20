package com.bridgelabz.main;
import com.bridgelabz.utility.Utility;
public class InsertionSort
{
	public static void main(String arg[])throws Exception
	{
		int size,arr[],i;
		
		Utility u = new Utility();
		System.out.println("Enter size of an array");	//get size of array
		size = u.getIntegerInput();
		arr = new int[size];
		System.out.println("Enter elements:");
		for(i=0; i<size; i++)
			arr[i] = u.getIntegerInput();	//Take array of unsorted numbers
		u.insertionSort(arr);
		System.out.println("Sorted array-->");
		for(i=0; i<size; i++)
			System.out.print(arr[i]+"\t");		//Print sorted array
		System.out.print("\n");
	}
}
