package InterveiwBasicProgram;

public class MaxandMinfNumbersWithoutUsingAny {
	public static void main(String[] args){
		int  number=182;
		int reminder,i = 0;
		int a[]=new int[5];
		while(number!=0){
			reminder=number%10;
           a[i]=reminder;
           i++;
           
        
			number=number/10;
			
		}
		int b=a[0];
		int c=a[1];
		int d=a[2];
		System.out.println("Max Value is"+ Math.max(Math.max(b, c),d));
		System.out.println("Min Value is"+ Math.min(Math.min(b, c),d));
		
	}

}
