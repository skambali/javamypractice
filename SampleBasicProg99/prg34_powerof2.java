/**
 * 
 */
package SampleBasicProg99;

import java.util.Scanner;

/**
 * @author rkambali
 *
 */
public class prg34_powerof2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);System.out.println("enter the number of power of 2");

int n=sc.nextInt();
prg34_powerof2 a=new prg34_powerof2();

for (int i=0;i<=n;i++){
	
	System.out.println("power of 2 is" +n+ ":" +a.isPowerOfTwo(n));
}
		
	}
	public boolean isPowerOfTwo(int n) {
	    return n>0 && (n&n-1)==0;
	}

}
