package SampleBasicProg99;

public class prg32_commandLineArgSum {

	 
		public static void main(String args[]){

		int sum=0;


		 
		for (int i=0;i<args.length;i++){
		sum=sum+Integer.parseInt(args[i]);
		
		
		System.out.println(args[i]);
		}

		System.out.println("Total sum is"+sum);

		}}