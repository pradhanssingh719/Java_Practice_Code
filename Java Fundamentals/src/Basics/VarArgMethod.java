package Basics;

public class VarArgMethod {

	public static void main(String[] args) {
		
		sum();
		System.out.println(sum(10,20,20));
	}
	
	public static int sum(int ...x) {
		int total = 0;
		for(int item : x) {
			total += item;
		}
		//System.out.println(total);
		return total;
	}

	public static int sum(int x) {
		return 0;
	}
}

