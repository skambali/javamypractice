package Arrays;

import java.sql.Array;
import java.util.Arrays;

public class searchAvalueInArray {
	
	public static void main(String[] args) {
		int a[]={3,2,4,5,1,2,4,6,7,8,9};
	      Arrays.sort(a);
	      for(int ab:a){
	    	  System.out.print(ab);
	    	  System.out.print(" ");
	      }
		
		int value=Arrays.binarySearch(a, 2);
		
		if(value>0){
			System.out.println("found");
		
		}else{
			System.out.println("Not found");
		}
		
	} 

}
