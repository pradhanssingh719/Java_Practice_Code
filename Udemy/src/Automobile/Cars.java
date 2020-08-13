package Automobile;

public class Cars {
	
	//No Modifier - accessible in the same package
	int speed;
	
	//private variables and methods are only available in same class, we can not access them outside the class without using setter and getter method
	private int privateSpeed = 140;
	
	//public variables and methods are available anywhere in java world with importing the package and class
	public int publicSpeed;
	
	//In same package and in sub classes
	protected int protectedSpeed;
	
	int speedLimit = 100;
	
	/*public Cars(int startSpeed) {
		speed = startSpeed;
	}*/
	
	public void setPrivateSpeed(int pSpeed) {   //to access privateSpeed variable
		privateSpeed = pSpeed;
	}
	
	
	public void increaseSpeed() {
		speed++;
		System.out.println("Increasing Speed of cars");
	}
	
	protected void decreaseSpeed() {
		speed--;
		System.out.println("Decreasing Speed of cars");
		
		
	}
	
}
