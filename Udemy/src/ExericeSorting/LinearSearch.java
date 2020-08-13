package ExericeSorting;


public class LinearSearch {

	public static void main(String[] args) {
		int[] arr = {2,4,1,5,6,7,8,3};
		int count = 0;
		int x = 5;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == x) {
				System.out.println("Found at index: " + i);
				break;
			}
			count++;
		}
		System.out.println("loop runs: " + count + " times.");
	}

}
