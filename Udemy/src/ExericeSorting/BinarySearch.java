package ExericeSorting;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		int[] arr = { 2, 4, 1, 5, 6, 7, 8, 3 };
		int count = 0;
		Arrays.sort(arr);
		int x = 2;
		//int result = binarySearch(arr, x);
		binarySearch(arr, x);
		//System.out.println(result);
	}

	public static boolean binarySearch(int[] arr, int x) { // 1 2 3 4 5 6 7 8
		int size = arr.length;
		int start = 0;
		int end = size - 1;
		int count = 0;

		while (start <= end) {
			int mid = (start + end) / 2;
			if (arr[mid] == x) {
				System.out.println("Element fount at index: " + mid);
				System.out.println("count: " + count);
				return true;
			}
			else if (x < arr[mid])
				end = mid - 1;
			else
				start = mid + 1;
			count++;
		}
		System.out.println("count: " + count);
		System.out.println("not found");
		return false;
	}

}
