package Arrays;

public class sortAnarrayT1 {

	public static void main(String[] args){
		int a[]={5,3,2,8,9};
		int temp;
		for(int i=0;i<a.length;i++){
			for(int j=i+1;j<a.length;j++){
				if(a[i]>a[j]){
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					
				}
			}
		}
		
		for(int a2:a){
			System.out.println(a2);
		}
				}
	}
	
	
 
