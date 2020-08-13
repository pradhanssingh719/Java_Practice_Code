package CollectionsExample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		
		/***
		 * Two ways to make array list synchronized explicitly
		 * 	1. Using "Collections.synchronizedList()" method
			2. Using thread-safe variant of ArrayList: "CopyOnWriteArrayList"
		 */
		
		
		
		List<Integer> num = new ArrayList<Integer>();
		
		

		num.add(10);
		num.add(11);
		num.add(12);
		num.add(13);
		//num.add(null);
		
		System.out.println(num.subList(1, 3));
		
		System.out.println("size: " + num.size());
		System.out.println(num);
		
		
		num.add(1,20);
		System.out.println("size: " + num.size());
		System.out.println("element added at index 1: " + num);
		
		num.remove(1);
		System.out.println("size: " + num.size());
		System.out.println("element removed from index 1: " + num);
		
		num.set(0, 017);
		System.out.println("size: " + num.size());
		System.out.println("value of element changed at index 0: " + num);
		
		for(int item : num) {
			System.out.print(item + " ");
		}
		
		System.out.println();
		
		//sorting of array list
		Collections.sort(num);
		System.out.print("sorted array list: ");
		for(int item : num) {
			System.out.print(item + " ");
		}
		
		//sorting in reverse order
		Collections.sort(num, Collections.reverseOrder());
		System.out.println("\nsorted array list in reverse order: ");
		for(int item : num) {
			System.out.print(item + " ");
		}
		
		int pos1 = num.indexOf(12);
		System.out.println("\nIndex of 12 is: " + pos1);
		
		int pos2 = num.indexOf(20);
		System.out.println("Index of 20 is: " + pos2); 
		
		int indx = num.get(0);
		System.out.println("element present at index 0 is: " + indx);
		
		//check(search) weather particular object is present or not...it will return boolean value 
		System.out.println("does 15 present in the array list: " + num.contains(15));
		System.out.println("if true then index of 15 is: " + num.indexOf(15));
		
		System.out.println("maximum value: " + Collections.max(num));
		System.out.println("minimum value: " + Collections.min(num));
		
		
		
		//it will clear everything
		num.clear();
		
		System.out.println("after using clear method size of array list: " + num.size());
		System.out.println(num);
		
		
	
	}

}
