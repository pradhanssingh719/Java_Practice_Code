package exercises;

import java.util.Scanner;

class CountingCharacters {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("Enter String: ");
		String s = scan.next();
		scan.close();
		
		String newstr = "";
		int count = 1;
		
		//single for loop                   //aabbc
		for(int i=0; i<s.length()-1; i++) {
			
			if(s.charAt(i) == s.charAt(i+1)) {
				 count++;
			}else {
				newstr = newstr+Integer.toString(count)+s.charAt(i);
				count = 1;
			}
			
		}
		newstr = newstr+Integer.toString(count)+s.charAt(s.length()-1);
		System.out.println(newstr);
		
		
		
		//double for loop
//		for (int i = 0; i < s.length(); i++) { // aaaabbbccd
//
//			int count = 1;
//			char c = s.charAt(i);
//
//			for (int j = i + 1; j < s.length(); j++) {
//				if (s.charAt(i) == s.charAt(j)) {
//					count++;
//					i++;
//				} else {
//					break;
//				}
//			}
//			System.out.print(count);
//			System.out.print(c);
//		}
	}

}
