import java.util.HashMap;
import java.util.Map;

public class MapsDemo {

	public static void main(String[] args) {
		// Store in pair, key -> value: Entry

		Map<Integer, String> map = new HashMap<Integer, String>();
		//putting value in map
		map.put(1, "BMW");                
		map.put(6, "Audi");
		map.put(4, "Honda");
		//Retrieving single value from map
		String value1 = map.get(1);   
		System.out.println(value1);

		// keys are unique, value can be duplicate
		map.put(2, "BMW");
		map.put(4, "Merc");         //it will replaced previous entry
		String value2 = map.get(4);
		System.out.println(value2);
		
		

	}

}
