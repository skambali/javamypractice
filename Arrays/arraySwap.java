package Arrays;

import java.util.ArrayList;
import java.util.Collections;


public class arraySwap {

	public static void main(String[] args) {
		/*ArrayList<Object> as=new ArrayList();
		as.add('A');
		as.add('d');
		as.add('c');*/
		
		String[] as={"A","C","D","F","G","H"};
		
	for(int a=0;a<as.length;a++){
		System.out.print( as[a]);
	}
		 
	System.out.println();
		 
	System.out.println("After Swap:");
 		
		//Collections.swap(as, 0, 2);
		 for(int a=0;a<as.length;a++){
			 swap(as, a, as.length-1);
			 System.out.print( as[a]);
			}
				
		
	//	System.out.println(as);
		

	}
		private static void swap(String[] arr, int i, int j) {
        String tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
			
			 
    }
}
