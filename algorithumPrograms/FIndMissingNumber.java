package algorithumPrograms;

public class FIndMissingNumber {
	static int FindMissingNumber(int A[])
	
	{
		int n=A.length;
	int  X = 0, Y = 0;
	for (int i = 0; i < n-1; i ++)
	
		{X ^= A[i];
		}for (int j = 1; j <= n; j ++)
	{Y ^= j;}
	//In fact, one variable is enough.
	return X ^ Y;
	}
	
	public static void main(String[] args) {
		int a[]={1,2,3,4,5,7,8,9,10};
		int sum = 0;
		/*for(int i=0;i<a.length;i++){
			
			sum=sum^a[i]^i;
		}*/
		System.out.println(FindMissingNumber(a));
		//System.out.println(sum-1);
	}

}
