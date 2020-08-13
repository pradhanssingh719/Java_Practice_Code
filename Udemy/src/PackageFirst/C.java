//open A B C D E to compare 

package PackageFirst;

public class C extends A{
	public C() {
	
		System.out.println("dfdf");
	}
	{
		System.out.println("non static block C");
	}
	static {
		System.out.println("static block C");
	}
	public void display() {
		System.out.println("this is an example of modifier.cccc");
	}
	public static void main(String[] args) {
		
		//B b= new C();
		//b.display();
				
		/*
		 * B obj = new B(); obj.number = 3; obj.name = "From class C";
		 * System.out.println(obj.name + " " +obj.number); obj.display();
		 */
	
		//C obj1 = new C();
		//obj1.setPrivate(140); 
		//System.out.println(obj1.getPrivate());
		Object C = new C();
		//print();
	}

}
