package string;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Palindrome {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter string: ");
		String input = scan.next();
		scan.close();
		boolean result;

//		result = withWhileLoop(input);
//		result = withQueue(input);
		result = withStack(input);
		System.out.println(result);
	}

	// method 1
	public static boolean withWhileLoop(String str) {
		String rev = "";
		int size = str.length();
		int index = size - 1;
		while (index >= 0) {
			rev = rev + str.charAt(index);
			index--;
		}
		if (str.equals(rev)) {
			return true;
		} else {
			return false;
		}
	}

	// method 2
	public static boolean withQueue(String str) {

		String rev = "";
		Queue<Character> que = new LinkedList<Character>();

		for (int i = str.length() - 1; i >= 0; i--) {
			que.add(str.charAt(i));
		}
		System.out.println(que);    //check point for cross check

		while (!que.isEmpty()) {
			rev = rev + que.remove();
		}
		System.out.println(rev);   //check point for cross check
		
		if (str.equals(rev)) {
			return true;
		} else {
			return false;
		}
	}

	// method 3
	public static boolean withStack(String str) {

		String rev = "";
		Stack<Character> stack = new Stack<Character>();

		for (int i = 0; i < str.length(); i++) {
			stack.push(str.charAt(i));
		}
		System.out.println(stack);    //check point for cross check

		while (!stack.isEmpty()) {
			rev = rev + stack.pop();
		}
		System.out.println(rev);    //check point for cross check
		
		if (str.equals(rev)) {
			return true;
		} else {
			return false;
		}
	}
}
