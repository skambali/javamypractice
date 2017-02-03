package Arrays;

import java.util.Arrays;

public class findLargestandSmallest {
	public static void main(String[] args){
		Object[] a={4,5,6,78,100,1};
		Arrays.sort(a);

		Boolean value=Arrays.asList(a).contains(5);
		System.out.println(value);
		
		System.out.println("Minimum Value is"+a[0] +"Maximum Value is"+a[a.length-1]+"2 Maximum Value is"+a[a.length-2]);
		
		
	}

} 
