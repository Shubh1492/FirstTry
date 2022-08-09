package Day8;
import java.util.Scanner;
public class Swapping {
	public void swap(int a,int b)
	{
		int c;
		c=a;
		a=b;
		b=c;
		System.out.println("The values after swapping are:"+a+" and "+b);
	}
	public static void main(String args[])
	{
		Swapping s1=new Swapping();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value of a:");
		int a=s.nextInt();
		System.out.println("Enter the value of b:");
		int b=s.nextInt();
		System.out.println("The values before swapping are:"+a+" and "+b);
		s1.swap(a, b);
	}	
	}
