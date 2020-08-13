package MethodOverriding;

/***
 * 1. Arguments List
 * 
 *
 */

public class CarChild extends CarParent {
	
	/*
	 * public CarChild() { super(); System.out.println("child default constructor");
	 * }
	 */
	
	/*
	 * public CarChild(int x) { speed = x; System.out.println("child speed: " +
	 * speed); }
	 */
	

	public static void main(String[] args) {
		//CarChild c1 = new CarChild();
		//CarParent c1 = new CarParent(); 
		CarParent c1 = new CarChild();					// we are assigning parent class reference to child class object..(THIS IS KNOWS AS DYNAMIC METHOD DISPATCH)
		c1.increaseSpeed();
		c1.engineStart(2);
		//c1.staticExample();      //we can not access child method by creating parent reference or object
	}

	  @Override 											//it's a part of good coding practice but not mandatory
	  public void engineStart(int cyl) { 				//method overriding (same method present in parent class) 
	  //super.engineStart(4); 							//by using "super" keyword first we are calling parent class method then our child class method will call
	  System.out.println("I am from the child class");
	  
	  }

	  
	
	  public void increaseSpeed() {
	  System.out.println("I am icreases speed from child class"); 
	  }
	 
	 
	
	  public void staticExample() { 					//static can not be overridden
	  System.out.println("I am static from child class"); 
	  }
	  
	 
}
