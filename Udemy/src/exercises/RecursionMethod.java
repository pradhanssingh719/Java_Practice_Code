package exercises;

import java.util.Scanner;

public class RecursionMethod {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("enter number: ");
		int n = scan.nextInt();
		scan.close();
		int result = fact(n);
		System.out.println(result);
	}
	
	public static int fact(int n) {
		if(n<=1) {
			return 1;
		}else {
			return n*fact(n-1);
		}
	}
	
}
