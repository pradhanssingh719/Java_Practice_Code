package exercises;

public class StringExample {

	public static void main(String[] args) {
		String s1 = "pradhan";
		concat1(s1);
		System.out.println(s1);
		
		StringBuilder s2 = new StringBuilder("pradhan");
		concat2(s2);
		System.out.println(s2);
		
		StringBuffer s3 = new StringBuffer("pradhan");
		concat3(s3);
		System.out.println(s3);
		
		//string to string builder
		StringBuilder s4 = new StringBuilder(s1);
		s4.reverse();
		System.out.println(s4);
		
		//string to string buffer
		StringBuffer s5 = new StringBuffer(s1);
		System.out.println(s5);
		
		//string buffer/string builder to string
		String str = s2.toString();
		s2.append(" meena");
		System.out.println(str);
		System.out.println(s2);
		
		
		//string builder to string buffer   "there is no direct way for this type of conversion first we need to convert them into string "
		StringBuilder sbr = new StringBuilder("geeks");
		String str1 = sbr.toString();
		StringBuffer sbfr = new StringBuffer(str1);
		
		
	}
	
	public static void concat1(String s1) {
		s1 = s1 + " singh";
	}
	public static void concat2(StringBuilder s2) {
		s2.append(" singh");
	}
	public static void concat3(StringBuffer s3) {
		s3.append(" meena");
	}
	
}
