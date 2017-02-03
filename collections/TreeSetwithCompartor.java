package collections;

import java.util.TreeSet;

public class TreeSetwithCompartor {
	public static void main(String [] args){
		
	
	TreeSet  t=new TreeSet(new compartorDemo());
	t.add(4);
	t.add(3);
		t.add(100);
		t.add(15);
		System.out.println(t);
	

}
}