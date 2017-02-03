package DataStructure;

import java.util.Stack;

public class Test_ImplementStack {
	public static void main(String[] args){
		Stack a=new Stack();
		a.push("A");
		a.push("X");
		a.push("B");
		System.out.println(a);
	//	System.out.println(a.pop());
		System.out.println(a.peek());
		System.out.println(a.empty());
		System.out.println(a.search("Z"));
		System.out.println(a);

		
	}

}
