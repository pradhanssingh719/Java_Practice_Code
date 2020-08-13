package ExceptionTutorials;

public class TryCatchFinally {

	public static void main(String[] args) {

		System.out.println("Before try catch Block");

		int a = 10, b = 0;

		try {
			int c = a / b;
			System.out.println(c);
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
		}catch (Exception e) {
			System.out.println("parent class of all exceptions");
		}
		finally {
			System.out.println("I will always execute no matter wether exception is handled or not");
		}
		System.out.println("after try catch block");
	}

}
