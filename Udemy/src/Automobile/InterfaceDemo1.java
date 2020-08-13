package Automobile;

public class InterfaceDemo1 {

	public static void main(String[] args) {
		CarsInterface myInterface = new InterfaceDemo();
		myInterface.engineStart("6 Cyl", true);

	}

	public void demoMethod() {
		System.out.println("method from InterfaceDemo1");
	}
}
