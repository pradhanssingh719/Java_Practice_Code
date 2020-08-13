package TestPackage;

public class Test {

	public void finalize() {
		System.out.println("finalize called");
	}
	public static void main(String[] args) {
		String s1 = "singh";
		System.out.println(s1.hashCode());
		s1 = "meena";
		System.out.println(s1.hashCode());
		System.out.println(s1);
		System.gc();
	}
	

}
