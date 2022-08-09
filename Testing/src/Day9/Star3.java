package Day9;
import java.util.Scanner;
public class Star3 {
	public static void main(String args[])
	{
		System.out.println("Enter the number of rows to be printed:");
		Scanner s=new Scanner(System.in);
		int row=s.nextInt();
		for(int i=1;i<=row;i++)
		{
			for(int k=row;k>i;k--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=(i*2)-1;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
