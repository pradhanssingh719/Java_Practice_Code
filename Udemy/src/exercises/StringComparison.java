package exercises;

public class StringComparison {

	public static void main(String[] args) {
	
		String s1="chirag";
		String s2=new String("chirag");
		String s3 = "pradhan";
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		if(s1.equals(s2)) {
			System.out.println("equal");
		}
		
		if(s1==s2) 
			System.out.println("s1==s2");
		else 
			System.out.println("s1!=s2");

	}

}
