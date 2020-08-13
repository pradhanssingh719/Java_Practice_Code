/**
 * find the pairs
 */
package array;

public class TwoD {

	public static void main(String[] args) {
		
		int[][] arr = {{1,2},{4,5},{3,2},{2,1},{1,2}};
		
		for(int[] x : arr) {
			for(int x1 : x) {
				System.out.println(x1 + " ");
			}
		}
	}

}
