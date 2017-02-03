package Arrays;

public class TwoelementSumCloseToZero {
	void twoelementMinimum(int a[],int n){
		
		int count=0;
		int i,j,min_sum,min_i,min_j,sum;
		if(n<2){
			return;
		}
		
		min_i=0;
		min_j=1;
		min_sum=a[0]+a[1];
		
		for(i=0;i<n-1;i++){
			for( j=1;j<n;j++){
				sum=a[i]+a[j];
				if(Math.abs(min_sum)>Math.abs(sum)){
					min_sum=sum;
					min_i=i;
					min_j=j;
				}
			}
		}
		
		System.out .println("two elements are"+a[min_i] +a[min_j]);
		
	}
	public static void main(String[] args){
		
	//	int a[]={4,5,6,7,8}; 
		int a[]={1,60,-10,70,-80,85}; 
		
		TwoelementSumCloseToZero a1=new TwoelementSumCloseToZero();
		a1.twoelementMinimum(a, a.length);
	}

}
