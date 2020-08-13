package Automobile;

public class AbstractDemoBMW extends AbstractCars {

	public static void main(String[] args) {
		AbstractCars obj = new AbstractDemoBMW();
		obj.setPrivateSpeed(20);

		int output = obj.squre(2);
		System.out.println(output);

	}

	public void setPrivateSpeed(int speed) {
		super.setPrivateSpeed(10);
	}

//	public void enginStart() {
//		super.enginStart();
//		System.out.println("BMW have keyless engin start.");
//	}

	@Override
	public void enginStart(String keyType, int numOfCyl) {
		System.out.println("This is the BMW engin start");
	}
	
	public int squre(int x) {
		return super.squre(x);
	}
}
