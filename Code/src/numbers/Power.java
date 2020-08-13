package numbers;

import java.util.Scanner;

public class Power{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter number: ");
		int number = scan.nextInt();
		System.out.print("Enter power: ");
		int power = scan.nextInt();
		scan.close();   //to prevent memory leak
		
		long result;
		
		result = power(number,power);
		System.out.println("Math.pow: " + number + " is to power " + power + " is: " + result);
		
		result = powerWithForLoop(number,power);
		System.out.println("For Loop: " + number + " is to power " + power + " is: " + result);
		
		result = powerWithWhileLoop(number,power);
		System.out.println("While Loop: " + number + " is to power " + power + " is: " + result);
	}
	
	//method 1
	public static long power(int number, int power){
		long result = (long)Math.pow(number,power);    //it will return double so we need to type cast it in to long
		return result;
	}
	//method 2
	public static long powerWithForLoop(int number, int power){
		long result = 1;
		for(int i=1; i<=power; i++){
			result *= number;
		}
		return result;
	}
	//method 3
	public static long powerWithWhileLoop(int number, int power){
		long result = 1;
		while(power>=1){
			result *= number;
			power--;
		}
		return result;
	}
}