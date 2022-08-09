package pkg1;

public class Assignmnt // ((((10+2)+2)-2)*2)/2)
{
	public int sum(int a, int b)
	{
		int c;
		c=a+b;
		System.out.println("The result of addition is:"+c);
		return c;
	}
	public int sub(int x,int y)
	{
		int z;
		z=x-y;
		System.out.println("The result of subtraction is:"+z);
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
		Assignmnt as=new Assignmnt();
		int sumresult=as.sum(10,2);
		int sumresult1=as.sum(sumresult,2);
		int subresult=as.sub(sumresult1, 2);
		int multires=as.multi(subresult, 2);
		as.div(multires, 2);
		
	}
}
