package Day6;

public class Selenium {
	
	public Selenium()
	{
		this(1,2,3);
		System.out.println("Parent Default constructor");
	}
	public Selenium(int a)
	{
		this();
		System.out.println("Parent one parameterised constructor");
	}
	public Selenium(int a , int b)
	{
		this(5);
		System.out.println("Parent two parameterised constructor");
	}
	public Selenium(int a , int b, int c)
	{
		System.out.println("Parent three parameterised constructor");

}
}
