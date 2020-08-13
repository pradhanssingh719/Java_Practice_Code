package exercises;

public class RandomNumber {

	public static void main(String[] args) {

		int n = 10;
		for(int i=0; i<n; i++) {
			int randomNum = (int)(Math.random()*9);   //by default it return double value
			System.out.println(randomNum);
		}

	}

}
