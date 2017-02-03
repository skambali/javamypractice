package StringManuplation;

import java.util.Stack;

public class redudnatString {
	
	public static boolean duplicateParenthesis(String s) {
		 Stack < Character > st = new Stack < > ();
		 int i = 0;
		 int count = 0;
		 while (i < s.length()) {
		  if (s.charAt(i) == '(') {
		   st.add('(');
		   i++;
		   continue;
		  } else if (s.charAt(i) == ')') {
		   count++;
		   while (i + 1 < s.length() && s.charAt(i + 1) == ')') {
		    count++;
		    i++;
		   }
		   while (count != 0) {
		    char a = st.pop();
		    if (a == '(' && count >= 2 && st.peek() == '(') {
		     return true;
		    } else if (a == '(') {
		     count--;
		    }
		   }
		  } else {
		   st.add(s.charAt(i));
		  }
		  i++;
		 }
		 return false;
		} 
	public static void main(String[] args) {
		
		String s="(a+b) + (c+d)";
		duplicateParenthesis(s);
		
	}}