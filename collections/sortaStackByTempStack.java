package collections;

import java.util.Stack;

public class sortaStackByTempStack {
	
	public static Stack<Integer> sortbyTemp(Stack<Integer> input){
		Stack<Integer> tempStack=new Stack<Integer>();
		while(!input.isEmpty()){
			int temp=input.pop();
			
			while(!tempStack.isEmpty()&&tempStack.peek()>temp){
				input.push(tempStack.pop());
			}
			
		    tempStack.push(temp);
		 //   System.out.println("input: "+input);
		    System.out.println("tmpStack: "+tempStack);
			
		}
		return tempStack;
	
	}

	
	public static void main(String[] args){
		
	Stack<Integer> s=new Stack<Integer>();
	
	s.push(10);
	s.push(5);	
	s.push(14);
	s.push(10);
	s.push(5);	
	s.push(14);
	System.out.println(s);
	
	System.out.println("Afer Sort"+sortbyTemp(s));
	
	}
}
