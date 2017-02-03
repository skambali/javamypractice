package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
 
public class reverseArray {
	

	public  static void doreverse(int low,int high,int[] a){
		int temp;
		if (low>=high) return;
		temp=a[low];
		a[low]=a[high];
		a[high]=temp;
		doreverse(low+1,high-1,a);
	}
	
	public static void main(String[] args) {
		int a[]={1,5,6,7,89,4};
		doreverse(0, a.length-1, a);
		
		for(int ap:a){
			System.out.print(ap);
			System.out.print(" ");
		}
		
	/*	int temp=0;
		for(int i=0;i<a.length/2;i++){
			temp=a[i];
			a[i]=a[a.length-1-i];
			a[a.length-1-i]=temp;
		}
		System.out.println();
		
		for(int ap:a){
			System.out.print(ap);
			System.out.print(" ");
		}
		System.out.println("after revese is");
		doreverse(0, a.length-1, a);
		
		for(int ap:a){
			System.out.print(ap);
			System.out.print(" ");
		}
	}
*/
}
}
