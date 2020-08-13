//open A B C D E to compare 

package PackageFirst;

import java.lang.reflect.Method;

//import PackageFirst.A;

public class B extends A{
	
	int rollNo;
	
	public B() {
		//super();
	}
////	public B(String name, int age, int rollNo){
////		this.rollNo = rollNo;
////	}
//	
//
//	{
//		System.out.println("non static block B");
//	}
//	static {
//		System.out.println("static block B");
//	}



	public void display() {
		System.out.println("this is an example of modifier.");
	}

	/*
	 * getter and setter method public void setPrivate(int number) { this.number =
	 * number; } public int getPrivate() { return this.number; }
	 */

	public static void main(String[] args) {
		//B obj1 = new B("singh", 25, 6);
		B obj2 = new B();
		//System.out.println(obj.hashCode());
		obj2.print();
		A.staticMethod();
		//A oa = new A();
		
		//for accessing private method from class a using reflection API
//		try {
//		Class co = oa.getClass();
//		Method mo = co.getDeclaredMethod("print");
//		mo.setAccessible(true);
//	    System.out.println(mo.invoke(oa));
//		}catch(Exception e){
//			
//		}
		

		//m1(1,2);
	}
	public void print() {
		
		System.out.println("static method from class B");
	}
}
