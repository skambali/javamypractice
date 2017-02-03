package DataStructure;

public class selectionSortExample{
	
	public static void main(String[] args){
		int a[]={5,4,3,2,9,1};
		for(int i=0;i<a.length-1;i++){
			int pos=i;
			for(int j=i+1;j<a.length;j++){
				if(a[pos]>a[j]){
				pos=j;
				}
				int temp;
				temp=a[pos];
				a[pos]=a[i];
				a[i]=temp;
			}
		}
	for(int a1:a){
		System.out.print (a1);
		System.out.print (" ");
	}
	}
} 
