package DataStructure;

public class mergeSort {
	
	
	void simplemerge(int low,int mid,int high,int[] a){
		int i=low;
		int j=mid+1;
		int k=low;
		int anew[]= new int[20]; 
		while(i<=mid&&j<=high){
			if(a[i]<a[j]){
			 anew[k]=a[i];
			 i++;
			 k++;
			}else{
				 anew[k]=a[j];
				 j++;
				 k++;
			}
		}
		
		while(i<=mid){
			anew[k]=a[i];
			i++;
			k++;
		}
		while(j<=high){
			anew[k]=a[j];
			j++;
			k++;
		}
		
		for(i=low;i<=high;i++){
			a[i]=anew[i];
		}
		
	}
	
	
	
	void mergeSortMethod(int low,int high,int[] ar){
		int mid;
		if(low<high){
			mid=(low+high)/2;
			mergeSortMethod(low,mid,ar);
			mergeSortMethod(mid+1,high,ar);
			simplemerge(low,mid,high,ar);
		}
	}
	public static void main(String[] args){
		
	int a[]={5,6,2,2,1,5,1};
		/*int a[]= new int[6];
		
		int n=5;
		
		for(int i=0;i<n;i++){
			a[i]=(int) ((int) i+Math.random());
		}*/
	mergeSort m=new mergeSort();
	m.mergeSortMethod( 0,a.length-1,a);
		
	for(int i:a){
		System.out.print(i);
		System.out.print(" ");
	}
	}

}
