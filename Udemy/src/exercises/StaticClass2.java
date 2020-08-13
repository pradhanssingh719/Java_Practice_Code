package exercises;

public class StaticClass2 {

	//instance variable
	int a = 10;
	//static variable
	static int b = 20;
	//instance method
	public void idisplay() {
		System.out.println("instance method from outer class");
	}
	//static method
	public static void sdisplay() {
		System.out.println("static method from outer class");
	}

	// static class
	static class staticInner {
		/**
		 * 1. static class have direct access to static variable and methods
		 * 2. static class can also access the instance variable and methods by creating the object of outer class
		 * 3. static class can have instance variable and methods as well
		 * 4. It makes the code less complex and more readable.
		 * 5. we can write additional static functionality inside nested static class.
		 */
		
		//instance variable
		int num = 30;
		//instance method
		public void iprint() {
			System.out.println("instance method from inner static class");
		}
		//static method
		public static void sprint() {
			System.out.println("static method from inner static class");
		}
		//inner static class can also have a main method but we need to call it explicitly
		//main method
		public static void main(String[] args) {
			System.out.println("main method from inner static class");
			//we need to create object for accessing instance variable to static method like we normally do
			staticInner obj = new staticInner();
			obj.iprint();
			//object for accessing outer class instance method and variables
			StaticClass2 obj2 = new StaticClass2();
			obj2.idisplay();
		}
	}

	// instance class
	class instanceInner {
		/**
		 * 1. instance class have direct access to static and instance method and variables
		 * 2. we can not create static method and variables in side instance class
		 */
		public void print() {
			//accessing instance variable
			System.out.println(a);
			//accessing static variable
			System.out.println(b);
			//static method
			sdisplay();
			//instance method
			idisplay();
		}
	}

	public static void main(String[] args) {
		//we can access static method and variable directly(without creating any object)
		staticInner.main(args);
		staticInner.sprint();
		//creating object for inner static class for accessing instance method and variables of static class
		StaticClass2.staticInner obj = new StaticClass2.staticInner();
		obj.iprint();
		

		System.out.println();
		//crating object for inner instance class
		//1. first we need to create object for outer class
		StaticClass2 outer = new StaticClass2();
		//2. then by using outer class object we can create the object of inner instance class
		instanceInner obj2 = outer.new instanceInner();

		obj2.print();
	}

}
