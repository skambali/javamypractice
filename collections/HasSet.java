package collections;

import java.util.HashSet;

public class HasSet {
	public static void main(String[] args){
		HashSet h=new HashSet();
		
		h.add("a");
		h.add("b");
		h.add("a");
		h.add(null);
		System.out.println(h.add("a")); 
		
		for (int i=0;i<5;i++){
			System.out.println(h);
		}
		
		System.out.println(h);
	}

}
