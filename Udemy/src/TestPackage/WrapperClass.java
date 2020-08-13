package TestPackage;

public class WrapperClass {

	public static void main(String[] args) {
		
		//Integer to int
		Integer num = new Integer(10);
		int a = num.intValue();
		System.out.println("Integer: " + num);
		System.out.println("int: " + a);
		
		//int to Integer
		int b = 20;
		Integer num2 = Integer.valueOf(b);
		System.out.println("Integer: " + num2);
		System.out.println("int: " + b);
	}

}
