
package CollectionsExample;

import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();
		stack.push("pradhan");
		stack.push("singh");
		stack.push("meena");
		stack.push("kekri");

		System.out.println(stack);
		System.out.println(stack.peek());
		//System.out.println(stack.pop());
		System.out.println(stack);
		System.out.println(stack.search("kekri"));
		stack.add(2, "rakesh");
		System.out.println(stack);
		System.out.println(stack.indexOf("kekri"));
		System.out.println(stack.pop());
		System.out.println(stack);
	}

}
