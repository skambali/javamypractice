package Arrays;

public class multiDimentionArray {

	public static void main(String[] args) {
		int[][] x=new int[2][3];
		System.out.println(x);
		System.out.println(x[0]);
		System.out.println(x[0][0]);
		/*[[I@205bfbd8
		  [I@76f33280
		  0
*/
		System.out.println("---------------------------------------");
		
		int[][] y=new int[2][];
		System.out.println(y);
		System.out.println(y[0]);
		System.out.println(y[0][0]);
		
	/*	[[I@2d74e4b3
		  null
		  Exception in thread "main" java.lang.NullPointerException
		  	at Arrays.multiDimentionArray.main(multiDimentionArray.java:19)

	*/	
	}
}
