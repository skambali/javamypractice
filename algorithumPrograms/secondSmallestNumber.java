package algorithumPrograms;

public class secondSmallestNumber {
	public static void main(String[] args) {
		//int a[]={-4 , 2 , 10 , -2, -3 }; 
		
		int a[]={34, 45, 21, 12, 54, 67, 15};
		int smallest=Integer.MAX_VALUE;
		int secondSmallest=Integer.MAX_VALUE;
		
		for (int i=0;i<a.length;i++){
			if(smallest>a[i]){
				smallest=a[i];
			}
		}
		for (int j=0;j<a.length;j++){
			if(secondSmallest>a[j]&&a[j]>smallest){
				secondSmallest=a[j];
			}
		}
		
		System.out.println("1:2 smallest are" +smallest +":" +secondSmallest);
		
	}

}
