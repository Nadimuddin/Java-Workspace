package com.bridgelabz.utility;
import com.bridgelabz.utility.Utility;
import java.io.BufferedReader;
import java.io.FileReader;
public class ReadFile
{
	public String readFile(String file)throws Exception
	{
		StringBuilder sb;
		String line,filecontent;

		BufferedReader br = new BufferedReader(new FileReader(file));
		sb = new StringBuilder();
		line = br.readLine();
		//System.out.println(line);
		while(line != null)
		{
			sb.append(line);
			line = br.readLine();
			if(line != null)
				sb.append('\n');	
		}
		return filecontent = sb.toString();
	}
}
