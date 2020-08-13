
import java.util.Scanner; //this command used for scanner
public class PrintNumPattern 
{
	public static void main(String args[])
	{
		
		Scanner num = new Scanner(System.in);    //scanner used for taking input from user 
		System.out.print("Enter a number: ");
		int n = num.nextInt();
		for(int i=1; i<=n; i++)
		{
			for(int j = 1; j<=i; j++)
			{
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}
