package exercises;

public class StaticAndNonStaticBlock {
	
	static String str1;
	public StaticAndNonStaticBlock(){
		System.out.println("constructor");
	}
	
	{
		System.out.println("non static block");
	}
	static {
		System.out.println("static block");
		str1 = "apple";
	}
	
	public static void main(String[] args) {
		StaticAndNonStaticBlock obj = new StaticAndNonStaticBlock();
		System.out.println("main method");
		System.out.println(str1);
	}

}
