package Day9;

import java.util.Scanner;

public class Star 
{
	public static void main(String args[])
	{
		System.out.println("Enter the number of rows:");
		
		Scanner s=new Scanner(System.in);
		int row=s.nextInt();
		
		for(int i=0;i<row;i++) 
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
