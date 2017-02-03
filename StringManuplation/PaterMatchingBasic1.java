package StringManuplation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PaterMatchingBasic1 {
	public static void main (String[] args){
		int count=0;
		
		String a="How to swap two elements in an ArrayList. By Chaitanya Singh | Filed Under: Java Collections. This tutorial will help you understand how to swap two elements";
		Pattern p=Pattern.compile("How");
		Matcher m=p.matcher(a);
		
		
		//m.end();
		//	m.end(); ---it gives end of  element +1
//		m.group(); ---it gives item you are finding.
		
		
		while(m.find()){
			count++;
			System.out.println(m.start() +"..."+ m.end()+"..."+m.group());
		}
		
System.out.println("total accurnace is"+count);		
		
		
		
	}

}

/*0...2...ab
3...5...ab
5...7...ab
8...10...ab
total accurnace is4*/