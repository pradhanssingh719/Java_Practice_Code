import java.util.Scanner;
/*
 * $$$$
 * $  $
 * $$$$
 */


public class PrintBox 
{
	public static void main(String args[])
	{
		Scanner num = new Scanner(System.in);
		System.out.print("Insert a number: ");
		int n = num.nextInt();
		
		for(int i=1; i<=n; i++)
		{
			if(i==1||i==n)
			{
				for(int j=1; j<=n; j++)
				{
					System.out.print("$");
				}
				System.out.println();
			}
			else
			{
				System.out.print("$");
				for(int k=1; k<=n-2; k++)
				{
					 System.out.print(" ");
				}
				System.out.print("$");
				System.out.println();
			}
		}
	}
}
