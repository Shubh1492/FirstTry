package Day9;
import java.util.Scanner;
public class Star2 {
	public static void main(String args[])
	{
		System.out.println("Enter the number of rows to be printed:");
		Scanner s=new Scanner(System.in);
		int row=s.nextInt();
		for(int i=1;i<=5;i++)
		{
			for(int k=row;k>i;k--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
