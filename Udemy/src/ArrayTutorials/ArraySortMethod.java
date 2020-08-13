package ArrayTutorials;

import java.util.Arrays;  
//import java.util.*;          //it includes all util files...

public class ArraySortMethod {
	
public static void main(String[] args) {
		
		int[] arr = {12,45,43,6,54,13,07};
		
		for(int x : arr)
		{
			System.out.print(x+" ");
		}
		
		System.out.println("\nSorted Array: ");
		
		Arrays.sort(arr);
		for(int x : arr)
		{
			System.out.print(x+" ");
		}
	}

}
