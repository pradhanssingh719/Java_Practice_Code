//open ClassDemo.java file also

package OOPsConcepts;

public class Car {
			
		//just for understanding what is class and objects

		//color                         //these four are the state of an object 
		private String color;			//state is more over related to how an object is looks like
		//make
		private String make;
		//model
		private String model;
		//year
		private int year;
		
		public void increaseSpeed()				//this one is the behavior of and object
		{
			System.out.println("Increasing the speed");   //behavior is more over related to functionality of an object
		}
	
		public String getMake() {
			return this.make;       //"this" refers to the instance of the class (object)
		}
		
		public void setMake(String make) {
			this.make = make;
		}
		

		public String getColor() {
			return color;
		}

		public void setColor(String color) {
			this.color = color;
		}

		public String getModel() {
			return model;
		}

		public void setModel(String model) {
			this.model = model;
		}

		public int getYear() {
			return year;
		}

		public void setYear(int year) {
			if(year > 1900){
				this.year = year;
			}else {
				System.out.println("This year is not valid.");
			}
			
		}
}
	
