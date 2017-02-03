package algorithumPrograms;

public class numberOfAccurnaces {
	 
	    public static void main(String[] args) {
	        //int arr[] = {6, 22, 20, 11, 5, 18, 18, 16, 30, 9, 10, 10, 11, 5, 18, 18, 16};
	       int arr[]={1,2,3,2};
	         for(int i=0;i<arr.length;i++){
	        	 int count=0;
	        	 for(int j=0;j<arr.length;j++){
	        		 if(arr[i]==arr[j]){
	        			 count++;
	        			 
	        		 }
	        	 }
	        	 
	        	 System.out.println(arr[i]+"count Number is"+ count);
	        		 
	        	 }
	        	 
	         }
	    
	     

}
