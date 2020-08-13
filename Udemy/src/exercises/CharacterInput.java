/**
 * Strings in Java are Objects that are backed internally by a char array. 
 * Since arrays are immutable(cannot grow), Strings are immutable as well.
 * Whenever a change to a String is made, an entirely new String is created
 */
package exercises;

import java.util.Scanner;

public class CharacterInput {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String s = scan.next();

		String lc = s.toLowerCase();
		String uc = s.toUpperCase();
		System.out.println(lc);
		System.out.println(uc);

		System.out.print("Enter a character: ");
		
		char c = scan.next().charAt(0); // this is how we take character input
		char lchar = Character.toLowerCase(c); // to convert it into upper case and lower case we used Character Wrapper class
												
		char uchar = Character.toUpperCase(c);
		System.out.println(lchar);
		System.out.println(uchar);
	}

}
