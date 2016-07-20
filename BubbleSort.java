package com.bridgelabz.main;
import com.bridgelabz.utility.Utility;
public class BubbleSort
{
	public static void main(String arg[])
	{
		Utility u = new Utility();
		int size,i,arr[];
		System.out.println("Enter size of array:");
		size = u.getIntegerInput();		//get size of array
		arr = new int[size];
		System.out.println("Enter elements in array");
		for(i=0; i<size; i++)
			arr[i] = u.getIntegerInput();	//Take array of unsorted numbers
		u.bubbleSort(arr);
		System.out.println("Sorted array");
			for(i=0; i<size; i++)
				System.out.println(arr[i]+"\t");	//Print sorted array
	}
}
