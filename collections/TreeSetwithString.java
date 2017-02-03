package collections;

import java.util.TreeSet;

public class TreeSetwithString {
	public static void main(String[] args) {
		TreeSet t=new TreeSet(new treeSetCompartorForString());
		t.add("Raj");
		t.add("Desh");
		t.add("Bang");
		t.add("hi");
		t.add("jbl");
		System.out.println(t);
	}

}
 