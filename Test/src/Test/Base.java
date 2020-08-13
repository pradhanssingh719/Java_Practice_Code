package Test;

public class Base {
	
	int i;
	static int j;
	
	public Base() {
		i = 20;
		j = 30;
		System.out.println("base class consructor");
	}
	
	public static void baseClassMethod() {
		System.out.println("base class method");
	}
	public void instanceMethod() {
		System.out.println("instance method");
	}
}
