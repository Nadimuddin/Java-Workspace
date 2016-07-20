package com.bridgelabz.utility;
import com.bridgelabz.utility.Utility;
import java.io.BufferedReader;
import java.io.FileReader;
public class ReadFile
{
	public String readFileLineByLine()throws Exception
	{
		StringBuilder sb;
		String line,filecontent;

		BufferedReader br = new BufferedReader(new FileReader("DemoFile.txt"));
		sb = new StringBuilder();
		line = br.readLine();
		//System.out.println(line);
		while(line != null)
		{
			sb.append(line);
			sb.append('\n');
			line = br.readLine();
		}
		return filecontent = sb.toString();
	}
}
