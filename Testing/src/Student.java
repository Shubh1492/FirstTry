
public class Student 

{
	
	int rollno, age;
	
	public void display1()
	
	{
		System.out.println("This is method Display1");
	}
	
	public void display2()
	{
	
		System.out.println("This is method Display2");
	
	}
	
	public static void main(String args[])
	
	{
		Student s1=new Student();
		s1.rollno=1069;
		s1.age=35;
		System.out.println("Age of the student is:"+s1.age);
		System.out.println("Roll number of the student is:"+s1.rollno);
		
		s1.display1();
		s1.display2();
	}

}
