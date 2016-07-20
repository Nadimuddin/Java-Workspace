package com.bridgelabz.main;
import com.bridgelabz.utility.Utility;
class Read2DArray
{
	int dataType,row,col,i,j;
	int intArray[][];
	double[][] doubleArray;
	Utility u;
	public static void main(String arg[])
	{
		new Read2DArray();
	}
	public Read2DArray() {
		// TODO Auto-generated constructor stub
		
		u = new Utility();
		System.out.println("Enter dimension of array");
		System.out.print("No. of rows-> ");
		row = u.getIntegerInput();
		System.out.print("\nNo. of columns-> ");
		col = u.getIntegerInput();
		System.out.println("Enter what type of 2D array you want"
				+ "\n1. Integer"
				+ "\n2. Double"
				+ "\nEnter number to select");
		dataType = u.getIntegerInput();
		switch (dataType) {
		case 1:
			intArray = new int[row][col];
			intArray = u.read2DIntArray(row, col);
			for(i=0; i<row; i++) {
				for(j=0; j<col; j++)
					System.out.print(intArray[i][j]+"\t");
				System.out.println();
			}
		break;
		case 2:
			doubleArray = new double[row][col];
			doubleArray = u.read2DDoubleArray(row, col);
			for(i=0; i<row; i++)
			{
				for(j=0; j<col; j++)
					System.out.print(doubleArray[i][j]+"\t");
				System.out.println();
			}
		break;
		
		default:
			System.out.println("You have selected invalid option");
			break;
		}
	}
}
