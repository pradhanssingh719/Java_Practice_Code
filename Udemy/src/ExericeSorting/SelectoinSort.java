package ExericeSorting;

public class SelectoinSort {

	public static void main(String[] args) {
		
		int[] arr = {2,3,1,5,4,0,1};
		selectionSort(arr);
		for(int x : arr) {
			System.out.print(x+" ");
		}
		System.out.println();
		//Descending order
		for(int i=arr.length-1; i>=0; i--) {
			System.out.print(arr[i]+" ");
		}
		
		
	}
	
	public static void selectionSort(int[] arr) {
		int size = arr.length;
		
		for(int i=0; i<size-1; i++) {
			int minIndex = i;
			for(int j=i+1; j<size; j++) {
				if(arr[j] < arr[minIndex]) {
					minIndex = j;
				}
			}	
			int temp = arr[minIndex];
			arr[minIndex] = arr[i];
			arr[i] = temp;
		}
	}

}
