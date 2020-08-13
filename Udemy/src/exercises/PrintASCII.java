package exercises;
import java.util.Scanner;
public class PrintASCII 
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = scan.nextInt();
		scan.close();
		for(int i = 1; i<=n; i++)
		{
			for(int j = 1; j<=i; j++)
			{
				System.out.print((char)(j+64) + " ");
			}
			System.out.println();
		}
	}
}
