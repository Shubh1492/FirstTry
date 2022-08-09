package Day6;

public class AutomationMethod extends SeleniumMethod {
	
	public void a()
	{
		this.a2();
		System.out.println("Child Default Method");
	}
	public void a1()
	{
		this.a();
		System.out.println("Child one parameterised method");
	}
	public void a2()
	{
		super.m2();
		//this.a();
		System.out.println("Child two parameterised method");
	}
	public void a3()
	{
		this.a1();
		System.out.println("Child three parameterised method");

}
	public static void main(String args[])
	{
		AutomationMethod am=new AutomationMethod();
		am.a3();
	}

}
