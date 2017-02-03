package Arrays;

public class rotateArray {
	 
	    public  void rotate(int[] a,int order){

	    if(a.length==0){
	        return;
	}
	    
	    
	  for(int i=0;i<order;i++){
		  for (int j=a.length-1;j>0;j--){
			 int temp=a[j];
			  
			  a[j]=a[j-1];
			  a[j-1]=temp;
			  
		  }
	  }
	}
	  
	     
	 
	     public static void main(String[] args) {
	          System.out.println("Hello, world!");
	         int[] a={1,2,3,4,5,6};
	         rotateArray m= new rotateArray();
	         m.rotate(a,1);
	         
	         for(int num:a){
	           System.out.print(num);
	           System.out.print(" "); 

	}
	        
	      
	         
	         
	         
	         /*for(int i=0;i<order;i++){
	        for(int j=a.length-1;j>0;j--){
	           int temp=a[j];
	            a[j]=a[j-1];
	            a[j-1]=temp;
	        }
*/
	         
	         
	         
	     }
	    
 
}
