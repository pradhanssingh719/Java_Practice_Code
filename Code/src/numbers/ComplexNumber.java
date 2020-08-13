package numbers;

public class ComplexNumber{

	double real, imaginary;
	
	public ComplexNumber(double r, double imag){
		this.real = r;
		this.imaginary = imag;
	}
	
	public static void main(String[] args){
		
		ComplexNumber comp1 = new ComplexNumber(2, 2.5);
		ComplexNumber comp2 = new ComplexNumber(3, 1.2);
		
		//we can add real and imaginary part like this also...with out creating another method
		//double realSum = comp1.real + comp2.real;
		//double imagSum = comp1.imaginary + comp2.imaginary;
		
		ComplexNumber result = sum(comp1, comp2);
		System.out.println(result.real + " + " + result.imaginary + "i");
	}
	
	public static ComplexNumber sum(ComplexNumber c1, ComplexNumber c2){
		//creating temporary complex number for holding sum
		ComplexNumber temp = new ComplexNumber(0,0);
		temp.real = c1.real + c2.real;
		temp.imaginary = c1.imaginary + c2.imaginary;
		return temp;
	}
	
}