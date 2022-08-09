package Day9;
import java.util.Scanner;
public class Star1 
{
	public static void main(String args[])
	{
		System.out.println("Enter the number of rows to be printed:");
		Scanner s=new Scanner(System.in);
		int row=s.nextInt();
		for(int i=row-1;i>=0;i--)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
