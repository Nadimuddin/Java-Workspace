package com.bridgelabz.main;
import com.bridgelabz.utility.Stack;
import com.bridgelabz.utility.Utility;
class BalancedParentheses
{
	public static void main(String arg[])throws Exception
	{
		Utility u = new Utility();
		Stack<Character> stack;
		int i;
		
		System.out.println("Enter expression:");
		String exp = u.getStringInput();
		stack = new Stack(exp.length());
		for(i=0; i<exp.length(); i++)
		{
			if(exp.charAt(i) == '(')
				stack.push('(');
			else if(exp.charAt(i) == ')')
				stack.pop();
		}
		if(stack.isEmpty())
			System.out.println("Expression is balanced");
		else
			System.out.println("Expression is not balanced");
	}
}
