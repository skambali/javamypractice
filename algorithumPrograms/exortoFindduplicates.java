package algorithumPrograms;

import java.util.Arrays;

public class exortoFindduplicates {
	public static void main(String[] args) {
		//int a[]={2,3,4,5,6,7,3};
		int a[]={4, 3,1, 2,4};
		
		//int a[]={2,2,3};
		Arrays.sort(a);
		int sum=0;
		for(int i=0;i<a.length;i++){
		sum=sum^a[i]^i;
		System.out.println(sum);
		 
			
		}
		System.out.println("---------------");
		System.out.println(sum);
	}

} 
