package DataStructure;

import java.util.Stack;


 
public class stackConsecSptlChar {
	public static boolean expressionCons(String name){
		//((a+n))
		char[] a=name.toCharArray();
	
		 Stack<Character> st=new Stack<Character>();
		 //((a+b))
		 for(char ch:a){
			 if(ch==')'){
				 char top;
				 top=st.peek();
				 st.pop();
				 if(top=='('){
					 return true;
				 }else{
					 while(!(top=='(')){
						 st.pop();
						 top=st.peek();
					 }
				 }
			 }else{
				 st.push(ch);
				 
			 }
		}
		 return false;
		
 
	}
	
	public static void main(String[] args) {
		
		String an="((a+b))";
		System.out.println(expressionCons(an));
	}

}
