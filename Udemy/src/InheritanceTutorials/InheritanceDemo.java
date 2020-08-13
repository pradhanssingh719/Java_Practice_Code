package InheritanceTutorials;

import Automobile.BMW;
import Automobile.Cars;

public class InheritanceDemo {
	int speed;
	public static void main(String[] args) {
		int speed = 0;
		
		Cars c1 = new Cars();
		c1.increaseSpeed(); 
		c1.publicSpeed = 10;
		
		
		BMW bmw1 = new BMW();
		bmw1.increaseSpeed();
		
		bmw1.headupDisplayNavigation();

	}

	

}
