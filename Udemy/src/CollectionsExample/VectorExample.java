package CollectionsExample;

import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {
		
		
		Vector<String> name = new Vector<String>(3,10);
		
		name.add("pradhan");
		name.add("singh");
		name.add("meena");
		name.addElement("kekri");
		name.add(null);
		
		
		System.out.println(name.size());
		System.out.println(name.capacity());
		
		for(int i=2; i<=10; i++) {
			name.add(i,"home");
		}
		
		
		System.out.println(name.size());
		System.out.println(name.capacity());
		
		System.out.println(name);
		
		for(String item : name) {
			System.out.print(item+" ");
		}
		
		System.out.println();
		name.remove(0);
		for(String item : name) {
			System.out.print(item+" ");
		}

	}

}
