package StringManuplation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringSpltDem01 {
public static void main (String[] args){
	
	Pattern p=Pattern.compile("[.]");
	//Matcher m=p.matcher("this is my string is");
	String s[]=p.split("this is my string is");
for(int i=0;i<s.length;i++){
	System.out.println(s[i]);
}
	
	/*
	String a[]=p.split();
	for(String a1:a){
		System.out.println(a1);
	}*/
	
	
	
	
}
}
