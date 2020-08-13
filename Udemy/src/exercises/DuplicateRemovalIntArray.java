package exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DuplicateRemovalIntArray {

	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter array size: ");
		int size = scan.nextInt();
		int[] arr = new int[size];
		System.out.print("Entetr array elements: ");
		for(int i=0; i<size; i++){
			arr[i] = scan.nextInt();
		}
		scan.close();
		duplicateRemove(arr);
	}
	
	public static void duplicateRemove(int[] arr){
		int size = arr.length;
		//int[] newArr = new int[size];   //for storing non duplicate elements
		List<Integer> aList = new ArrayList<Integer>();   //with array list
		//int k = 0;
		for(int i=0; i<size; i++){
			boolean flag = false;
			for(int j=i+1; j<size; j++){
				if(arr[i] == arr[j]){
					flag = true;
					break;
				}
			}
			if(flag == false){
//				newArr[k] = arr[i];
//				k++;
				aList.add(arr[i]);				//with array list
			}
		}
//		for(int i=0; i<k; i++){            				 //we dont need to print whole array...
//			System.out.print(newArr[i] + " ");			//print only entered elements (ohter values are initialized with 0 by default)
//		}
		
		for(int item : aList) {					//with array list
			System.out.print(item + " ");  
		}
		
		System.out.println("\nsize of aList is: " + aList.size());
	}

}
