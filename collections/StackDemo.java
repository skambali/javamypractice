package collections;

import java.util.Stack;

public class StackDemo {
	public static void main(String[] args) {
		Stack a=new Stack();
		
		a.push("A");
		a.push("X");
		a.push("D");
		System.out.println(a);
		System.out.println(a.pop());
		System.out.println(a.peek());
		System.out.println(a);

		/*Stack s=new Stack();
		s.push("A");
		s.push("F");
		s.push("B");
		s.push("C");
		System.out.println(s);
		System.out.println(s.search("A"));
		System.out.println(s.search("F"));
		System.out.println(s.search("B"));
		System.out.println(s.search("C"));
		
		System.out.println(s.search("f"));*/
		
	}

}
