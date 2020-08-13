import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

	public static void main(String[] args) {

		LinkedList<String> cars = new LinkedList<String>();

		// adding element in array list
		cars.add("BMW");
		cars.add("Honda");
		cars.add("Audi");

		// size of array list
		int size = cars.size();
		System.out.println("size of the list is: " + size);

		// printing element from array
		System.out.println("item at index 1: " + cars.get(0));

		// Iteration
		for (int i = 0; i < size; i++) {
			System.out.println("item of index " + i + " is:" + cars.get(i));
		}

		System.out.println("\noutput from for-each loop");
		for (String x : cars) {
			System.out.println(x);
		}

		// remove
		cars.remove(size - 1);

		System.out.println("\noutput from for-each loop after removing");
		for (String x : cars) {
			System.out.println(x);
		}

		List<Integer> lList = new LinkedList<Integer>();
		List<Integer> aList = new ArrayList<Integer>();
		
		runDuration(aList, "Array List");
		runDuration(lList, "Linked List");
	}

	public static void runDuration(List<Integer> list, String listType) {
		
		System.out.println("\nBeginnig of the duration method for "+ listType);
		for(int i=0; i<100000; i++) {
			list.add(i);
		}
		int size = list.size();
		int elementToAdd = size + 100000;
		long startTime = System.currentTimeMillis();
		/*
		 * for(int i =size; i< elementToAdd; i++) { //list.add(i); list.add(0, i); }
		 */
		
		/*
		 * for(int i=90000; i<92000; i++) { list.remove(i); }
		 */
		
		
		
		long endtTime = System.currentTimeMillis();
		long duration = endtTime - startTime;
		System.out.println("Duration of the list "+ listType+ " is "+duration+ " ms");
		
	}
}
