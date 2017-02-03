import java.lang.reflect.Array;
import java.util.Arrays;


public class numberofaccurnaces {

	public static void main(String[] args) {
		int[] a={2,3,4,2,2,5};
		/*1stMethod*/
		int max=0;
		int temp=0;
	int	count=1;
	
		/*for(int i=0;i<a.length-1;i++){
			for(int j=i+1;j<a.length;j++){
				if(a[i]==a[j]){
					count++;
			 }
				if(count>max){
					max=count;
					
				}
			}*/
	
	Arrays.sort(a);
	for(int a2:a){
		System.out.print(a2 +" "); 
		System.out.print( " ");
	}
	System.out.println();
	for(int i=0;i<a.length-1;i++){
	 
		if(a[i]==a[i+1]){
			count=count+1;
		
			
		 
		}
		 
		if(count==1){
			System.out.println("Accurnace of:"+a[i]+" number time is:" +count);
	}if(count==2){
		System.out.println("Accurnace of:"+a[i]+" number time is:" +count);
	}if(count==3){
		System.out.println("Accurnace of:"+a[i]+" number time is:" +count);
	}
		
	}}
}
