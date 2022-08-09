package Day6;

public class Automation extends Selenium

{
	public Automation()
	{
		super(12,45);
		System.out.println("Child Default constructor");
	}
	public Automation(int a)
	{
		this(12,16);
		System.out.println("Child one parameterised constructor");
	}
	public Automation(int a , int b)
	{
		this(7,8,9);
		System.out.println("Child two parameterised constructor");
	}
	public Automation(int a , int b, int c)
	{
		this();
		System.out.println("Child three parameterised constructor");
	}
	public static void main(String args[])
	{
		Automation a =new Automation(12);
		
	}
}
