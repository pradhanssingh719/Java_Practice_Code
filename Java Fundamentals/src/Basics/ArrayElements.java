package Basics;

public class ArrayElements {

	public static void main(String[] args) {
		int[] arr = new int[4];
		
		byte b = 10;
		arr[0] = b;
		
		short s = 20;
		arr[1] = s;
		
		arr[2] = 'a';
		
		arr[3] = 12;
		
		for(int item:arr) {
			System.out.print(item+" ");
		}
		System.out.println();
		
		float[] farr = new float[4];
		farr[0] = 10l;
		for(float item:farr) {
			System.out.print(item+" ");
		}
		System.out.println();
		
		Object[] ob = new Object[4];
		ob[0] = new Object();
		ob[1] = new String("singh");
		ob[2] = new Integer(12);
		for(Object item : ob) {
			System.out.print(item+" ");
		}
		System.out.println();
		
		Number[] num = new Number[4];
		num[0] = new Integer(12);
		num[1] = new Double(10);
		for(Number item : num) {
			System.out.print(item+" ");
		}
		
	}

	
}
