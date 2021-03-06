package com.bridgelabz.main;
import com.bridgelabz.utility.Utility;
import com.bridgelabz.utility.ReadFile;
public class Stock
{
	public static void main(String arg[])throws Exception
	{

		int i,j,k,flag;

		//variable to store total number of stocks in file
		int stockNum;

		//total price of stocks
		int totalStockPrice=0;

		//total number of shares
		int totalShareNum=0;
		Utility u = new Utility();
		ReadFile read = new ReadFile();

		//array to store all stock name
		String stockName[];

		System.out.print("Reading from files....\n");

		/*reading file &
		break contents of file into line & store them in array of string*/
		stockName = read.readFile("Stock").split("\n");
		
		//calculate number of stocks by calculating array og length
		stockNum = stockName.length;
		System.out.println("-----**********-----\nThere are total "+stockNum+" number of stocks");
		
		for(i=0; i<stockNum; i++)	//loop for printing stock name
		{
			System.out.println((i+1)+" "+stockName[i]);
		}
		System.out.println();
		
		//variable to store number of shares in respective stock
		int shareNum[] = new int[stockNum];

		//array to store price of each stock
		int stockPrice[] = new int [stockNum];

		//array to sotre content of all files
		String shareFileContent[] = new String[stockNum];

		for(i=0; i<stockNum; i++)
		{
			shareFileContent[i] = read.readFile(stockName[i].trim());
			shareNum[i] = shareFileContent[i].split("\n").length;
			totalShareNum = totalShareNum+shareNum[i];
		}

		//array to store all share's name
		String shareName[] = new String[totalShareNum];

		//temporary array to store share's price in the form of strings
		String sharePriceTemp[] = new String[totalShareNum];

		//array to store share's price in the form of number
		int sharePrice[] = new int[totalShareNum];
		
		for(i=0; i<totalShareNum; i++)	//setting all elemetns of array to empty
		{
			shareName[i]="";
			sharePriceTemp[i]="";
		}

		k=0;

		//execute loop till number of stocks
		for(i=0; i<stockNum; i++)
		{
			flag = 1;

			/*another loop to read file content character by character
				to split share's name & price, because share's name & share's price are in single file*/
			for(j=0; j<shareFileContent[i].length(); j++)
			{

				//if it found ' '(space) then start storing share's price
				if(shareFileContent[i].charAt(j) == ' ')
				{
					flag = 2;
					j++;
				}

				//if it found '\n'(new line) then start storing share's name
				else if(shareFileContent[i].charAt(j) == '\n')
				{
					flag = 1;
					k++;
					j++;
				}
				if(flag == 1)
					shareName[k] =shareName[k]+shareFileContent[i].charAt(j);//concatenate string with another character
				else
				{
					sharePriceTemp[k] = sharePriceTemp[k]+shareFileContent[i].charAt(j);//concatenate string with another character

					// convert string to integer
					sharePrice[k] = Integer.parseInt(sharePriceTemp[k]);
				}
			}
			k++;
		}
		k=0;

		/*loop for displaying stock report*/
		for(i=0; i<stockNum; i++)
		{
			System.out.println("Shares in "+stockName[i]+":");
			for(j=0; j<shareNum[i]; j++)
			{ 
				stockPrice[i] = stockPrice[i]+sharePrice[k];
				System.out.println(shareName[k]+"("+sharePrice[k]+")");
				k++;
			}
			System.out.println("Price of "+stockName[i]+" stock-> "+stockPrice[i]);
			System.out.println("-------------------------------------------");
			totalStockPrice = totalStockPrice+stockPrice[i];
		}
		System.out.println("Total price of all stocks--> "+totalStockPrice);
	}
}
