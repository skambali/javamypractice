package SampleBasicProg99;

public class primePractice {

	public static void main(String[] args) {
		 
		int x=5;
		int y=100;
		boolean flag = true;
		
		for(int i=x;i<=y;i++){
		for(int j=2;j<i;j++){
			
			if(i%j==0){
				flag=false;
				break;
			}
 
		
		
		
		if(flag)
		System.out.println("prime is"+j);
		}
}
}
}