package StringManuplation;

import java.util.Stack;

public class redendantDuplicatesExpInString {
	
	static boolean duplicateCheckForAString(String str){
		char top = 0;
	 char[] c1=str.toCharArray();
	 Stack<Character> stack= new Stack<Character>();

	 /*for(char c:c1){
		 stack.push(c);
	 }*/
	 for(char c:c1){
		if(c==')') {
			 top=stack.peek();
			stack.pop();
		
		if(top=='('){
			return true;
			
		}else{
			while(!(top=='(')){
				top=stack.peek();
				stack.pop();
				
			}
			
		}
	 
 	}else{
 			stack.push(c);
 		}
		
		
	 }
	 
	 
		
		
	return false;
	
	}

	public static void main(String[] args) {
		// String str = "(((a+(b))+(c+d)))";
		 
String str="aa+((b*c))";
		 System.out.println(duplicateCheckForAString(str));
	}
}
