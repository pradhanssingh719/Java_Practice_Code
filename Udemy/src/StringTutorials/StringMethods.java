package StringTutorials;

public class StringMethods {
	
public static void main(String[] args) {
		
		String s = "This is a test string.";
		String s1 = "Hello";
		String s2 = "Hello";
		String s3 = "Hi";
		String s4 = "";
		String s5 = " spaces all around    ";
		String s6 = "Hello buddy";
		
		
		System.out.println("Lenght of the string is: "+ s.length());
		System.out.println("Character at index 3 is: "+ s.charAt(3));
		System.out.println(s.concat("this is the appended string"));
		System.out.println("contains check 1: "+ s.contains("is"));
		System.out.println("contains check 1: "+ s.contains("no-one"));
		System.out.println("starts with check: "+ s.startsWith("this"));
		System.out.println("ends with check: "+ s.endsWith("string."));
		System.out.println("check cotents are equal: "+ s1.equals(s2));
		System.out.println("check contents are equal: "+ s1.equals(s3));
		System.out.println("index of 's' is: "+ s.indexOf('s'));
		System.out.println("index of 'q' is: "+ s.indexOf('q'));     //return -1 bcz q is not there in string
		System.out.println("check if string is empty 1: "+ s3.isEmpty());
		System.out.println("check if string is empty 2: "+s4.isEmpty());
		System.out.println("trim the leading and trailing spaces: "+s5.trim());
		System.out.println("replace example: "+ s6.replace('o','h'));
		System.out.println("Hi, my name is: "+ s6.substring(6));    //returning everything after 6th character
		System.out.println("substring example: "+ s.substring(5, 11));  //return including 5th character and excluding 11th character
		
		char[] charArray = s.toCharArray();
		System.out.print("charArray output is: ");
		for(int i=0; i<charArray.length; i++)
		{
			System.out.println("index of "+i+" is: " + charArray[i]);
		}
		
		System.out.println("\nLower case: "+ s.toLowerCase());
		System.out.println("Upper Case: "+ s.toUpperCase());
	}
}
