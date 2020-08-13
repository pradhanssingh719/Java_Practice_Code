package StaticPackage;

public class StaticExampleClass {
	
	//private int wheelsCount = 4;
	private String make;
	private static int instanceNum = 0;
	
	public StaticExampleClass(String make) {
		this.make = make;
		instanceNum++;                           //it should be increase according to number of instances
	}
	
	public String getMake() {
		return make;
	}
	
	public static int getInstanceNum() {
		return instanceNum;
	}
	
	/*public int noOfWheels() {      //we can directly access static variable through instance area or method
		return wheelsCount;
	}*/
}
