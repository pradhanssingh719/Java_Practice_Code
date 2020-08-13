package MethodOverloading;

/***
 * 3. different Sequence of data type of arguments 
 * @author pradhanssingh
 *
 */


public class CarsOverloading3 {

	public static void main(String[] args) {
		
		increaseSeatHeight("2", 2);
		increaseSeatHeight(2, "8");

	}
	
	public static void increaseSeatHeight(String var1, int var2) {
		System.out.println("I am the first overload");
	}
	
	public static void increaseSeatHeight(int var1, String var2) {
		System.out.println("I am the second overload");
	}

}
