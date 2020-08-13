
public class Switch {
	
	public static void main(String args[]) {
		
		
		
		int n = 1; //we can also pass char like char c = 'A' and string in switch but java version 1.7 or higher is required for string
		
		//String d = "abc";
		switch(n) {
		
		case 1:
			System.out.println("one");
			break;
		case 2:
			System.out.println("two");
			break;
		case 3:
			System.out.println("three");
			break;
		case 4:
			System.out.println("four");
			break;
		case 5:
			System.out.println("five");
			break;
		case 6:
			System.out.println("six");
		default:
			System.out.println("No Match");
		
		}
		
	}

}
