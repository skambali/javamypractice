package Arrays;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class firstElementofArrayWhichRepetead {

	public static void main(String[] args) {
		int a[]={2,5,6,2};
	/*	for(int a2:a){
			System.out.print(a2);
			System.out.print(" ");
		}*/
		System.out.println();
		 
		Arrays.sort(a);
		int count = 1;
		 
		Boolean  flag=true;
		
		int num=1;
		//String a5=a5.valueOf(num);
		/*char c=a5.toCharArray();*/
		for(int i=0;i<a.length-1;i++){
			if(a[i]==a[i+1]){
			System.out.println(+num+"st: Duplicate is:"+a[i]);
			count=2;
			num=num+1;
			flag=false;
			}
			if(flag=false){
				
				System.out.println("number of accurnace is"+a[i] +":" +count+1);
			}else{
				System.out.println("number of accurnace is"+a[i] +":" +count);
			}
		}
		
	/*	//reverse array
		 for(int i=0;i<a.length/2;i++){
			int temp=a[i];
			a[i]=a[a.length-1-i];
			a[a.length-1-i]=temp;
		 }
		
		for(int a2:a){
			System.out.print(a2);
			System.out.print(" ");
		}*/
		 
		
	}
}
