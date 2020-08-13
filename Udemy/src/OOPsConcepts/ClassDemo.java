//setter and getter methods   (open Car.java file also)

package OOPsConcepts;

public class ClassDemo {
	
	public static void main(String[] args) 
	{
		Car bmw = new Car();     //create and initialize the object
		bmw.setMake("B M W");    //calling setter method
		System.out.println("Make of BMW is: "+ bmw.getMake());     //calling getter method
		
		System.out.println(bmw.getModel());   //we haven's assigned any value to model hence by default we will get default value
		
		Car benz = new Car();
		benz.setMake("Benz");
		System.out.println("Make of Benz id: "+ benz.getMake());
		
		
		benz.setModel("c300");
		System.out.println("Model of Benz is: "+ benz.getModel());
		
		benz.setYear(1800);
		System.out.println("Year of Benz is: "+ benz.getYear());   //if value is not matched then it will return default value 
	}

}
