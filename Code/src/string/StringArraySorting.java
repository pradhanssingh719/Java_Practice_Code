package string;

/***
*input: pradhan singh meena
*output: meena pradhan singh
*sorting in alphabetic order
*/
import java.util.Scanner;

public class StringArraySorting {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter string array size: ");
		int size = scan.nextInt();
		String[] str = new String[size];
		System.out.print("Enter Strings: ");
		for (int i = 0; i < size; i++) {
			str[i] = scan.next();
		}
		scan.close();

		sorting(str);
		System.out.print("Sorted StringArray: ");
		for (String item : str) {
			System.out.print(item + " ");
		}
	}

	public static void sorting(String[] str) {
		int size = str.length;
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size - 1 - i; j++) {
				if (str[j].compareTo(str[j + 1]) > 0) { // .compareTo is used for comparing two strings
					String temp = str[j];
					str[j] = str[j + 1];
					str[j + 1] = temp;
				}
			}
		}
	}
}