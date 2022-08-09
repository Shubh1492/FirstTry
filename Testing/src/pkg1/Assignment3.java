package pkg1;

public class Assignment3 
{
	public Assignment3()
	{
		this(5,6,8);
		System.out.println("This is default constructor");
	}
	public Assignment3(int a)
	{
		this(4,5);
		System.out.println("This is one parameterised constructor");
	}
	public Assignment3(int a , int b)
	{
		this();
		System.out.println("This is two parameterised constructor");
	}
	public Assignment3(int a, int b, int c)
	{
		System.out.println("This is three parameterised constructor");
	}
	public Assignment3(int a, int b,int c, int d)
	{
		this(1);
		System.out.println("This is four parameterised constructor");
	}
	public static void main(String args[])
	{
		Assignment3 a=new Assignment3(5,7,8,9);
	}
	}
