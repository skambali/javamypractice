package Arrays;

public class sumTest {
	
	sumTest(){
		System.out.println("we are in");	
	}
	sumTest(int a){
		this();
		System.out.println("we are in-----"+a);
	}
	
	sumTest(int a,int b){
		 
		this(a);
		System.out.println("we are in"+a +b);
	}
	
	public static void main(String[] args) {
		
		sumTest s=new sumTest(2,3);
		  
		
		int sum=0;
		int[] a={1,2,3};
		
		for(int i=0;i<a.length;i++){
			 for(int j=0;j<a.length-1;j++){
				 sum=sum+a[j+1];
			 }
			 System.out.println(sum);
		}
	}
	
}
