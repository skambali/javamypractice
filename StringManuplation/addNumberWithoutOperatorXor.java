
package StringManuplation;

public class addNumberWithoutOperatorXor {

	public static int add(int x,int y){
		while(y!=0){
			
			int carry;
			carry=x&y;
			x=x^y;
			y=carry<<1;
		}
		System.out.println(x);
		
		return x;
	}
	
	public static void main(String[] args) {
		int x=25;
		int y=12;
		System.out.println(add(x,y));
	}
}
