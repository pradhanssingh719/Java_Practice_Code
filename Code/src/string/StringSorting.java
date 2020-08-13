package string;
/***
*input: pradhan
*output: aadhnpr
*sorting in alphabetic order
*/
import java.util.Scanner;

public class StringSorting {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter string: ");
		String input = scan.next();
		scan.close();
		
		//converting string to char array
		char[] ch = input.toCharArray();
		int size = ch.length;
		
		//int array for holding corresponding ASCII value of characters
		int[] num = new int[size];
		//converting char to int
		for(int i=0; i<size; i++){
			num[i] = ch[i];
		}
		
		//sorting num array by using bubble sort
		for(int i=0; i<size; i++){
			for(int j=0; j<size-1-i; j++){
				if(num[j] > num[j+1]){
					int temp = num[j];
					num[j] = num[j+1];
					num[j+1] = temp;
				}
			}
		}
		
		//converting int to cahr again
		for(int i=0; i<size; i++){
			ch[i] = (char)num[i];             //type casting required
		}
		
		//converting char array to string
		String output = String.valueOf(ch);
		System.out.println("Sorted String: " +output);	
	}
}