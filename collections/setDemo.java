package collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class setDemo {
	public static void main(String[] args) {
		//int a[]={1,4,3,5,8,3};
		
		String a[]={"Hi","Hi","Welc","A","B","A"};
  LinkedHashSet<String>	 s=new LinkedHashSet<String>();
		for(int i=0;i<=a.length-1;i++){
			s.add(a[i]);
		}
	TreeSet t=new TreeSet<String>();
	for(int i=0;i<=a.length-1;i++){
		s.add(a[i]);
		t.add(a[i]);
		 
	}
	/*t.first();
	t.last();
	 */ 
	 
	System.out.println(s);
	System.out.println(t);
	System.out.println(t.contains("A"));
		
	}

}
