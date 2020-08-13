package InheritanceTutorials;

import Automobile.Cars;

public class Honda extends Cars{
	
	public void increaseHondaSpeed() {
		Cars c1 = new Cars();
		c1.publicSpeed = 10;
		c1.setPrivateSpeed(10);
		protectedSpeed = 100;
		
		InheritanceDemo i1 = new InheritanceDemo();
		i1.speed = 10;
	}
	
}
