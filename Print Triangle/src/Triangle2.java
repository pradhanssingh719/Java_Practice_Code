import java.util.Scanner;

public class Triangle2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = scan.nextInt();
		scan.close();
		
		for(int i=1; i<=n; i++) {
			for(int j=(n-i); j>0; j--) {
				System.out.print(" ");
			}
			for(int k=1; k<=i; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}		

	}

}
