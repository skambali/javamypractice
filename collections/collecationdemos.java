package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class collecationdemos {

	public static void main(String[] args) {
		
		ArrayList<String> fruits = new ArrayList();

		fruits.add("Pineapple");
		fruits.add("Apple");
		fruits.add("Orange");
		fruits.add("Banana");

		Collections.sort(fruits);

	 
		 
		for(String temp: fruits){
			int i=0;
			System.out.println("fruits " + ++i + " : " + temp);
		}
		
	}
}
