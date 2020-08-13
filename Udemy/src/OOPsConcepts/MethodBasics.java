package OOPsConcepts;

public class MethodBasics {
	
	public static void main(String[] args) 
	{
		String grade;
		String studentName;
		
		studentName = "John";      //it's always better to use variable instead of using hard coded name 
		grade = findGrades(90);     //this is how we capture the value from return type...(we need to store value of return type method in a variable)
		displayGrades(studentName, grade);   //if method is not returning anything(means only for used to print value) then we can that method directly 
		
		studentName = "Tom";
		grade = findGrades(80);
		displayGrades(studentName, grade);
		
		grade = findGrades(50);
		displayGrades("singh", grade);
		
	}
	
	public static String findGrades(int score)  //java creates local variables with these name so cannot declare them again
	{
		//String studentName = "john";               //we already created studentName and score in side the method argument so there is no need to create them agian
		//int score  = 90;
		
		String grade;
		if(score >= 90 && score <= 100) {
			grade = "A";
		}else if(score >= 80 && score < 90) {
			grade = "B";
		}else if(score >= 70 && score < 80) {
			grade = "C";
		}else
			grade = "D";
		
		return grade;
		
	}
	
	public static void displayGrades(String studentName, String grade)
	{
		System.out.println("***************************");
		System.out.println("Grade of " + studentName + " is: " + grade);
		System.out.println("***************************");

	}

}
