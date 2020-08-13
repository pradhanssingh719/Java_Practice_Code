//open A B C D E to compare 

package PackageFirst;

public class A {

	public int n = 50;
	String name;
	int age;
	
	A(){
		print();
	}
	

	public static void main(String[] args) {

		/*
		 * B obj = new B(); obj.number = 1; obj.name = "From class A";
		 * System.out.println(obj.name + " " + obj.number); obj.display();
		 */
		// m1(2,2);
	}

	public void m1(int a, long b) {
		System.out.println("m1");
	}

	public void m1(long a, int b) {
		System.out.println("m1sec");
	}

	private void print() {
		System.out.println("private method from class A");
	}
	public static void staticMethod() {
		System.out.println("static method from class A");
	}

}
