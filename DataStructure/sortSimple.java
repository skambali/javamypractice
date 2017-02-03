package DataStructure;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

import collections.collecationdemos;

public class sortSimple {
public static void main(String[] args){
	int a[]={2,5,6,3,1,1,3};
	
	//String a[]={"h","a","c"};
	
	 	for(int i=0;i<a.length;i++){
		for(int j=1;j<a.length;j++){
			if(a[i]>=a[j]){
				int temp; 
				temp=i;
				i=j;
				j=a[temp];
			}
		}
	
	//Arrays.sort(a);
	
	 
		for(int a1:a){
			System.out.print(a1);
			System.out.print(" ");
		}
	}
}}
 
