package Practice;

import Test.Base;

public class TestChild {
	
	public static void main(String[] args) {
		Base obj = new Base();
		Base.baseClassMethod();
		System.out.println();
		obj.instanceMethod();
	}

}
