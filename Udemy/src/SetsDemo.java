import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetsDemo {

	public static void main(String[] args) {

		// HashSet - Does not maintain order (that's why it is fastest)
		Set<String> set = new HashSet<String>();

		set.add("BMW");
		set.add("Audi");
		set.add("Honda");
		set.add("Honda");

		//System.out.println(set);

		System.out.println("HashSet");
		for (String item : set) {
			System.out.println(item);
		}

		// LinkedHashSet - It maintains the order in which the elements are added
		Set<String> lhSet = new LinkedHashSet<String>();
		lhSet.add("BMW");
		lhSet.add("Audi");
		lhSet.add("Honda");
		System.out.println("LinkedHashSet");
		for (String item : lhSet) {
			System.out.println(item);
		}
		

		// TreeSet - It maintains the natural sorting order 1,2,3.....alphabetically
		Set<String> tSet = new TreeSet<String>();
		tSet.add("BMW");
		tSet.add("Audi");
		tSet.add("Honda");
		System.out.println("TreeSet");
		for (String item : tSet) {
			System.out.println(item);
		}
		
		List<String> list = new ArrayList<String>();

		list.add("BMW");
		list.add("Audi");
		list.add("Honda");
		list.add("Honda");

		//System.out.println(list);
	}

}
