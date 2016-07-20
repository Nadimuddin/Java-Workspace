package com.bridgelabz.main;
import com.bridgelabz.utility.Utility;
class Question
{
	public static void main(String arg[]) throws Exception
	{
        	Utility u = new Utility();
		int N,i,arr[],low,high,mid;
        	char ans;

		N = Integer.parseInt(arg[0]);        	
		arr = new int[N+1];
        	for(i=0; i<N; i++)
        		arr[i] = i;
        	System.out.println("Think of a number between 0 to "+(N-1)+
		"\nPress Enter to continue....");
		u.pressingEnter();
		low = 0;
		high = N;
		while(low<=high)
		{
			mid = (low+high)/2;
			System.out.println("Is it "+arr[mid]+"\npress y or n");
			ans = u.getCharacterInput();
			if(ans == 'y')
				break;
			else
			{
				System.out.println("Is it between "+arr[low]+" to"+arr[mid]+" \npress y or n");
				ans = u.getCharacterInput();
				if(ans == 'y')
					high = mid-1;
				else if(ans == 'n')
					low = mid+1;
			}
		}
	}
}
