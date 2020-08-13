package ExceptionTutorials;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class CheckedException {


	public static void main(String[] args)  {
		
		FileInputStream fName = null;
		
		try {
			fName = new FileInputStream("D:\\Programming (Imp)\\username.txt");
		}catch(FileNotFoundException excp) {
			System.out.println("Given file is not found at praticular location");
		}
		
		
		int k;
		
		try {
			while(( k = fName.read() ) != -1) 
			{ 
				System.out.print((char)k); 
			} 
		}catch(IOException excp) {
			System.out.println("sorry file not found");
		}catch(Exception excp) {
			System.out.println("generic exception handler or parent exception");
		}
		
	}
	
}
