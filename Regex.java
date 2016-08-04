package com.bridgelabz.utility;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Regex
{
	Matcher match;
	Pattern pat;
	public String findPattern(String pattern, String string)
	{
		match = Pattern.compile(pattern).matcher(string);
		match.find();
		return match.group();
	}
}
