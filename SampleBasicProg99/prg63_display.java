/**
 * 
 */
package SampleBasicProg99;

/**
 * @author rkambali
 *
 */
public class prg63_display {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		for (int i = 0; i <= 9; i++) {
            for (int j = 0; j <= 9; j++) {
                if (i == 0 || i == 9) {
                    System.out.print("-");
                } else {
                    if (j == 0 || j == 9) {
                        System.out.print("|");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }

	*/
		int n=10;
		
		for(int i=0;i<n;i++)		 
		 {
			System.out.print(" ");
		 	
			for(int j=0;j<n;j++)
			{
			   if(i==0|| j == 0 || i==(n-1)) 
				  System.out.print("--");			 
			   
			   else if 
			   (j==(n-1))
				  System.out.print("--");
			   
			   else 
				  System.out.print(" ");
			}	
		 	
			System.out.println();
		 }
	}
}
