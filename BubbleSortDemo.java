package com.bridgelabz.main;
import com.bridgelabz.utility.Utility;
public class BubbleSortDemo
{
	public static void main(String arg[])
	{
		Utility u = new Utility();
		int size,i,arr[];
		System.out.println("Enter size of array:");
		
		//get size of array
		size = u.getIntegerInput();
		arr = new int[size];
		System.out.println("Enter elements in array");
		
		//get array of unsorted numbers
		for(i=0; i<size; i++)
			arr[i] = u.getIntegerInput();
		
		//call bubble sort method to sort to sort the provided array
		u.bubbleSort(arr);
		
		System.out.println("Sorted array");
		
		//Print sorted array
		for(i=0; i<size; i++)
			System.out.println(arr[i]+"\t");
	}
}
