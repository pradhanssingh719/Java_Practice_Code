package exercises;
//finding factorial using while loop and we are using long for storing large values...

import java.util.Scanner;
public class FindFactorial {

	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter your number: ");
		int n = scan.nextInt();
		long k = 1;
		scan.close();
		
		while(n >= 1)
		{
		    k = k*n;
			n--;
		}
		System.out.println("Factorial is: "+ k);
		
	}
}

