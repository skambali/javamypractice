package Arrays;

import java.util.Arrays;

public class NumberClosedToZeroTest {
	public static void main(String[] args){
		int a[]={1,60,-10,70,-1,-80,85};
		Arrays.sort(a);
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]);
			System.out.print(" ");
		}
		System.out.println("sum is");
		int sum,max = 0,min = 0;
		//for(int i=0;i<a.length;i++){
		//int num=a[a.length-1];
		 // System.out.println(sum + ":"+a[0] +":" +num); 
 
		 int low=0; int next = 0;
		 int high=a.length-1;
		 while(high>=low){
			  next=high;
	       sum=a[low]+a[next];
	       if(sum<=0){
	    	   low=low+1;
	    	   next=next+1;
	    	   
	       }else{
	    	   high=high-1;
	       }
	       if(sum>=0){
	    	   System.out.println(sum + ":"+a[low] +":" +a[next]);
	    	   return;
	       }
			 
			 
		 }
		 
			
		 
		 
		 
	}
		
		
	}

 
