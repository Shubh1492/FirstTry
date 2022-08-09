package Day8;

import java.util.Scanner;

public class Prime 
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Please enter the number:");
		int a=s.nextInt();
		int check=0;
		for(int i=1;i<=a/2;i++)
		{
			if(a%i==0)
			{
				check++;
			}
		}
		if(check==1)
		{
			System.out.println(a+" is a prime number");
		}
		else
		{
			System.out.println(a+" is not a prime number");
		}
	}
}
