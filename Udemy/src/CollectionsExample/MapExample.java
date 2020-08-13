package CollectionsExample;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapExample {

	public static void main(String[] args) {
		
		Map<String, String> hashMap = new HashMap<String, String>();
		
		hashMap.put("c", "meena");
		hashMap.put("a", "pradhan");
		hashMap.put("b", "singh");
		hashMap.put("d", "kekri");
		hashMap.put(null, null);
		hashMap.put(null, "NULL");
		
		System.out.println("iteration 1: by using entrySet() method");
		for(Map.Entry<String, String> item : hashMap.entrySet()) {
			String key = item.getKey();
			String value = item.getValue();
			System.out.println("key: " + key + " value: " + value);
		}
		
		System.out.println("\niteration 2: by using keySet() method");
		for(String item : hashMap.keySet()) {
			String value = hashMap.get(item);
			System.out.println("key: " + item + " value: " + value);
		}
		
		hashMap.remove(null);
		System.out.println(hashMap.containsKey("a"));
		System.out.println(hashMap.containsValue("ajmer"));
		System.out.println(hashMap.keySet());
		System.out.println(hashMap.values());
		System.out.println(hashMap.size());
		
		//removing multiple element at a time 
		Set<String> set = new HashSet<String>();
		set.add("a");
		set.add("b");
		hashMap.keySet().removeAll(set);
		
		System.out.println(hashMap);
		
		//linked hash map
		Map<String,String> linkedHashMap = new LinkedHashMap<String,String>(hashMap);
		System.out.println(linkedHashMap);
		
		linkedHashMap.put("e", null);
		
		//tree map
		Map<String,String> treeMap = new TreeMap<String,String>(linkedHashMap);
		System.out.println(treeMap);
		
		Map map = Collections.synchronizedMap(treeMap);
		System.out.println(map);
		
		
		//hash table
		Map<Integer,String> hashtable = new Hashtable<Integer,String>();
		
		hashtable.put(2, "jaipur");
		hashtable.put(3, "udiapur");
		hashtable.put(1, "ajmer");
		
		System.out.println(hashtable);
		Map<Integer,String> htTreeSet = new TreeMap<Integer,String>(hashtable);
		System.out.println(htTreeSet);
	}

}
