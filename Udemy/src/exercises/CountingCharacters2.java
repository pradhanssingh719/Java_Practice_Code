package exercises;

import java.util.Scanner;

public class CountingCharacters2 {

	public static void main(String[] args) {          //2a2b2c
		Scanner scan = new Scanner(System.in);
		System.out.print("enter string for example \"2a3b4c\": ");
		String s = scan.next();;
		scan.close();
		
		for(int i=0; i<s.length(); i++) {
			int num = Character.getNumericValue(s.charAt(i));
			i++;
			while(num > 0) {
				System.out.print(s.charAt(i));
				num--;
			}
		}
	}

}
