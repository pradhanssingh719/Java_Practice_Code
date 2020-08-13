package year;

import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Year: ");
		int year = scan.nextInt();
		scan.close(); // to prevent memory leak
		leapYear(year);
	}

	public static void leapYear(int year) {
		// divided by 4
		if (year % 4 == 0) {			 // year%4 it will return "0" if divided evenly
			if (year % 100 == 0) {
				if (year % 400 == 0) {
					System.out.println("YES, It's a leap year.");
				} else {
					System.out.println("NO, It's not a leap year.");
				}
			} else {
				System.out.println("YES, It's a leap year.");
			}
		} else {
			System.out.println("NO, It's not a leap year.");
		}
	}

}
