package com.bridgelabz.main;
import com.bridgelabz.utility.ReadFile;
import com.bridgelabz.utility.WriteFile;
import com.bridgelabz.utility.LinkedList;
import com.bridgelabz.utility.Utility;
class Hashing
{
	int array[] = new int[100];
	ReadFile read = new ReadFile();
	WriteFile write = new WriteFile();
	LinkedList list[] = new LinkedList[11];
	Utility u = new Utility();
	String temp[],str="";
	int num,remainder,i;
	Hashing()throws Exception
	{
		temp = read.readFile("HashNumbers").split(" ");
		for(i=0; i<temp.length; i++)
		{
			num = Integer.parseInt(temp[i]);
			remainder = num%11;
			if(list[remainder] != null)
				list[remainder].add(num);
			else
			{
				list[remainder] = new LinkedList();
				list[remainder].add(num);
			}
		}
		for(i=0; i<11; i++)
			if(list[i]!= null)
			{
				str = str+list[i].getAllData();
				System.out.print(list[i].getAllData()+" ");
			}
		System.out.print("Enter number to search: ");
		int target = u.getIntegerInput();
		for(i=0; i<11; i++)
		{
			if(list[i] != null)
				if(list[i].searchData(target))
				{
					System.out.println("Number found at "+i+" index");
					str = str.replace(" "+Integer.toString(target)+" "," ");
					System.out.println("str: "+str);
					write.writeFile("HashNumbers",str);
					break;
				}
				if(i==10)
				{
					System.out.println("Number not found");
					str = str+Integer.toString(target)+" ";
					write.writeFile("HashNumbers", str);
				}
		}
	}
	public static void main(String args[])throws Exception
	{
		new Hashing();
	}
}
