package ExericeSorting;

public class MergeSort {

	public static void main(String[] args) {
		int[] arr = { 5, 3, 4, 2, 1, 7, 6 };
		mergeSort(arr);
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}

	public static void mergeSort(int[] arr) { //5 3 4 2 1 7 6

		int size = arr.length;

		if (size >= 2) {
			int mid = size / 2;
			int[] left = new int[mid];
			int[] right = new int[size - mid];

			// putting element in first array
			for (int i = 0; i < mid; i++) {
				left[i] = arr[i];
			}
			// putting element in second array
			for (int i = mid; i < size; i++) {
				right[i-mid] = arr[i];
			}
			//recursive call
			mergeSort(left);
			mergeSort(right);
			merge(arr,left,right);
		}
	} 
	
	public static void merge(int[] arr, int[] left, int[] right) {
		
		
		int lsize = left.length;
		int rsize = right.length;
		
		int i=0, j=0, k=0;         //i for left array, j for right array and k for main array
 		while(i < lsize && j < rsize) {
 			if(left[i] <= right[j]) {
 				arr[k] = left[i];
 				k++;
 				i++;
 			}
 			else {
 				arr[k] = right[j];
 				k++;
 				j++;
 			}
 		}
 		//if right array is fully used and only left array is remaining
 		while(i < lsize) {
 			arr[k] = left[i];
 			k++;
 			i++;
 		}
 		//if left array is fully used and only right array is remaining
 		while(j < rsize) {
 			arr[k] = right[j];
 			k++;
 			j++;
 		}
		
	}

}
