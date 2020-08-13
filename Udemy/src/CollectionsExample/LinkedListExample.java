package CollectionsExample;

import java.util.List;
import java.util.LinkedList;
import java.util.Collections;
import java.util.Iterator;

public class LinkedListExample {

	public static void main(String[] args) {
		List<String> lList = new LinkedList<String>();

		lList.add("pradhan");
		lList.add("singh");
		lList.add("meena");
		lList.add("kekri");
		
		((LinkedList<String>) lList).addFirst("nirma");

		System.out.println("size: " + lList.size());
		System.out.println(lList);
		
		
		lList.add(1,"kumar");
		System.out.println("size: " + lList.size());
		System.out.println("element added at index 1: " + lList);
		
		
		
		lList.remove(1);
		System.out.println("size: " + lList.size());
		System.out.println("element removed from index 1: " + lList);
		
		lList.set(0, "priya");
		System.out.println("size: " + lList.size());
		System.out.println("value of element changed at index 0: " + lList);
		
		for(String item : lList) {
			System.out.print(item + " ");
		}
		
		System.out.println();
		
		//sorting of array list
		Collections.sort(lList);
		System.out.print("sorted linked list: ");
		for(String item : lList) {
			System.out.print(item + " ");
		}
		
		//sorting in reverse order
		Collections.sort(lList, Collections.reverseOrder());
		System.out.print("\nsorted linked list in reverse order: ");
		for(String item : lList) {
			System.out.print(item + " ");
		}
		
		
		
		int pos1 = lList.indexOf("singh");
		System.out.println("\nIndex of 12 is: " + pos1);
		
		int pos2 = lList.indexOf("meena");
		System.out.println("Index of 20 is: " + pos2); 
		
		String indx = lList.get(0);
		System.out.println("element present at index 0 is: " + indx);
		
		//check(search) weather particular object is present or not...it will return boolean value 
		System.out.println("does 15 present in the array list: " + lList.contains("ajmer"));
		System.out.println("if true then index of 15 is: " + lList.indexOf("ajmer"));
		
		System.out.println("maximum value: " + Collections.max(lList));
		System.out.println("minimum value: " + Collections.min(lList));
		
		((LinkedList<String>) lList).addFirst("nirma");
		
		Iterator<String> i = lList.iterator();
		while(i.hasNext()) {
			System.out.print(i.next() + " ");
		}
		
		
		
		System.out.println(lList);
		System.out.println(lList.size());
		System.out.println();
		//it will clear everything
		lList.clear();
		
		System.out.println("after using clear method size of array list: " + lList.size());
		System.out.println(lList);
		
		

	}

}
