package collections;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

public class arrayList {
	public static void main(String [] rags){

	ArrayList l= new ArrayList();
	l.add("A");
	l.add(10);
	l.add(null);
	System.out.println(l);
	l.remove(2);
  System.out.println(l);
  l.add(2,"M");
  l.add("N"); 
  System.out.println(l);
	LinkedList l1= new LinkedList();
	System.out.println(l instanceof Serializable);
	System.out.println(l instanceof RandomAccess);
	System.out.println(l1 instanceof Serializable);
	System.out.println(l1 instanceof RandomAccess);
	
	ArrayList l3= new ArrayList();
	List la= Collections.synchronizedList(l3);
	System.out.println(la instanceof Serializable);
	
	Iterator i=l.iterator();
	
}
}