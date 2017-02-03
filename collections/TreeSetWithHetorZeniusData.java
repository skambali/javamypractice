package collections;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetWithHetorZeniusData {

	public static void main(String[] args) {
	TreeSet t=new TreeSet(new hetorComprator());
	t.add("A");
	t.add("C");
	t.add("B");
	t.add(new StringBuffer("ad"));
	
	t.add(new StringBuffer("adSXX"));	
	t.add(new StringBuffer("1"));	
	t.add(new StringBuffer("8"));	
	t.add(new StringBuffer("6"));	 
	t.add(4);
	System.out.println(t);
	}
}

class hetorComprator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
	 
		String i1=o1.toString();
		String j1=o2.toString();
		int i=i1.length();
		int j=j1.length();
		if(i<j)
			return -1;
		else if(i>j)
			return +1;
		else return i1.compareTo(j1);
		 
		
	}
	
}