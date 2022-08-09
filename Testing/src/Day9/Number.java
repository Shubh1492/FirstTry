package Day9;
import java.util.Scanner;
public class Number {
		public static void main(String args[])
		{
			System.out.println("Enter the number of rows to be printed:");
			Scanner s=new Scanner(System.in);
			int row=s.nextInt();
			for(int i=1;i<=row;i++) 
			{
				for(int j=1;j<=i;j++)
				{
					System.out.print(j+ " ");
				}
				System.out.println();
			}
		}
}
