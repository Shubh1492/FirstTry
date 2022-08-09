package Day4;

public class Assignment1 
{
	public void m()
	{
		this.m3(1, 2, 3);
		System.out.println("This is default method");
	}
	public void m1(int a)
	{
		this.m();
		System.out.println("This is one parameterised method");
	}
	public void m2(int a , int b)
	{
		this.m1(8);
		System.out.println("This is two parameterised method");
	}
	public void m3(int a, int b, int c)
	{
		System.out.println("This is three parameterised method");
	}
	public void m4(int a , int b, int c, int d)
	{
		this.m2(2, 3);
		System.out.println("This is four parameterised method");
		
	}
	public static void main(String args[])
	{
		Assignment1 a=new Assignment1();
		a.m4(2, 3, 4,7);
	}
}
