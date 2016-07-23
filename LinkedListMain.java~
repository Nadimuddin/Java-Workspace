package com.bridgelabz.main;
import com.bridgelabz.utility.Utility;
import com.bridgelabz.utility.LinkedList;
import com.bridgelabz.utility.ReadFile;
import com.bridgelabz.utility.WriteFile;
class LinkedListMain
{
	public static void main(String arg[]) throws Exception
	{
		String str,word[],search;
		int i;	
		Utility u = new Utility();
		LinkedList list = new LinkedList();
		ReadFile read = new ReadFile();
		WriteFile write = new WriteFile();
		str = read.readFile("DemoFile.txt");
		word = str.split(" ");
		
		for(i=0; i<word.length; i++)
		{
			list.add(word[i]);
			System.out.println(word[i]+" added to list");
		}
		System.out.println("\n");
		
		list.printAllData();
		System.out.println("Enter data to search");
		search = u.getStringInput();
		if(list.searchData(search))
		{
			System.out.println(search+" word found and will delete from the file");
			list.removeData(search);
			System.out.println("List after deletion:");
			list.printAllData();
			if(u.searchingWordInArray(word, search) == word.length-1)
				str = str.replace(search, "");
			else
				str = str.replace(search+" ", "");
			write.writeFile("DemoFile.txt", str);
		}
		else
		{
			System.out.println("word not found & will append to the file");
			System.out.println("List after insertion:");
			list.printAllData();
			str = str+" "+search;
			write.writeFile("DemoFile.txt", str);
		}
	}
}
