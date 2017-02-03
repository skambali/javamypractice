  package SampleBasicProg99;

public class prg57_TriangleStar {

//video found in	https://www.youtube.com/watch?v=5TIUbp9_xvM
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int space=5;
		int num=1;
		
	//	int add=1;
	 for (int i=0;i<=6;i++){
		
		for(int j=1;j<=space;j++){
			System.out.print(" ");
		}
		
		for(int j=2;j<=i;j++){
			 System.out.println("Number is:"+num++);
		}
 
		for (int j=0;j<=i;j++){
		if(i==1||i==3||i==5)				
			{
			 
			}else{
				
				System.out.print("* ");
			}
			 
			//System.out.print(" ");
		}
	
		System.out.println();
		//System.out.println("num is:" +num);
		
		
		
		 
		space=space-1;
		
	}
	}

	 
}
 