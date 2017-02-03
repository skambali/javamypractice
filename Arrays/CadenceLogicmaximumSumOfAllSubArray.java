package Arrays;

public class CadenceLogicmaximumSumOfAllSubArray {

	public static int maxSubArraySum(int[] a){
		int maxsofar=0;
		int maxending=0;
		for(int i=0;i<a.length;i++){
			maxending=maxending+a[i];
			if(maxending<0){
				maxending=0;
			}
			if(maxsofar<maxending){
				maxsofar=maxending;
			}
		}
		
		return maxsofar ;
		
	}
	public static void main(String[] args) { 
		int [] a = {-2, -3, 4, -1, -2, 1, 5, -3};
	//	int [] a={1, -2, 3, 10, -4, 7, 2, -5};
		
		//int[] a={-1,-2,3,4,9};
 		
		// int [] a = {2,3,2,2,2,2,2,1,2};
	        System.out.println("Maximum contiguous sum is " +
	        		maxSubArraySum(a));
	}
}
