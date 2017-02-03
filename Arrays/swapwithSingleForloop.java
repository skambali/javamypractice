package Arrays;

import java.util.Arrays;

public class swapwithSingleForloop {
	public static void main(String[] args) {
	// int a[]={3,2,4,6,8};
	 
	// int[] a = {0, 0, -1, 1, 0, 1, 1, -1, 1};
	 
	/* for(int i=0;i<a.length;i++){
		 if(i>0 &&a[i]==0 &&(a[i-1]!=0)){
			 int temp=a[i-1];
			 a[i-1]=a[i];
			 a[i]=temp;
			 
			 
		 }
		 
	 }*/
	 
	  int a[] = {0,1,2,3,2};
	  for(int i=0;i<a.length/2;i++){
		 int temp=a[i];
		 a[i]=a[a.length-1-i] ;
		 a[a.length-1-i]=temp;
	  }
	 
	 for(int b:a){
		 System.out.print(b);
		 System.out.print(" ");
	 }
		
		
	}

}
 