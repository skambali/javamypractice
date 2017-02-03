 package algorithumPrograms;

import java.util.Arrays;

public class maxmimumDiffrance {
	public static void main(String[] args) {
		int[] a={2,1,8,5};
		Arrays.sort(a);
		for(int i=0;i<a.length/2;i++){
			int temp=a[i];
			a[i]=a[a.length-1-i];
			a[a.length-1-i]=temp;
			
		}
		//int diff;
		System.out.println("Maximum diffrnace is"+(a[0]-a[1]));
	}

}
 