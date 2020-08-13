package Automobile;

public abstract class AbstractCars {

	private int privateSpeed;
	public int publicSpeed;
	protected int protectedSpeed;

	int speedLimit = 100;

	public AbstractCars() {
		this(0);
	}

	public AbstractCars(int startSpeed) {
		this.privateSpeed = startSpeed;
	}

	public void setPrivateSpeed(int pSpeed) {
		this.privateSpeed = pSpeed;
	}

	public abstract void enginStart(String keyType, int numOfCyl);

	public void enginStart() {
		System.out.println("Engin is Started...");
	}
	
	public int squre(int n) {
		return n*n;
	}
}
