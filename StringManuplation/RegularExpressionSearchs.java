package StringManuplation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressionSearchs {
	public static void main(String[] args){
		
		
		String x = null;
		String RegularExp=null;
	//	x="[abc]"; only start with a or b or c
		
	/*	RegExp:0and Indext:1Search String is:a
		RegExp:2and Indext:3Search String is:b
		
	*/	
		//x="[^abc]"; oter than abc
		
		/*
		RegExp:1and Indext:2String is:7
		RegExp:3and Indext:4String is:@
		RegExp:4and Indext:5String is:z
		RegExp:5and Indext:6String is:#
		RegExp:6and Indext:7String is:9*/
		
		/*x="[a-z]"; 
		
		any  letter starts with a to z of small letter
		RegExp:0and Indext:1String is:a
		RegExp:2and Indext:3String is:b
		RegExp:4and Indext:5String is:z*/
		
		/*x="[0-9]"; 
		
		Starts with range of 0 to 9
		RegExp:1and Indext:2String is:7
		RegExp:6and Indext:7String is:9*/
		
	//	x="[^0-9]";
/*other than 0  to 9 print all
		
		RegExp:0and Indext:1String is:a
		RegExp:2and Indext:3String is:b
		RegExp:3and Indext:4String is:@
		RegExp:4and Indext:5String is:z
		RegExp:5and Indext:6String is:#

	*/x="/s";
		RegularExp="a7b@z#9";
		Pattern p=Pattern.compile(x);
		Matcher m=p.matcher(RegularExp);
		
		while(m.find()){
			
			System.out.println("RegExp:"+ m.start() +"and Indext:"+m.end() +"String is:"+ m.group());
			
		}
		
	}

	
	
}
