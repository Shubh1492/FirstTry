package Day6;

public class SeleniumMethod {
	
		public void m()
		{
			this.m3();
			System.out.println("Parent Default Method");
		}
		public void m1()
		{
			this.m();
			System.out.println("Parent one parameterised method");
		}
		public void m2()
		{
			this.m1();
			System.out.println("Parent two parameterised method");
		}
		public void m3()
		{
			System.out.println("Parent three parameterised method");

	}
	}

