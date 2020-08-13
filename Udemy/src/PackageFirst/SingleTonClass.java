package PackageFirst;

/**
 * first way to create singleton class
 */
public class SingleTonClass {

	private static SingleTonClass instance = null;
	private int i = 10;

	private SingleTonClass() {

	}

	public static void main(String[] args) {
		SingleTonClass obj1 = SingleTonClass.method();
		obj1.i = 20;
		System.out.println("value of i for obj1: " + obj1.i);

		SingleTonClass obj2 = SingleTonClass.method();
		System.out.println("value of i for obj2: " + obj2.i);

	}

	public static SingleTonClass method() {
		
		if (instance == null) {
			instance = new SingleTonClass();
		}
		return instance;
	}

}

/**
 * second way to create a singleton class
 */
//public class SingleTonClass {
//
//	private static SingleTonClass instance = new SingleTonClass();
//	private int i = 10;
//	private SingleTonClass(){
//		
//	}
//	public static void main(String[] args) {
//		SingleTonClass obj1 = SingleTonClass.method();
//		obj1.i = 20;
//		System.out.println("value of i for obj1: " + obj1.i);
//		
//		SingleTonClass obj2 = SingleTonClass.method();
//		System.out.println("value of i for obj2: " + obj2.i);
//
//	}
//	
//	public static SingleTonClass method() {
//		return instance;
//	}
//
//}