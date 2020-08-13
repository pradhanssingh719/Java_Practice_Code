import java.util.Scanner;

public class ReverseString {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter string: ");
		String s = scan.nextLine();
		scan.close();
		//String s = "pradhan singh meena";
		
		System.out.println("Reversed String: "+ reverse(s));
		
		/*for(int i=arr.length-1; i>=0; i--) {             //printing reversed string using using for-loop
			if(i == 0) {                          
				System.out.print(arr[i]);
			}else
				System.out.print(arr[i]+" ");
		}*/
		
	}
	
	public static String reverse(String s) {
		String reverse = "";
		
		String[] arr = s.split(" ");                //after storing string into array se can directly print it by using for-loop
		
		for(String item : arr) {
			reverse = item + " " + reverse;
		}
		return reverse.trim();	
	}

}
