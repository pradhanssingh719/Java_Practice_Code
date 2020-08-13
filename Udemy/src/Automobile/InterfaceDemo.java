package Automobile;

public class InterfaceDemo extends InterfaceDemo1 implements CarsInterface, BMWCarsInterface{

	@Override     
	public void engineStart(String enginType, boolean isKeyless) {    //implementation of interface variable is optional but methods must be implemented
		System.out.println("This is the implementation");
	}

	@Override
	public void headsUpNavigation() {
		System.out.println("this is the headsUpNavigation");
	}
	
	//come from nested interface (CarInterface)
	/*
	 * @Override public void method1() {
	 * System.out.println("method from inner interface");
	 * 
	 * }
	 */
	
//	public static void staticMethod() {
//		System.out.println("non abstract method in side InterfaceDemo");
//	}
	
	

	public static void main(String[] args) {
		InterfaceDemo obj = new InterfaceDemo();
		obj.engineStart("4 cyl", false);
		obj.headsUpNavigation();
		obj.demoMethod();
		//obj.method1();
		//staticMethod();
		
		//obj.speed = 200;
		
		System.out.println(obj.speed);
	}

}
