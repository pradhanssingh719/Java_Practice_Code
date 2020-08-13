package exercises;

import java.util.Scanner;

public class Palindrome2 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("enter string: ");
		String input = scan.next();
		scan.close();
		
		char[] arr = input.toCharArray();
		
		boolean result = isPalindrome(arr);
		System.out.println(result);
	}
	
	static boolean isPalindrome(char[] str) {
		
		int size = str.length;
		int i = 0;
		int j = size - 1;
		
		while(i < j) {
			if(str[i] != str[j])
				return false;
			i++;
			j--;
		}
		return true;
	}

}
