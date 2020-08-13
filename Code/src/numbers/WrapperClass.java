package numbers;

public class WrapperClass {

	public static void main(String[] args) {
		
		//int to Integer Object
		int i = 10;
		Integer value = Integer.valueOf(i);
		System.out.println(value.getClass().getName());  //these kind of method only available for objects
		
		//Integer object to int
		int num = value.intValue();
		System.out.println(num);					//not for primitive data type
	}

}
