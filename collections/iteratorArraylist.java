package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class iteratorArraylist {
	
	 public static void main(String[] args) {
		ArrayList a=new ArrayList();
		for(int i=0;i<10;i++){
			a.add(i);
		}
		System.out.println(a);
		Iterator i=a.iterator();
		while(i.hasNext()){
			Integer b=(Integer)i.next();
			if(b%2==0){
				System.out.println("value is:"+b);
		
			}else{
			i.remove(); 
			}
		}
		System.out.println("----------------------");
		
		System.out.println(a);
		
	}
}

/*[0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
0
2
4
6
8
----------------------
[0, 2, 4, 6, 8]
*/