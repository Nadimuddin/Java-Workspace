package com.bridgelabz.utility;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.FileReader;
import java.util.Scanner;
import java.util.Arrays;
public class Utility
{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public int getIntegerInput()
	{
		int num=0;
		try{
			num = Integer.parseInt(br.readLine());
		}
		catch(Exception e){
			System.out.println("IO Error you have provide wrong type of input");
		}
		return num;
	}
	
	public double getDoubleInput()
	{
		double num=0;
		try{
			num = Double.parseDouble(br.readLine());
		}
		catch(Exception e){
			System.out.println("IO Error you have provide wrong type of input");
		}
		return num;
	}
	
	public char getCharacterInput()throws Exception
	{
		return br.readLine().charAt(0);
	}
	
	public String getStringInput()throws Exception
	{
		return br.readLine();
	}
	
	public void pressingEnter()
	{
		Scanner scan = new Scanner(System.in);
		scan.nextLine();
	}
	
	public int binarySearch(int arr[], int target)
	{
		int low=0,high=arr.length-1,mid,index=-1;
		while(low<=high)
		{
			mid = (low+high)/2;
			System.out.println("mid = "+mid);
			if(arr[mid] == target)
				return index = mid;
			else
			{
				if(target < arr[mid])
					high = mid-1;
				else
					low = mid+1;
			}
		}
		return index;
	}
	
	public int binarySearchString(String wordList[], String target)
	{
		int low=0,high=wordList.length-1,mid,index=-1,i;
		Arrays.sort(wordList);
		System.out.println("Soretd List");
		for(i=0; i<wordList.length; i++)
			System.out.print(wordList[i]+" ");
		System.out.println("\n");
		while(low<=high)
		{
			mid = (low+high)/2;
			target.trim();
			if(target.equals(wordList[mid]))
				return index = mid;
			else
			{
				if(compareWordAlphabetically(target,wordList[mid]) == -1)
					high = mid-1;
				else if(compareWordAlphabetically(target,wordList[mid]) == 1)
					low = mid+1;
			}
		}
		return index;
	}
	
	public int searchingWordInArray(String wordList[], String target)
	{
		int i,index=-1;
		for(i=0; i<wordList.length; i++)
		{
			if(wordList[i].equals(target))
				return index = i;
		}
		return index;
	}
	
	public int compareWordAlphabetically(String str1, String str2)
	{
		String str = "abcdefghijklmnopqrstuvwxyz";
		int i,index1,index2;
		char c1,c2;
		int flag=1;
		for(i=0; i<str1.length() || i<str2.length(); i++)
		{
			if(i>=str1.length())
				return flag = -1;
			else if(i>=str2.length())
				return flag = 1;
			else
			{
				c1 = str1.charAt(i);
				c2 = str2.charAt(i);
				index1 = str.indexOf(c1);
				index2 = str.indexOf(c2);
				if(index1<index2)
					return flag = -1;
				else if(index1>index2)
					return flag = 1;
			}
		}
		return flag;
	}
	
	public String[] sortingOfWords(String words[])
	{
		int i,j;
		String temp;
		for(i=0; i<words.length; i++)
		{
			j=0;
			while(j<words.length-1)
			{
				if(compareWordAlphabetically(words[j], words[j+1]) == 1)
				{
					temp = words[j];
					words[j]= words[j+1];
					words[j+1] = temp;
				}
				j++;
			}
		}
		return words;
	}
	
	public int[] insertionSort(int array[])
	{
		int i,j,k,temp;
		for(k=0; k<array.length; k++)
		{
			i=k;
			j=i+1;
			while(i>=0 && j<array.length)
			{
				if(array[i]>array[j])
				{			
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
				i--;
				j--;
			}
		}
		return array;
	}
	
	public int[] bubbleSort(int arr[])
	{
		int i,j,size,temp;
		size=arr.length;
		for(i=0; i<size;i++)
		{
			j=0;
			while(j<size-1)
			{
				if(arr[j]>arr[j+1])
				{
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
				j++;
			}
		}
		return arr;
	}
	
	public int[] readIntArray(int size)
	{
		int i,arr[] = new int[size];
		for(i=0; i<size; i++)
			arr[i] = getIntegerInput();
		return arr;
	}
	
	public int[][] read2DIntArray(int row, int col)
	{
		int array[][],i,j;
		array = new int[row][col];
		System.out.println("Enter elements:");
		for(i=0; i<row; i++)
			for(j=0; j<col; j++)
				array[i][j] = getIntegerInput();
		return array;
	}
	
	public double[][] read2DDoubleArray(int row, int col)
	{
		double array[][];
		int i,j;
		array = new double[row][col];
		for(i=0; i<row; i++)
			for (j=0; j<col; j++)
				array[i][j] = getDoubleInput();
		return array;
	}
	
	public boolean isAnagram(String str1, String str2)
	{
		boolean flag;
		int count = 0;
		for(int i=0; i<str1.length(); i++)
		{
			for(int j=0; j<str2.length(); j++)
			{
				if(str1.charAt(i) == str2.charAt(j))
				{
					count++;
				}
			}
		}
		if(count == str1.length())
			flag = true;
		else
			flag = false;
		return flag;
	}

	public boolean isLeapYear(int year)
	{
		boolean flag = false;
		if(year%4 == 0)
			flag = true;
		else
			flag = false;
		return flag;
	}
}
