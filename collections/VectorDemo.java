package collections;

import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		Vector v=new Vector();
		v.add("V");
		System.out.println(v.capacity());
		for (int i=0;i<10;i++){
			System.out.println(v.add(i));
		}
				System.out.println(v.capacity());
				v.add("V");

				System.out.println(v.capacity());
	}
}
