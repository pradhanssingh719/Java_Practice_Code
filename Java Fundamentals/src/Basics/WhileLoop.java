package Basics;

public class WhileLoop {
	

	public static void main(String[] args) {
		
		 String str = "pradhan singh meena neeraj chirag nyati";
	     String[] split = str.split(" ");
	     int i = 0;
	     System.out.println(split.length);
	     
	     //String name = split[2];
	     
	     //System.out.println(name.equals("meena"));
	     
	     while(!split[i].equals("chirag")) {
	    	 System.out.println(split[i]);
	    	 i++;
	     }
	     
	     
//	     //System.out.println(str);
//	     
//	     for(int i=0; i<split.length; i++) {
//	    	 System.out.println(split[i]);
//	     }
//	     System.out.println(split.length);
	}

}
