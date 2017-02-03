package Arrays;
import java.util.Arrays;

public class SortAnIntegerArrays {
	public static void main(String[] args) {
		//int arr[]={1,3,6,88,44,66};
		
		int arr[]={0,1,0,1,0,1,0,1,0,1,0,1};
   for(int i=0;i<arr.length;i++){
			 
		 	System.out.print( arr[i]);
			System.out.print(" ");
		}
   System.out.println();
 
 for(int a:arr){
	 System.out.print(a);
	 System.out.print(" ");
 }
		
 Arrays.sort(arr);
 System.out.println();
 System.out.println("After sorting");
 for(int a:arr){
	 System.out.print(a);
	 System.out.print(" ");
 }
	
	}

 
	
}