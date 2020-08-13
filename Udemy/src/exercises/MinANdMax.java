package exercises;

import java.util.Scanner;

public class MinANdMax {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("enter array size: ");
		int n = scan.nextInt();
		
		int[] arr = new int[n];
		
		int max = 0;
		int min = 0;
		
		System.out.print("Enter " + n + " numbers: ");
		for(int i=0; i<n; i++) {
			arr[i] = scan.nextInt();
			if(i==0) {
				max = arr[i];
				min = arr[i];
			}
			if(arr[i] > max)
				max = arr[i];
			if(arr[i] < min)
				min = arr[i];
		}
		
		System.out.println("max is: " + max);
		System.out.println("min is: " + min);
	}
}
