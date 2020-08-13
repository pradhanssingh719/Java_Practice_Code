package exercises;

import java.util.Scanner;

public class SecondMax2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("enter array size: ");
		int n = scan.nextInt();

		int[] arr = new int[n];

		System.out.print("Enter " + n + " numbers: ");
		for (int i = 0; i < n; i++) {
			arr[i] = scan.nextInt();
		}

		int first = arr[0], second = arr[0];           //2 3 6 1 5 4
		

		for(int i=1; i<n; i++) {
			if (arr[i] > first) {
				second = first;
				first = arr[i];
			}else if(arr[i] > second) {
				second = arr[i];
			}
		
		}
		

		System.out.println("first max is: " + first);
		System.out.println("second max is: " + second);
	}
}
