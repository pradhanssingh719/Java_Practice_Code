package CollectionsExample;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class QueueExample extends LinkedListExample {

	public static void main(String[] args) {
		
		//Queue is an interface in java which provides "linked list" and "priority queue"
		
		List<String> lList = new LinkedList<String>();

		lList.add("pradhan");
		lList.add("singh");
		lList.add("meena");
		lList.add("kekri");
		lList.add(1, "rakesh");
		System.out.println(lList.indexOf("pradhan"));
		Queue<String> queue = new LinkedList<String>();
		
		queue.addAll(lList);  //adding data from other collection 
		
		System.out.println(queue);
		queue.add("ajmer");     //added at last position
		
		//queue.removeAll(lList);      //it will remove all the elements which are added from lList 
		System.out.println(queue);
		
		System.out.println(queue.element());  //return first element
		System.out.println(queue.remove());   //removed first element
		
		queue.poll();   //same as remove but it will return null if the queue is empty
		
		System.out.println(queue);
		
		System.out.println(queue.peek());    //same as element method but it will return null if queue is empty
		
		queue.clear();
		System.out.println(queue.peek());
		
		try {
		System.out.println(queue.element());
		}catch(Exception e) {
			System.out.println("queue is empty you can not perform this action try .peek method");
		}
		
		queue.addAll(lList);
		System.out.println(queue);
		
		queue.remove(0);      //removing using index is not working in queue
		queue.offer("rakesh");     //same as add method
		System.out.println(queue);
		
		String s = ((List<String>) queue).get(queue.size()-1);
		System.out.println(queue);
	}

}
