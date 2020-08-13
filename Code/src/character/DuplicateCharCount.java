package character;

import java.util.Scanner;
import java.util.Map;
import java.util.LinkedHashMap;

public class DuplicateCharCount{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter String: ");
		String input = scan.nextLine();
		scan.close();
		//countDuplicateChar(input);
		withMap(input);
	}
	//method 1
	public static void countDuplicateChar(String str){

		for(int i=0; i<str.length(); i++){
			int count = 1;
			for(int j=i+1; j<str.length(); j++){
				if(str.charAt(i) == str.charAt(j)){
					count++;
				}
			}
			System.out.println(str.charAt(i) +": " + count);
			String rep = String.valueOf(str.charAt(i));       //getting char value and storing it in to string
			str = str.replaceAll(rep,"");					//replace that character, once counting is done for that particular character
			i--;
		}
	}
	//method 2
	public static void withMap(String str){
		char[] arr = str.toCharArray();        
		/**
		*first we converted string into char array.
		*we are storing character as key and count as value in map
		*/
		
		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		
		for(char ch : arr){
			if(map.containsKey(ch)){                //if character already present then add new one with increased value...it will replace previous one
				map.put(ch, map.get(ch)+1);
			}else{									//if not present then add with value 1.
				map.put(ch, 1);
			}
		}
		
		for(Map.Entry<Character, Integer> entry : map.entrySet()){
			//System.out.println(entry.getKey() + " : " + entry.getValue());
			System.out.print(entry.getValue()+""+entry.getKey());
		}
		
	}
}








