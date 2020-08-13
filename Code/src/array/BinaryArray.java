package array;

import java.util.Scanner;

public class BinaryArray{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter array size: ");
		int size = scan.nextInt();
		int[] arr = new int[size];
		
		int[] output = new int[size];
		int m=0, n=size-1; 
		
		System.out.print("Enter array elements: ");
		for(int i=0; i<size; i++){
			arr[i] = scan.nextInt();
			
			//at the time of input we are storing elements in separate array
			if(arr[i] == 0){
				output[m] = arr[i];
				m++;
			}else{
				output[n] = arr[i];
				n--;
			}
		}
		scan.close();
		for(int element : output){
			System.out.print(element + " ");
		}
	}
}