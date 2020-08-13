package Basics;

public class Variables {
	int x = 10;
	static int y = 10;

	public static void main(String[] args) {
		//non-static (instance variable)
		Variables obj = new Variables();
		System.out.println(obj.x);
		
		Variables obj2 = new Variables();
		obj2.x = 20;
		System.out.println(obj2.x);
		
		Variables obj3 = new Variables();
		System.out.println(obj3.x);
		
		System.out.println();
		
		//static variable
		System.out.println(Variables.y);
		y = 20;
		System.out.println(y);
	}
}
