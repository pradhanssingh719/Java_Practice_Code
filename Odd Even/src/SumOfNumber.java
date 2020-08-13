import java.util.Scanner;
//odd and even
public class SumOfNumber 
{
	public static void main(String args[])
	{
		Scanner num = new Scanner(System.in);
		System.out.print("Enter value of n: ");
		int n = num.nextInt();
		
		if(n%2 == 0) {
			System.out.println("EVEN");
		}
		else
			System.out.println("ODD");
		
	}
}
