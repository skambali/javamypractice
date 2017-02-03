
/*
 boolean flag=true;
	
	 for(int i=2;i<n;i++){
		 if(n%i==0){
			 flag=false;
			 break;
		 }
	 }
	  
	 if(flag){
		 System.out.println("prime"+n);
	 }else{
		  
			 System.out.println("not a prime"+flag);
		 }*/
public class PrimeNumberCheck {
	static void primeNumber(int num){
		boolean flag=true;
		int x=5;
		int y=100;
		
		
		/*for(int i=x;i<=y;i++){
			for(int j=2;j<i;j++){
			
			
			if(i%j==0){
				flag=false;
				break;
			}
 
		
		
		
		if(flag)
		System.out.println("prime is"+j);
		
		*/		
		int limit=200;
		int num1=100;
			
		for(int i=100;i<=limit;i++){
			 
		for(int j=2;j<num1;j++){
		 
			if(i%j==0){
				flag=false;
				break;
			}
		}
		if(flag)
			System.out.println("prime Number"+i);
		 
		
		
		}
		
	}
	public static void main(String[] args) {
		
		primeNumber(8);
		
	}

}
