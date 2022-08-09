package Day9;
import java.util.Scanner;
public class Number1 {
	public static void main(String args[])
	{
		System.out.println("Enter the number of rows to be printed:");
		Scanner s=new Scanner(System.in);
		int row=s.nextInt();
		int k=1;
		for(int i=1;i<=row;i++) 
		{
			for(int j=1;j<i+1;j++)
			{
				System.out.print(k++ + " ");
			}
			System.out.println();
		}
	}
}
