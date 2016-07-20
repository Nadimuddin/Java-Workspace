import java.io.*;
class PrimeExample
{
	public static void main(String args[])throws Exception
	{
		int num,flag=0,i;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter the number to check it is prime or not");
		num = Integer.parseInt(br.readLine());
		for(i=2; i<=(num/2); i++)
		{
			if(num%i==0)
			{
				System.out.println("It can be divided by "+i);
				flag = 1;
				break;
			}
		}
		if(flag == 1)
			System.out.println("No. is not prime");
		else if(flag == 0)
			System.out.println("No. is prime");
	}
}
