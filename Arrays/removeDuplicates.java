package Arrays;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class removeDuplicates {
	public static void main(String[] args){
		ArrayList a=new ArrayList();
		a.add("hi");
		a.add("welcome");
		a.add("hi");
		System.out.println(a);
		HashSet<String> s=new HashSet<String>(a);
		System.out.println(s);
		
		
	}

}
