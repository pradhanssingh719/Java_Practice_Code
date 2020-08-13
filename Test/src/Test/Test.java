package Test;
import java.util.ArrayList;
import java.util.Collections;

public class Test {
	int num;

	Test() {

	}

	Test(int num) {

	}

	Test(int num, String s) {

	}

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5};
		int[] arr2 = {10,20,30};
		
		arr2 = arr;
		
		for(int item : arr2) {
			System.out.print(item+" ");
		}

	}
}
