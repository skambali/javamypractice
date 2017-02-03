package StringManuplation;

import java.util.StringTokenizer;
import java.util.regex.Pattern;

public class RegSplit {
	
	public static void main(String[] args) {
		Pattern p=Pattern.compile("\\s");
		String[] s=p.split("Durga Software Solutions");
		for (String s2:s){
			System.out.println(s2);
			
		}
		
		//Same by String class
		
		String ss="Durga softwae Slout";
		String[] s2=ss.split("\\s");
		for(String a:s2){ 
			System.out.println(a);
		}
		
		
		
		
		StringTokenizer str=new StringTokenizer("Durga softwae Slout");
		while(str.hasMoreElements()){
			System.out.println(str.nextToken());
		}
		
		
		StringTokenizer stra=new StringTokenizer("27-06-2015","-");
		while(stra.hasMoreElements()){
			System.out.println(stra.nextToken());
		 
		}
	}

}
