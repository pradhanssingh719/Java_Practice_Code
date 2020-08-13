package exercises;

import java.util.Scanner;

public class BinaryArray {

	public static void main(String[] args) {
		//int arr[] = {0,0,1,1,1,1,0,0,0,1,0,1};
		
		Scanner scan = new Scanner(System.in);
		System.out.print("enter array size: ");
		int n = scan.nextInt();
		
		int[] arr = new int[n];
		
		System.out.print("Enter " + n + " numbers: ");
		for(int i=0; i<n; i++) {
			arr[i] = scan.nextInt(); 
		}
		
		int[] newArr = new int[n];
		
		int j = 0;
		int k = n-1;
		
		for(int i=0; i<n; i++) {

			if(arr[i] == 0) {
				newArr[j] = 0;
				j++;
			}
			else {
				newArr[k] = 1;
				k--;
			}
		}
		
		for(int x : newArr) {
			System.out.print(x);
		}
		
	}

}
