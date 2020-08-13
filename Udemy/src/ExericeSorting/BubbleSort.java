package ExericeSorting;

public class BubbleSort {

	public static void main(String[] args) {
		int[] arr = { 2, 3, 1, 4, 6, 5 };
		bubbleSort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

	static void bubbleSort(int[] arr) {
		int size = arr.length;

		for (int k = 0; k < size-1; k++) {
			for (int i = 0; i < size - 1 - i; i++) {    //there no need to compare last elements because they are already sorted
				if (arr[i] > arr[i + 1]) {				//on every single iteration our one element is sorted and it reaches at the end 
					int temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
				}
			}
		}
	}
	
}
