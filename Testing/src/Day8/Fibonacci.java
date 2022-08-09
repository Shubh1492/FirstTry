package Day8;

public class Fibonacci {
	public static void main(String args[]) {
		int a=0;
		int b=1;
		int sum;
		System.out.println(a);
		System.out.println(b);
		for(int i=2;i<12;i++)
		{
			sum=a+b;
			a=b;
			b=sum;
			System.out.println(sum);
			
		}
	}

}
