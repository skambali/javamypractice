  package SampleBasicProg99;

public class prg58_TriangleStarReverse {
	//video found in	https://www.youtube.com/watch?v=5TIUbp9_xvM

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int space=6;
		
		int size;
	 for (int i=5;i>=1;i--){
		 
		for(int j=space;j>=1;j--){
			System.out.print(" ");
		}
		for (int j=1;j<=i;j++){
			System.out.print("* ");
			//System.out.print(" ");
		}
		System.out.println();
		
		space=space+1;
	}
	}

}
