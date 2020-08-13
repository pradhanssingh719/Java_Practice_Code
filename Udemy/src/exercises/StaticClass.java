package exercises;

public class StaticClass {

	int instanceInt = 5;
	static int staticInt = 10;
	
	public static void staticPrint() {
		System.out.println("static print method");
	}
	
	public void nonStaticPrint() {
		System.out.println("non static print method");
	}
	
	//nested static class
	//can not access instance variables and method directly
	static class InnerStatic{
		//StaticClass obj = new StaticClass();               //by creating top class object we can access instance variables and methods
		void display() {
			System.out.println("nested static class");
			System.out.println(staticInt);
			staticPrint();
			//obj.nonStaticPrint();
		}
	}
	
	//nested instance class
	//can access static and instance variables and methods directly
	class InnerInstance{
		void display() {
			System.out.println("nested Instance class");
			System.out.println(staticInt);
			System.out.println(instanceInt);
			staticPrint();
			nonStaticPrint();
		}
	}
	
	public static void main(String[] args) {
		StaticClass.InnerStatic staticObj = new StaticClass.InnerStatic();
		staticObj.display();
		
		System.out.println();
		
		StaticClass outer = new StaticClass();
		StaticClass.InnerInstance instanceObj =  outer.new InnerInstance();
		//we can initialize this object in single line as well
		//StaticClass.InnerInstance instanceObj = new StaticClass().new InnerInstance();
		instanceObj.display();
	}

}
