package Day4;

import java.util.Scanner;

public class Assignment3 {

	public int mul(int x,int y)
	{
		int mulresult=x*y;
		return mulresult;
	}
	public int sub(int x,int y)
	{
		int subresult=x-y;
		return subresult;
	}
	public int sum(int x,int y)
	{
		int sumresult=x+y;
		return sumresult;
	}
	public void div(int x,int y)
	{
		int divresult=x/y;
		System.out.println("The final result is:"+divresult);
	}
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter the first value:");
		int x1=s.nextInt();
		
		System.out.println("Enter the second value:");
		int x2=s.nextInt();
		
		System.out.println("Enter the third value:");
		int x3=s.nextInt();
		
		System.out.println("Enter the fourth value:");
		int x4=s.nextInt();
		
		System.out.println("Enter the fifth value:");
		int x5=s.nextInt();
		
		System.out.println("Enter the sixth value:");
		int x6=s.nextInt();
		
		Assignment3 a=new Assignment3();
		int arth=a.mul(x1,x2);
		System.out.println("The result after multiplication is:"+arth);
		
		arth=a.sub(arth,x3);
		System.out.println("The result after subtraction is:"+arth);
		
		arth=a.mul(arth,x4);
		System.out.println("The result after multiplication is:"+arth);
		
		arth=a.sum(arth,x5);
		System.out.println("The result after addition is:"+arth);
		
		a.div(arth,x6);
			
	}
}
