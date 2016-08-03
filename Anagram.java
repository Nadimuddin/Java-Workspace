package com.bridgelabz.main;
import com.bridgelabz.utility.Utility;
class Anagram
{
	public static void main(String args[]) throws Exception
	{
		Utility u = new Utility();
		String str1,str2;
		System.out.println("Enter 1st string");

		//Take 1st string
		str1 = u.getStringInput();
		
		//Take 2nd string
		System.out.println("Enter 2nd string");
		str2 = u.getStringInput();			

		//Method to check whether string is Anagram or not
		if(u.isAnagram(str1,str2))
			System.out.println("Strings are anagram");
		else
			System.out.println("Strings are not Anagram");
			
	}
}
