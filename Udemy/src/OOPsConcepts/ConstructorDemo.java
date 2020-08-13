package OOPsConcepts;

public class ConstructorDemo {
	
	public static void main(String[] args) {
		
		ConstructorDemoCarFile c1 = new ConstructorDemoCarFile();
		
		c1.setMake("BMW");
		System.out.println(c1.getMake());
		
		
		System.out.println(c1.speed);
		System.out.println(c1.gear);
		
		
		System.out.println("****************");
		
		ConstructorDemoCarFile c2 = new ConstructorDemoCarFile(10,1);	 
		System.out.println(c2.speed);
		System.out.println(c2.gear);
		
	}

}
