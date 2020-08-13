package exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DuplicateRemovalString {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Entetr string: ");
		String input = scan.next();
		scan.close();
		duplicateRemove(input);
	}

	public static void duplicateRemove(String str) {
		String output = "";
		int length = str.length();
		List<Character> aList = new ArrayList<Character>();
		
		for (int i = 0; i < length; i++) {
			boolean flag = false;
			for (int j = i + 1; j < length; j++) {
				if (str.charAt(i) == str.charAt(j)) {
					flag = true;
					break;
				}
			}
			if (flag == false) {
				//output += str.charAt(i);
				aList.add(str.charAt(i));
			}
		}
		//System.out.print(output);
		for(char ch : aList) {					//with array list
			System.out.print(ch);  
		}
	}

}
