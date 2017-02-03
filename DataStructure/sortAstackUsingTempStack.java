package DataStructure;

import java.util.Stack;

public class sortAstackUsingTempStack {

	public static Stack sortStack(Stack<Integer> input){
		
		Stack<Integer> tempstack=new Stack<Integer>();
		while(!input.isEmpty()){
			int temp;
			temp=input.pop();
			while(!tempstack.isEmpty()&&tempstack.peek()>temp){
				input.push(tempstack.pop());
			}
			tempstack.push(temp);
		}
		
		
		 
		return tempstack;
		
	}
	
	public static void main(String[] args){
	
		//int a[]={4,3,1,5,8,3};
		
		Stack a=new Stack();
		a.add(5);
		a.push(4);
		a.add(2);
		a.add(6);
		a.add(8);
		
		System.out.println("sorted is:"+sortStack(a));
 	}
	
}
