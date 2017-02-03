package DataStructure;

public class LinearSearch {
	
	public boolean linear(int key,int arr[]){
		
		 
		
	 for( int i=0;i<arr.length;i++){
	 if (arr[i]==key){
		// System.out.println("Numbe found" +arr[i]);
		 return true;
	 }
	// System.out.println(arr[i]);
	}
	  return false;
	 
		 
	}

	
	public static void main(String[] args) {
		
		int arr[]={3,4,3,423,2,3,23};
		
		int key=0;
		
		LinearSearch ln=new LinearSearch();
		System.out.println("Result is:"+ln.linear(key, arr));
		
		
		
		 	}
}
