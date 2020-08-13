package ExericeSorting;

import java.util.Scanner;

public class InsertionSort {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter array size: ");
		int n = scan.nextInt();
		
		int[] arr = new int[n];
		System.out.print("Enter array element: ");
		for(int i=0; i<n; i++) {
			arr[i] = scan.nextInt();
		}
		scan.close();
		insertionSort(arr);
		
		for(int i=0; i<n; i++) {
			System.out.print(arr[i] +" ");
		}

	}
	
	static void insertionSort(int[] arr) {    //3 2 1 5 4 6
		for(int i=1; i<arr.length; i++) {
			int value = arr[i];
			int hole = i;
			
			while(hole > 0 && arr[hole-1] > value) {
				arr[hole] = arr[hole-1];
				hole--;
			}
			arr[hole] = value;
		}
	}

}
