package ExericeSorting;

public class QuickSort {

	public static void main(String[] args) {
		int[] arr = { 3, 4, 2, 5, 1, 6, 8, 7 };
		int size = arr.length;
		quickSort(arr, 0, size-1);
		
		for(int i=0; i<size; i++) {
			System.out.print(arr[i] +" ");
		}
	}

	public static void quickSort(int[] arr, int low, int high) {

		if (low < high) {
			int j = partition(arr, low, high);
			quickSort(arr, low, j);
			quickSort(arr, j + 1, high);
		}

	}

	public static int partition(int[] arr, int low, int high) { //  3, 4, 2, 5, 1, 6, 8, 7

		int pivot = arr[low];
		int i = low;
		int j = high;

		while (i < j) {
			do {
				i++;
			} while (arr[i] <= pivot);
			do {
				j--;
			} while (arr[j] > pivot);

			if (i < j) {
				//swap(arr[i], arr[j]);
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		//swap(pivot, arr[j]);
		int temp = pivot;
		pivot = arr[j];
		arr[j] = temp;
		return j;
	}

//	public static void swap(int a, int b) {
//		int temp = a;
//		a = b;
//		b = temp;
//	}

}
