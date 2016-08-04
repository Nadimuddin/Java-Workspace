package com.bridgelabz.main;
import com.bridgelabz.utility.Regex;
import com.bridgelabz.utility.Utility;
class RegexDemo
{
	Regex regx = new Regex();
	Utility u = new Utility();
	String name,fullname,cont_no,date,message;
	RegexDemo()throws Exception
	{
		StringBuffer buffer = new StringBuffer();
		buffer.append("Hello <user>,");
		buffer.append(" We have your full name as <full name> in our system. ");
		buffer.append("Your contact number is 91-xxxxxxxxxx. ");
		buffer.append("Please, let us know in case of any clarification. ");
		buffer.append("Thank you.");
		buffer.append("\nBridgeLabz.");
		buffer.append("\nxx/xx/xxxx");
		
		message = new String(buffer);		
		System.out.println("*****  Original message  *****\n"+message);
		
		//match <user> pattern in the message
		name = regx.findPattern("\\<\\w+\\>",message);
		
		//match <full name> pattern in the message
		fullname = regx.findPattern("\\<\\w+\\s\\w+\\>",message);
		
		//match 91-xxxxxxxxxx(i.e. contact no.) pattern in the message
		cont_no = regx.findPattern("\\d+\\-\\w+",message);
		
		//match xx/xx/xxxx(i.e. date) pattern in the message
		date = regx.findPattern("\\w+\\/\\w+\\/\\w+",message);
		
		/*
		* get all the pattern which we have matched
		* and replace them with our string
		*/
		System.out.print("Enter your name: ");
		message = message.replace(name,u.getStringInput());
		
		System.out.print("Enter your full name: ");
		message = message.replace(fullname,u.getStringInput());
		
		System.out.print("Enter contact No. in the format 91-xxxxxxxxxx: ");
		message = message.replace(cont_no,u.getStringInput());
		
		System.out.print("Enter date in the format xx/xx/xxxx: ");
		message = message.replace(date,u.getStringInput());
		
		/*
		* Print modified message
		*/
		System.out.println("\n*****  Modified message  *****\n"+message);
	}
	
	public static void main(String arg[])throws Exception
	{
		new RegexDemo();
	}
}
