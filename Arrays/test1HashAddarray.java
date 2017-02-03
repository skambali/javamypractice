package Arrays;

import java.util.HashSet;
import java.util.Hashtable;
import java.util.Set;
import java.util.TreeSet;

public class test1HashAddarray {
	
	public static Set hashTableadd(int[] a){
		
		 HashSet h=new HashSet();
		
		for(int i=0;i<a.length;i++){
			h.add(a[i]);
		}
	
		return h;
	}
	
	public static void main(String[] args){
		
		int a[]={2,4,5,63,4,3,2,2};
		System.out.println(hashTableadd(a));
	}

}
