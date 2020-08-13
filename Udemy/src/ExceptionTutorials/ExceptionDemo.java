package ExceptionTutorials;

import java.sql.SQLException;

public class ExceptionDemo {

	public static void main(String[] args) {

		Account acc = new Account();
		try {
			System.out.println("1st line");
			acc.withdraw(100);
			System.out.println("After trying the withdrow method");
		} catch (SQLException e) {
			// System.out.println(e.getMessage());
			System.out.println("Try again at some other time");
		}
		finally {
			System.out.println("Always execute");
		}

	}

}
