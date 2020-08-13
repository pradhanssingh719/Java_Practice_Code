package character;

import java.util.Scanner;

public class Vowel{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter char: ");
		char input = scan.next().charAt(0);    //taking char as input
		scan.close();
		
		checkWithSwitch(input);
		System.out.print("\n");
		checkWithIfElse(input);
	}
	//method 1
	public static void checkWithIfElse(char c){
		System.out.println("By using if else...");
		char ch = Character.toLowerCase(c);     // first we convert char to lower case so there is no need to check for upper case alphabet
		//checking for vowel
		if( ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
			System.out.println("YES, Given character is a vowel.");
		}else{
			if(ch >= 'a' && ch <= 'z'){
				System.out.println("NO, Given character is a consonant.");
			}else{
				System.out.println("Given character is NOT an alphabet.");
			}
		}
	}
	//method 2
	public static void checkWithSwitch(char ch){
		//here no need to convert char to lowercase...we are checking for both lower and upper case
		System.out.println("By using switch...");
		boolean isVowel = false;
		switch (ch)
		{
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
			case 'A':
			case 'E':
			case 'I':
			case 'O':
			case 'U': isVowel = true;
		}
		if(isVowel){
			System.out.println("YES, Given character is a vowel.");
		}else{
			if((ch >= 'a' && ch <= 'z') || (ch >= 'a' && ch <= 'z')){
				System.out.println("NO, Given character is a consonant.");
			}else{
				System.out.println("Given character is NOT an alphabet.");
			}
		}
	}
}