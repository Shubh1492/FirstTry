package pkg1;

public class Assignmnt2 //((((10-2)+2)-2)*2)/2)
{
	public int sub(int a, int b)
	{
		int c;
		c=a-b;
		System.out.println("The result of subtraction is:"+c);
		return c;
	}
	public int sum(int x,int y)
	{
		int z;
		z=x+y;
		System.out.println("The result of addition is:"+z);
		return z;
	}
	public int multi(int m, int n)
	{
		int o;
		o=m*n;
		System.out.println("The result of multiplication is:"+o);
		return o;
	}
	public void div(int p,int q)
	{
		int r;
		r=p/q;
		System.out.println("The result of division is:"+r);
	}
	public static void main(String args[])
	{
		Assignmnt2 as=new Assignmnt2();
		int subresult=as.sub(10,2);
		int sumresult=as.sum(subresult,2);
		int subresult1=as.sub(sumresult, 2);
		int multires=as.multi(subresult1, 2);
		as.div(multires, 2);	
	}
}
