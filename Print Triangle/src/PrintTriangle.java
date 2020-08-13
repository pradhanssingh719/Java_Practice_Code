//Print triangle using three for loops

import java.util.Scanner;
public class PrintTriangle {
	
	public static void main(String args[])
	{
		/*print this
		        *
		       ***
		      *****
		     ******* 
		    *********
		   ***********
		 */
		
		Scanner num = new Scanner(System.in);
		System.out.print("Enter number: ");
		int n = num.nextInt();
		for(int i=0; i<=(n/2); i++) 
		{
			for(int j=i; j<(n/2); j++)
			{
				System.out.print(" ");
			}
			for(int k=0; k<(i*2+1); k++)
			{
				System.out.print("*");
			}
			System.out.println();	
		}
		
	}
}
