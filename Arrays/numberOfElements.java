package Arrays;

public class numberOfElements {
	
	public static void main(String[] args) {
		
	int sum=0;
	int[] a={1,2,3};
	
	for(int i=0;i<a.length;i++){
		sum=sum+a[i];
	}
	
	System.out.println("----------------------");
	final int sum1=sum;
	System.out.println("Sum of values in Array is:"+sum1);
	
	for(int i=0;i<a.length;i++){
		
		System.out.println(sum1-a[i]);
		
	}
	
	System.out.println("----------------------");
	
	int secondSum=1;
	for(int i=0;i<a.length;i++){
	//	secondSum=(a[i]*a[i+1]);
	
		secondSum=secondSum*a[i];
	}
	
	final int sum2=secondSum;
	System.out.println("Multiplication of values in Array is:"+secondSum);
	
	for(int i=0;i<a.length;i++){
		
		System.out.println(sum2/a[i]);
		
	}
	
	
	
	
	
	
	}

}
