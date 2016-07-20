package com.bridgelabz.main;
import com.bridgelabz.utility.Utility;
public class ReplaceString{

	public static void main(String args[]) throws Exception
	{
		String str,modified,username;
		Utility u = new Utility();
		
		str="Hello <<username>> ,How are you?";
		System.out.println("Original string-> "+str);
		
		do{
			System.out.println("Enter the Username (minimum 3 characters)");
			username = u.getStringInput();
		}
		while(username.length() < 3);
		modified = str.replace("<<username>>", username);
		System.out.println("Modified string-> "+modified);
	}
}
