package collections;

import java.util.LinkedHashSet;
 
import java.util.Iterator;
 

public class LinkeHashSet {
	public static void main(String args[]){
		LinkedHashSet h=new LinkedHashSet();
		h.add("a");
		h.add("z");
		h.add("a");
		h.add("c");
		h.add("x");
		h.add(null);
		h.add("1");
		System.out.println(h.add("z"));
		System.out.println(h);
		
	 Iterator i=h.iterator();
	 while(i.hasNext()){
		 String s=(String)i.next();
		 /*if(s.equals("z")){
			 System.out.println("found");
		 }*/
	 }
		 
	}

}
