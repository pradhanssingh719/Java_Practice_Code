package MethodOverloading;

/***
 * 1. Different no. of parameters in argument list
 * @author pradhanssingh
 *
 */

public class CarsOverloading1 {

	public static void main(String[] args) {
		increaseSeatHeight(2);
		increaseSeatHeight(8, true);
	}

	// method 1
	public static void increaseSeatHeight(int heightToIncrese) {
		System.out.println("Increased sear height by " + heightToIncrese + " inches");
	}

	// method 2
	public static void increaseSeatHeight(int heightToIncrese, boolean rememberHeight) {
		System.out.println("Increased sear height by " + heightToIncrese + " inches");

		if (rememberHeight) {
			System.out.println("your selection is saved");
		} else {
			System.out.println("your selection is not saved");

		}

	}

}
