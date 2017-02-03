package DataStructure;

import java.util.ArrayList;

public class binarySearch {
	
	public static void main(String[] args) {
		/*ArrayList a=new ArrayList();
		a.add(3)*/
		
		int a[]={2,3,4,55,66};
		int low=0;
		int high=a.length;
		int mid;
		
		int key = 2;
		System.out.println(high);
		mid=(high+low)/2;
		System.out.println(mid);
		System.out.println(a[mid]); 
		
		while(high>=low){
			mid=(high+low)/2;
			 
			
			if(key==a[mid])
				{
				System.out.println("found"+key);
				return;
				}
			if(a[mid]<key){
			  low=mid+1;
			}
			  else{
				  
				  high=mid-1;
				  
			  }
			}
			
			
			
			
 
	}

}
