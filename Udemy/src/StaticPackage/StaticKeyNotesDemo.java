package StaticPackage;

public class StaticKeyNotesDemo {
	
	//static method cannot use the non-static variables or methods directly
	//"this" and "super" cannot be used in static context
	
	public int addNum = 10;
	public static int addNumStatic = 10;
	
	public static void main(String[] args) {
		
		StaticKeyNotesDemo s1 = new StaticKeyNotesDemo();
		int output = s1.sum(20);
		int staticOutput = sumStatic(20);
		System.out.println("The output is: "+ output);
		System.out.println("The output is: "+ staticOutput);
		
	}
	
	public int sum(int num) {
		return num+addNum;
	}
	
	public static int sumStatic(int num) {
		return num+addNumStatic;
	}
}
