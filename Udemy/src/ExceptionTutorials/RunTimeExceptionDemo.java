package ExceptionTutorials;

public class RunTimeExceptionDemo {

	public static void main(String[] args) {

		/*
		 * int a = 10; int b = 0; int c; try { c = a / b; System.out.println("output: "
		 * + c); } catch (ArithmeticException e) { //
		 * System.out.println(e.getMessage());
		 * System.out.println("Division by zero is not possible"); }
		 */

		int[] numbers = { 1, 2, 3 };

		try {
			for (int i = 0; i <= 3; i++) {
				System.out.println(numbers[i]);
			}
		}
		catch(Exception e){
			System.out.println(e.getMessage());
			System.out.println(e.getStackTrace());
			System.out.println(e.getCause());
			//e.printStackTrace();
		}

	}

}
