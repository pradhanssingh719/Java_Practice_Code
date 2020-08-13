package Basics;

public class Arrays {
	int[] z;
	public static void main(String[] args) {
		
		int[] a = {1,2,3}; 
		
		System.out.println(a.getClass().getName());
		
		double[] d = {12,34,1.2,0.1};
		System.out.println(d.getClass().getName());
		
		char[] c = {'a','b','c'};
		System.out.println(c.getClass().getName());

		boolean[] b = {true,false,true};
		System.out.println(b.getClass().getName());
		
		String[] s = {"true","singh","meena"};
		System.out.println(s.getClass().getName());
		
		System.out.println(s.length);
		System.out.println(s[2].length());
		
		int[] arr = new int['d'];
		System.out.println(arr.length);
		
		
		long xyz[] = {214748364823l,23,23,4,234234,234};
		System.out.println(xyz.getClass().getName());
		
		//long largerArray[] = new long[2147483647];
		
		System.out.println(a);     //trying to print reference variable
		
//		int[][] td = new int[2][];
//		System.out.println(td);
//		System.out.println(td[0]);
//		System.out.println(td[0][0]);
		
		Arrays obj = new Arrays();
		System.out.println(obj.z[0]);
	}
	

}
