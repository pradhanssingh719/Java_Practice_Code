package exercises;

import java.util.Scanner;

public class ReverseCharacter {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a string: ");
		String original = scan.nextLine();
		
		while(original.isEmpty() || original == null ) {
			System.out.println("Please enter a vaild string, empty and null string are not accepted:");
			original = scan.nextLine();
		}
		scan.close();
		
		/*ReverseCharacter output = new ReverseCharacter();   //if reversechar() is instance method then we have access it by using object
		String reversedString = output.reversechar(original);    //i.e private String reversechar(String originalString)
		System.out.println(reversedString);*/
		
		String output = reversechar(original);           //we can call static method directly into main method
		System.out.println(output);
		
		/*for(int i = original.length()-1; i>=0; i--) {      //we can also done this by using for-loop also
			System.out.print(original.charAt(i));
		}*/
		
		
	}
	
	private static String reversechar(String originalString) {
		String reverse = "";
		
		for(int i = originalString.length()-1; i>=0; i--) {
			reverse = reverse + originalString.charAt(i);
		}
		
		return reverse;
		
	}
}
