package string;

import java.util.Scanner;

public class VowelAndConsonants {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter String: ");
		String input = scan.next();
		scan.close();

		// checkWithSwitch(input);
		System.out.print("\n");
		checkWithIfElse(input);
	}

	// method 1
	public static void checkWithIfElse(String str) {
		System.out.println("By using if else...");
		str = str.toLowerCase(); // first we convert string to lowercase so there is no need to check for upper
									// case alphabet
		int vowelCount = 0, consonantCount = 0, specialChar = 0;

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			// checking for vowel
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				vowelCount++;
			} else {// checking for consonant
				if (ch >= 'a' && ch <= 'z') {
					consonantCount++;
				} else {// checking for special Character
					specialChar++;
				}
			}
		}
		System.out.println("Vowels: " + vowelCount);
		System.out.println("consonants: " + consonantCount);
		System.out.println("Special Char: " + specialChar);
	}

	// method 2
	public static void checkWithSwitch(String str) {
		// here no need to convert char to lowercase...we are checking for both lower
		// and upper case
		System.out.println("By using switch...");
		int vowelCount = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			switch (ch) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
			case 'A':
			case 'E':
			case 'I':
			case 'O':
			case 'U':
				vowelCount++;
			}
		}
		System.out.println("Vowels: " + vowelCount);
		System.out.println("Consonants: " + (str.length() - vowelCount));

	}
}