  package SampleBasicProg99;

public class prg58_TriangleStarReverse {
	//video found in	https://www.youtube.com/watch?v=5TIUbp9_xvM

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int space=6;
		int n=2;
		
		int size;
	 for (int i=7;i>=1;i--){
		 
		for(int j=space;j>=1;j--){
			System.out.print(" ");
		}
		for (int j=1;j<=i;j++){
			if(i==4||i==2||i==6){
			//if(i==n){	
			}else{
				
				System.out.print("* ");
			}
			//System.out.print(" ");
		}
		System.out.println();
		space=space+1;
	
	}
	 
	}

	}

