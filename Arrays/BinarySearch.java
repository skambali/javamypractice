package Arrays;

public class BinarySearch {
	
	public static void dobinarySearch(int a[],int key){
		int low=0;int high=a.length;
		
		int mid;
		 
		while(high>=low){
			 mid=(low+high)/2;
			
			if(a[mid]==key){
				System.out.println("Key found"+a[mid] +":" +mid);
				return;
			} if(a[mid] <key){
				low=mid+1;
			}else if(a[mid]>key){
				high=mid-1;
				
			}
			
			
			
		}
		
	}
	
	public static void main(String[] args) {
		int[] a={2,3,4,5,6,7,8,9};
    dobinarySearch(a,2);
	}

}
