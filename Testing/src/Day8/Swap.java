package Day8;
import java.util.Scanner;
public class Swap {
	
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value of a:");
		int a=s.nextInt();
		System.out.println("Enter the value of b:");
		int b=s.nextInt();
		System.out.println("The values before swapping are:"+a+" and "+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("The values after swapping are:"+a+" and "+b);
	}

}
