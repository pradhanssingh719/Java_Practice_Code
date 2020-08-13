//I used this class for ConstructorDemo 

package OOPsConcepts;

public class ConstructorDemoCarFile {
	
	private String make;
	int speed;
	int gear;
	
	public ConstructorDemoCarFile() {     //this is the default constructor and it will execute as soon as an object is created
		//this(10,2);								//this is how we can call a constructor inside a constructor
		this.speed = 0;						//we are assigned some default values (if there is no value assigned to the variable then by default these values will be assigned)
		this.gear = 0;
		System.out.println("Executing constructor without arguments");
	}
	
	public ConstructorDemoCarFile(int speed, int gear) {  //constructor with arguments
		this.speed = speed;
		this.gear = gear;
		System.out.println("Executing constructor with arguments");	
	}
	
	public void setMake(String make) {   //setter method
		this.make = make;					//"this" refers to the instance of the class (object)
	}
 	
	public String getMake() {            //getter method
		return this.make;
	}

}
