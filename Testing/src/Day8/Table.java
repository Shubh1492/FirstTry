package Day8;

import java.util.Scanner;

public class Table {

	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
			System.out.println("Enter a number:");
			int a=s.nextInt();
			System.out.println("The table for " +a + " is as below:");
			for(int i=1;i<=10;i++)
			{
				System.out.println(a*i);
			}
	}
}
