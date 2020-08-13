import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapsDemo2 {

	public static void main(String[] args) {
		//HashMap - Does not maintain Order
		
		Map<Integer, String> hashMap = new HashMap<Integer,String>();
		
		hashMap.put(1, "BMW");
		hashMap.put(6, "Audi");
		hashMap.put(4, "Honda");
		
		System.out.println("Iteration no. 1");
		for(Map.Entry<Integer, String> entry: hashMap.entrySet()) {
			int key = entry.getKey();
			String value = entry.getValue();
			System.out.println("Key: " + key + ", value: " + value);
		}
		
		
		System.out.println("Iteration no. 2");
		for(Integer key: hashMap.keySet()) {
			String value = hashMap.get(key);
			System.out.println("Key: " + key + ", value: " + value);
		}
		
		
		//Maintain the order in which the are added
		Map<Integer, String> linkedMap = new LinkedHashMap<Integer,String>();
		linkedMap.put(1, "BMW");
		linkedMap.put(6, "Audi");
		linkedMap.put(4, "Honda");
		
		System.out.println("Iteration no. 3");
		for(Integer key: linkedMap.keySet()) {
			String value = linkedMap.get(key);
			System.out.println("Key: " + key + ", value: " + value);
		}
		
		
		//Maintain natural sorting order
		Map<Integer, String> treeMap = new TreeMap<Integer,String>();
		treeMap.put(1, "BMW");
		treeMap.put(6, "Audi");
		treeMap.put(4, "Honda");
		
		System.out.println("Iteration no. 4");
		for(Integer key: treeMap.keySet()) {
			String value = treeMap.get(key);
			System.out.println("Key: " + key + ", value: " + value);
		}
		
	}

}
