package algorithumPrograms;

import java.util.Arrays;

public class arrIncreaseDecreasingSeq {
	private static final int INT_MIN = 0;


		public  int Search (int A[], int first, int last){
	 
		 first = 0;
		 last = A.length-1;
		int mid;
		while(first <= last)
		{
		// if the current array has size 1
		if(first == last)
		return A[first];
		// if the current array has size 2
		else if(first == last-1)
		return max(A[first], A[last]);
		// if the current array has size 3 or more
		else
		{
		mid = first + (last-first)/2;
		if(A[mid-1] < A[mid] && A[mid] > A[mid+1])
		return A[mid];
		else if(A[mid-1] < A[mid] && A[mid] < A[mid+1])
		first = mid+1;
		else if(A[mid-1] > A[mid] && A[mid] > A[mid+1])
		last = mid-1;
		else
		return INT_MIN ;
		} // end of else 
		} // end of while
		return 0;
		}

		private int max(int i, int j) {
			// TODO Auto-generated method stub
			if(i>j)
			return i;
			else
				return j;
		}

		public static void main(String[] args) {
			int a[]={-1,-2,-4,2,3,4,5,6,7,7};
			Arrays.sort(a);
			arrIncreaseDecreasingSeq ar=new arrIncreaseDecreasingSeq();
			int ne=ar.Search(a, 0, a.length);
			/* for(int a2:ar){
				 System.out.print(a2 + " ");
			 }*/
			System.out.println(ne);
		}
}
