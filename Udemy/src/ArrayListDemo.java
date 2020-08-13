import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		 
		ArrayList<String> cars = new ArrayList<String>();
		
		//adding element in array list
		cars.add("BMW");
		cars.add("Honda");
		cars.add("Audi");
		
		//size of array list
		int size = cars.size();
		System.out.println("size of the list is: "+ size);

		//printing element from array
		System.out.println("item at index 1: "+ cars.get(1));
		
		System.out.println();
		//Iteration
		for(int i=0; i<size; i++) {
			System.out.println("item of index "+ i + " is:"+ cars.get(i));
		}
		
		System.out.println("\noutput from \'for-each loop");
		for(String x : cars) {
			System.out.println(x);
		}
		
		//remove
		cars.remove(size-1);
		
		
		System.out.println("\noutput from for-each loop after removing");
		for(String x : cars) {
			System.out.println(x);
		}
	}

}
