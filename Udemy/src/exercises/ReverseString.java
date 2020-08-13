package exercises;

public class ReverseString {

	public static void main(String[] args) {
		
		String input = "this is a test string";
		String output = reverse(input);
		System.out.println(output);
	}
	
	private static String reverse(String input) {
		String reverse = "";
		
		if(input.isEmpty() || input == null) {                             //condition check for empty and null string
			System.out.println("Empty and null strings are not accepted");
		}
		if(input.length() <=1) {       //if length is 1 and (means single character string) return the same string
			reverse = input;
		}else{
			String[] arr = input.split("\\s+");   //  "\\s+" first "\" for escape sequence and '\' for regexp (regular expression) "+" for removing multiple spaces (is any)
			
			for(String item : arr) {         //this, is, a, test, string
				reverse = item +" "+ reverse;     //this + "", is + this, a + is this, test + a is this, string + test a is this
			}
		}
		
		return reverse.trim(); 
	}

}
