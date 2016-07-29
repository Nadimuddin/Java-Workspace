package com.bridgelabz.main;
import com.bridgelabz.utility.Utility;
import com.bridgelabz.utility.Queue;
class Palindrome
{
	Utility u = new Utility();
	Queue<Character> q;
	String str;
	int i;
	Palindrome()throws Exception
	{
		System.out.println("Enter the string");
		str = u.getStringInput();
		q = new Queue(str.length());
		for(i=0; i<str.length(); i++)
			q.add(str.charAt(i));
		if(q.checkPalindrome(str))
			System.out.println(str+" is palindrome");
		else
			System.out.println(str+" is not palindrome");
		//q.display();
	}
	public static void main(String arg[])throws Exception
	{
		new Palindrome();
	}
}
