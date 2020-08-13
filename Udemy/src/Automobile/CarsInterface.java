package Automobile;

public interface CarsInterface {
	
	
	public int speed = 100;
	
	public void engineStart(String enginType, boolean isKeyless);
	
	interface innerInter{
		public void method1();
	}
	
	public static void staticMethod() {
		System.out.println("non abstract method in side CarsInterface");
	}
	
	

}
