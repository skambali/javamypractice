package Arrays;

public class TestCadenceLogic {

	public static int testt(int[] a){
		int maxlengthtobe=0;
		int  maxSofarIs=0;
		
	for(int i=0;i<a.length;i++){
		maxlengthtobe=maxlengthtobe+a[i];
		if (maxlengthtobe<=0){
			maxlengthtobe=0;
		}
		if(maxSofarIs<maxlengthtobe){
			maxSofarIs=maxlengthtobe;
		}
	}
	
	return maxSofarIs;
	}
	
	public static void main(String[] args){
		//int [] a={-1,-2,-4,5,3};
		
		int [] a = {-2, -3, 4, -1, -2, 1, 5, -3};
		System.out.println("Sum is:"+testt(a));
	}
	
}
