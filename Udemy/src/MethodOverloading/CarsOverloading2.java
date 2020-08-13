package MethodOverloading;

/***
 * 2. Difference in data type of arguments
 * @author pradhanssingh
 *
 */

public class CarsOverloading2 {

	public static void main(String[] args) {
		increaseSeatHeight(2);
		increaseSeatHeight("8");

	}
	
	public static void increaseSeatHeight(int heightToIncrese) {
		System.out.println("Increased sear height by " + heightToIncrese + " inches. I am the interger one");
	}
	
	public static void increaseSeatHeight(String heightToIncrese) {
		System.out.println("Increased sear height by " + heightToIncrese + " inches. I am the String one");
	}

}
