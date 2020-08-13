package exercises;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("enter string: ");
		String input = scan.next();
		scan.close();

		//char arr[] = input.toCharArray();

		String result = isPalindrome(input);
		
		if(input.equals(result))
			System.out.println("YES");
		else
			System.out.println("NO");
	}

	static String isPalindrome(String input) {
		String str = "";
		for(int i=input.length()-1; i>=0; i--) {
			str +=  input.charAt(i);
		}
		return str;
	}

}
