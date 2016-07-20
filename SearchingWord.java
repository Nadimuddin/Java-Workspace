package com.bridgelabz.main;
import com.bridgelabz.utility.Utility;
class SearchingWord
{
	public static void main(String arg[]) throws Exception
	{
		int i,size,index;
		String word;
		
		Utility u = new Utility();
		String word_list[] = {"word","black","earth","bridge","board","color","student","job","mobile","program","software","animal"};
		
		size = word_list.length;
		System.out.println("Given list of words-->");
		for(i=0; i<size; i++)
			System.out.print(word_list[i]+" ");
		System.out.println("\nEnter word to search");
		word = u.getStringInput();
		index = u.binarySearchString(word_list,word);
		if(index == -1)
			System.out.println(word+" word not found");
		else
			System.out.println(word+" is found at position "+index);
		
	}
}
