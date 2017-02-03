package DataStructure;

public class quickSort {
	
	
	public int dopartion(int a[],int low,int high){
		int j=high;
		int temp;
		int i=low+1;
		int key=a[low];
		 
		while(true){
			while(i<high&&key>=a[i]) i++;
			
			while(key<a[j]) j--;
		
			if(i>j){
			 temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}else{
				temp=a[low];
				a[low]=a[j];
				a[j]=temp;
				
			
			
				return j;
			}}
		}
	

	
	public  void quicksort(int a[],int low,int high){
		int j;
		if(low<high){
			j=dopartion( a,low,high);
			for(int a1:a){
				System.out.print(a1);
				System.out.print(" ");
			}
			quicksort(a,low,j);
			quicksort(a,j+1,high);
			
		}
	}

public static void main(String[] args){
	int a[]={2,4,6,8,1,4,6,7};
	
	quickSort qs=new quickSort();
	qs.quicksort(a, 0, a.length-1);
	
	for(int a1:a){
		System.out.print(a1);
		System.out.print(" ");
	}
}

}
