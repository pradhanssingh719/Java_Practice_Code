package ExceptionTutorials;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ThrowsAndThrow {

	public static void main(String[] args) throws FileNotFoundException {

		FileInputStream fName = null;
		try {
		fName = new FileInputStream("D:\\Programming (Imp)\\usernme.txt");

//		catch(FileNotFoundException excp) {
//			System.out.println("Given file is not found at praticular location");
//		}

		int k;

		while ((k = fName.read()) != -1) {
			System.out.print((char) k);
		}
		
		}catch(IOException e) {
			System.out.println(e.getLocalizedMessage());
		}
		System.out.println();
		method1(2);
	}

	// throw
	public static void method1(int age){

		if (age < 18) {
			throw new ArithmeticException("not Eligible for voting");
		}else {
			System.out.println("Eligible for voting");
		}
	}

}
