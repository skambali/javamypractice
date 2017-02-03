package Arrays;

public class find_pairofIntegerArray {

	static void pairfind(int a[],int sum){
		for(int i=0;i<a.length;i++){
			int low=a[i];
		for(int j=1;j<a.length;j++){
			int high=a[j];
			if(low+high==sum){
				System.out.println("Values of"+sum +"are:"+low+" , "+high);
			}
		}
		}
	}
	
	public static void main(String args[]){
		int a[]={2,3,1,4,5};
		
		pairfind(a,5);
		
	}
	
}
 