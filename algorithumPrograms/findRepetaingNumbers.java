package algorithumPrograms;

import java.util.Arrays;

public class findRepetaingNumbers {
public static void main(String[] args) {
	int a[]={6,2,6,5,2,3,1};
	Arrays.sort(a);
for(int i=0;i<a.length-1;i++){
	
	if(a[i]==a[i+1]){
		System.out.println(a[i]);
	}
}
	
}
}
