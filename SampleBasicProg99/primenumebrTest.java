package SampleBasicProg99;

public class primenumebrTest { 
public static boolean primeNumerCheck(int n,int range){
	int count=0;

	for(int num=n;num<=range;num++){
		boolean flag=true;
		
	 
	 for(int j=2;j<n;j++){
	 
		if(num%j==0) {
			flag=false;
			break; 
		} 
	 			
		
	}
	
	
	 if(flag){
		 count++;
		 System.out.println("number is prime:"+num) ; 
		 	}

	
	}	
	 //	System.out.println("total count of prime:"+count); 
	return true;
	
}


public static void main(String[] args) {
	
	boolean a=primeNumerCheck(4,20);
	//System.out.println("number is Prime Number:"+a);
		
		
	}
}
