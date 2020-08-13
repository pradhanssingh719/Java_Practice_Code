package Automobile;

public class BMW extends Cars{
	
	/*public BMW(int startSpeed) {
		super(startSpeed);
	}*/

	
	public void increaseSpeed() {
		protectedSpeed++;
		Cars c1 = new Cars();
		
		c1.decreaseSpeed();
		System.out.println("Increasing speed of BMW");
	}
	
	public void headupDisplayNavigation() {
		System.out.println("BMW Specific Functionality....");
	}
	
	
	/*public void increaseSpeed(int speed) {
		
	}*/

}
