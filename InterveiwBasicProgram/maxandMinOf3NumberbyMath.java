package InterveiwBasicProgram;

public class maxandMinOf3NumberbyMath {

	public static void main(String[] args){
	
		
		
		int a=5;
	int b=6;
	int c=3;
	int d=8;

	int max=Math.max(Math.max(a, b),c);
	int min=Math.min(Math.min(a,b),c);
	//System.out.println("Max is:"+max);
	System.out.println("Minmum is:"+min);
int f=Math.max(Math.max(Math.max(a, b), c), d);
System.out.println("four Max is:"+f);

	
	}
}