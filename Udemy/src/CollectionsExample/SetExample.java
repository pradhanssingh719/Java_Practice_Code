package CollectionsExample;

import java.util.Set;
import java.util.TreeSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;


public class SetExample {

	public static void main(String[] args) {

		//hash set
		Set<String> hashSet = new HashSet<String>();
		
		hashSet.add("honda");
		hashSet.add("bmw");
		hashSet.add("honda");
		hashSet.add(null);
		hashSet.add("benz");
		hashSet.add(null);
		hashSet.add("audi");
		System.out.println(hashSet);
		
		for(String item : hashSet) {
			System.out.println(item+" ");
		}
		
		//linked hash set
		Set<String> linkedHashSet = new LinkedHashSet<String>(hashSet);   //converting hash set to linked hash set
		System.out.println(linkedHashSet);
		
		linkedHashSet.remove(null);
		linkedHashSet.remove("audi");
		
		Iterator<String> i = linkedHashSet.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		//tree set
		Set<String> treeSet = new TreeSet<String>(linkedHashSet);    //converting linked hash set to tree set
		System.out.println(treeSet);
		
		treeSet.add("12");
		treeSet.add("100");
		System.out.println(treeSet);

		
	}

}
