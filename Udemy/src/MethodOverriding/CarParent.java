package MethodOverriding;

public class CarParent {
	
	int speed = 0;
	String name;
	

	/*
	 * public CarParent() { this(10,"singh");
	 * System.out.println("parent default constructor"); }
	 * 
	 * public CarParent(int x) { speed = x; System.out.println("parent speed: " +
	 * speed); }
	 * 
	 * public CarParent(int x, String s) { speed = x; name = s;
	 * System.out.println("parent speed: " + speed);
	 * System.out.println("parent name: " + name); }
	 */
	
	
	public void increaseSpeed() {
		System.out.println("I am icreases speed from parent class");
	}
	
	public void engineStart(int cyl) {
		System.out.println("I am from the parent class");
	}
	
	
	
	
	/*
	 * public static void staticExample() {
	 * System.out.println("I am static from parent class"); }
	 */
}
