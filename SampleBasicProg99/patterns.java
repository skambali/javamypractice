package SampleBasicProg99;

public class patterns {
	public static void main(String[] args) {
		//it prints square
		/*for(int i=1;i<=4;i++){
			for(int j=1;j<=4;j++){
				System.out.print(" *");
			}
			System.out.println( );
		}
	}
	*/
	
		//for a box 
/*	for(int i=1;i<=4;i++){
		for(int j=1;j<=4;j++){
			if(i==1||i==4||j==1||j==4)
			{
			System.out.print("*");
		}
			else{
				System.out.print(" ");
			}
		}
		System.out.println( );
	
}*///for a one side trinage
		int odd=1;
	for(int i=1;i<=4;i++){
			for(int j=1;j<=odd;j++){
			
					System.out.print("*");
				
			}
			System.out.println( );
			odd+=2;
		
	}
	
	
		
		/*for(int i=5;i>=1;i--){
			for(int j=1;j<=i;j++){
			 
					System.out.print("*");
				
			}
			System.out.println( );
		
	}
	}*/
}
}
