package Day8;

import java.util.Scanner;

public class Palindrome 
{
public static void main(String args[])
{
	Scanner s=new Scanner(System.in);
	System.out.println("Enter a number:");
	int a=s.nextInt();
	int r=a;
	int rev=0;
	while(a>0)
	{
		int digit=a%10;
		rev=rev*10+digit;
		a=a/10;		
	}
	if(r==rev)
	{
		System.out.println(r+" is a Palindrome number");
	}
	else
	{
		System.out.println(r+" is not a Palindrome number");
		
	}
}
	
}
