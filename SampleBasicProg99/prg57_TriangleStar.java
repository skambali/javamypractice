  package SampleBasicProg99;

public class prg57_TriangleStar {

//video found in	https://www.youtube.com/watch?v=5TIUbp9_xvM
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int space=5;
		
	//	int add=1;
	 for (int i=0;i<=5;i++){
		 
		for(int j=1;j<=space;j++){
			System.out.print(" ");
		}
		for (int j=0;j<=i;j++){
			
				System.out.print("* ");
			 
			//System.out.print(" ");
		}
	
		System.out.println();
		
		space=space-1;
	}
	}

	 
}
 