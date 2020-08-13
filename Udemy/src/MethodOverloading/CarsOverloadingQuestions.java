package MethodOverloading;

/***
 * 1. Different no. of parameters in argument list
 * 2. Difference in data type of arguments
 * 3. different Sequence of data type of arguments 
 * 4. WE Cannot overload just on return type
 */


public class CarsOverloadingQuestions {

public static void main(String[] args) {
		
		increaseSeatHeight("2", 2);
		increaseSeatHeight("2", "8");

	}
	
	public static void increaseSeatHeight(String var1, int var2) {
		System.out.println("I am the 1st overload");
	}
	
	
	public static void increaseSeatHeight(String var1, String var2) {
		System.out.println("I am the 2nd overload");
	}
	
	/*  
	public static int increaseSeatHeight(String var3, int var4) {   //we cannot overload just on return type  					
		System.out.println("I am the 2nd overload");
		return 0;
	}
	*/
	

}
