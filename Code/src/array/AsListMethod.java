package array;

import java.util.Arrays;
import java.util.List;

public class AsListMethod {

	public static void main(String[] args) {
		String s = "pradhan&rakesh&manish&sunil";
		List<String> alist = Arrays.asList(s.split("&"));
		
		for(String str : alist) {
			System.out.println(str);
		}
	}

}
