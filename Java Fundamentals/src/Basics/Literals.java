package Basics;

public class Literals {

	public static void main(String[] args) {
		
		int decimal = 127;
		System.out.println(decimal);
		
		int binary = 0b101;
		System.out.println(binary);
		
		int octal = 0127;
		System.out.println(octal);
		
		int hexa = 0X127;
		System.out.println(hexa);
		
		long l = 10;
		System.out.println(l);
		
		float f = 10.2f;
		System.out.println(f);
		
		double d = 10F;
		System.out.println(d);
		
		double hex = 0127;
		System.out.println(hex);
		
		double exponential = 1e2;
		System.out.println(exponential);
		
		int exp = (int) 1e2;
		System.out.println(exp);
		
		boolean b = false;
		System.out.println(b);
		
		
		char chHex = 0x61;
		System.out.println(chHex);
		
		char chOctal = 0777;
		System.out.println(chOctal);
		
		char unicode = '\u0061';     //unicode representation   ( \\uXXXX four digit hexadecimal code)
		System.out.println(unicode);
		
		char newLine = '\n';
		char tab = '\t';
		char carriageReturn = '\r';
		char backSpace = '\b';
		char formFeed = '\f';
		
		char singleQuote = '\'';
		char doubleQuote = '\"';
		char backSlash = '\\';
		
		
		//underscore between digits
		double x = 123_45.34__54; 	 
		System.out.println(x);

	}

}
