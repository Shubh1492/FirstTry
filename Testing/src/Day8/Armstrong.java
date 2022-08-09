package Day8;
import java.util.Scanner;
public class Armstrong {
	
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Please enter the number:");
		int a=s.nextInt();
		int result=a;
		int sum=0;
		while(a!=0)
		{
			int digit=a%10;
			sum=sum+(digit*digit*digit);
			a=a/10;
		}
		if(result==sum)
		{
			System.out.println(result+" is an Armstrong number");
		}
		else
		{
			System.out.println(result+" is not an Armstrong number");
		}
			
		}
	}
