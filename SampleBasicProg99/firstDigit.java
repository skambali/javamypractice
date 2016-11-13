package SampleBasicProg99;

public class firstDigit {
	public static void main(String[] args) {
		
		int number = 534;
		int reverse=0;
		int c=0;
		/*while(number!=0){
			reve=reve*10;
			reve=reve+number%10;
		  System.out.println(reve);
			number=number/10;
		}*/
		
		
		while(number!=0){

			int reminder=number%10;
			reverse=reverse*10+reminder;
			number=number/10;
			
		}
		System.out.println(reverse);
	}

	
	
}
