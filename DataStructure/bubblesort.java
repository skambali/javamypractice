package DataStructure;

public class bubblesort {
	
	public void swap(int i,int j,int[] ar){
		int temp;
		temp=ar[i];
		ar[i]=ar[j];
		ar[j]=temp;
		
		 
		
		
		 
		
	}

	public static void main(String[] args) {
		int a[]={40,50,30,60,10};
		//bubblesort b=new bubblesort();
		  
		for(int i=1;i<a.length;i++){
			for(int j=0;j<a.length-i;j++){
				if(a[j]>=a[j+1]){
					int temp; //0/ 5
					temp=a[j];//t=5
					a[j]=a[j+1];//t=5
					a[j+1]=temp;//5
				}
			}
		 
				
			 
			
		}
		
	 for(int ar:a){
		 System.out.println(ar);
	 }
	}
}
