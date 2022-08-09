package Day8;

import java.util.Scanner;

public class Factorial {
	
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number:");
		int a =s.nextInt();
		int fact=1;
		int i=1;
		while(i<=a)
		{
			fact=fact*i;
			i++;
		}
		System.out.println("Factorial of " +a+" is: "+fact);
	}

}
