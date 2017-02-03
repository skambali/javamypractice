package Arrays;

public class arrayMultilication {
	public static void main(String[] args) {
		int a[]={1,2,3,4};
		int sum = 0;
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a.length;j++){
				  sum=a[i]*a[j]; //2*2=4
				                 //2*3=6
				                 //3*2=6
				                 //3*3=9
				  
				//  sum= (int)Math.pow(a[i], 40);
				  System.out.println(  +a[i]+ ":"  +a[j]+ ":"  + sum);
			}
		}
		
		
	}

}
