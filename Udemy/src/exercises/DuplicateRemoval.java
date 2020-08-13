package exercises;

public class DuplicateRemoval {

	public static void main(String[] args) {
		String str = "zzzzgzzgggjjjkkk";
		int[] arr= {1,2,1,3,4,5,6,4,3,7,8};
		//char arr[] = str.toCharArray();
		int size = arr.length;
		int[] newarr = new int[size];
		int k = 0;
		
		
		for (int i = 0; i < size; i++) {
			int count = 0;
			for (int j = i+1; j < size; j++) {
				if (arr[i] == arr[j]) {
					count++;
				}
			}
			if (count == 0) {
				newarr[k++] = arr[i];

			}
		}
		
		for(int i=0; i<k; i++) {
			System.out.print(newarr[i]+" ");
		}
		
		
		
	}

}
