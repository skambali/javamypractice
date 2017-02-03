package collections;

import java.util.Comparator;
import java.util.TreeSet;

public class StringBufferwithTreeSet {
	
	public static void main(String[] args) {
		TreeSet t=new TreeSet(new StirngBufferComprator());
		
		t.add(new StringBuffer("K"));
		t.add(new StringBuffer("L"));
		System.out.println(t);
	}

}

class StirngBufferComprator implements Comparator{
	
public int compare(Object o1,Object o2){
	String s1=o1.toString();
	String s2=o1.toString();
	return s1.compareTo(s2);
	
	
}
}