package com.bridgelabz.main;
import com.bridgelabz.utility.Utility;
public class Stock
{
	Utility u;
	int stockNum,shareNum[],i,j,k=0,stockPrice[],sharePrice[][],totalStockPrice=0;
	String stockName[],shareName[][];
	public static void main(String arg[])throws Exception {
		new Stock();
	}
	public Stock()throws Exception
	{
		// TODO Auto-generated constructor stub
		
		u = new Utility();
		System.out.print("Enter no. of stock-> ");
		stockNum = u.getIntegerInput();  	//get total No. of stocks
		stockName = new String[stockNum];	//Name of each stock
		stockPrice = new int[stockNum];		//Stock price
		shareNum = new int[stockNum];		//number of shares in respective stock
		
		System.out.println("Enter name of stocks  & no. of shares in them");
		for(i=0; i<stockNum; i++)
		{
			System.out.print("Name of stock"+(i+1)+"-> ");
			stockName[i] = u.getStringInput();		//Get name of stocks
			System.out.print("No. of shares in "+stockName[i]+" stock-> ");
			shareNum[i] = u.getIntegerInput();		//Get no. of shares in respective stock
			if(k < shareNum[i])
				k = shareNum[i];
		}
		shareName = new String[stockNum][k];
		sharePrice = new int[stockNum][k];
		System.out.println("Enter name & price of shares");
		
		/*loop for getting share name of each stock*/
		for(i=0; i<stockNum; i++)
		{
			for(j=0; j<shareNum[i]; j++)
			{
				System.out.print("Share"+(j+1)+" of "+stockName[i]+" stock-> ");
				shareName[i][j] = u.getStringInput();	//Get name of each share
				System.out.print("Price of "+shareName[i][j]+"->");
				sharePrice[i][j] = u.getIntegerInput();	//Get price of each share
			}
			System.out.println();
		}
		
		System.out.println("        ******------STOCK REPORT------******");
		/* loop for printing stock report */
		for(i=0; i<stockNum; i++)
		{
			System.out.print("Shares in "+stockName[i]+" stock\t->\t");
			for(j=0; j<shareNum[i]; j++)
				System.out.print(shareName[i][j]+"("+sharePrice[i][j]+")\t");
			System.out.println("\n");
		}
		
		
		System.out.println("        ******------PRICE OF STOCKS------******");
		/*Calculating price of stocks*/
		for(i=0; i<stockNum; i++)
		{
			for(j=0; j<shareNum[i]; j++)
			{
				stockPrice[i] = stockPrice[i]+sharePrice[i][j];
			}
			System.out.println("Price of "+stockName[i]+" stock-> "+stockPrice[i]);
		}
		for(i=0; i<stockNum; i++)
		{
			totalStockPrice = totalStockPrice+stockPrice[i];
		}
		System.out.println("Total price of stocks-> "+totalStockPrice);
	}
}
