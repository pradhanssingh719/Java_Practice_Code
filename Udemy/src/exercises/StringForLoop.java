package exercises;

public class StringForLoop {
	public static void main(String[] args) {
		
		String str = "This is an example of a string.";
		
		for(int i=0; i<str.length(); i++) {
			System.out.print(str.charAt(i));
		}
		System.out.println();
		System.out.println(str.concat(" !!concated string!!"));
		System.out.println(str);
		System.out.println(str.substring(5));
		System.out.println(str.substring(5,7));

		
	}

}
