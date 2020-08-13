package StaticPackage;

public class StaticDemo {

	public static void main(String[] args) {
		
		StaticExampleClass s1 = new StaticExampleClass("BMW");     //we calling constructor with string argument
		System.out.println("Make of Car is: "+ s1.getMake());
		System.out.println("This is instance no: " + StaticExampleClass.getInstanceNum());
		
		StaticExampleClass s2 = new StaticExampleClass("Benz");     //we calling constructor with string argument
		System.out.println("Make of Car is: "+ s2.getMake());
		System.out.println("This is instance no: " + StaticExampleClass.getInstanceNum());
		
		//System.out.println("Number of wheels are: :" + s1.noOfWheels());
		
	}
	
		
}
