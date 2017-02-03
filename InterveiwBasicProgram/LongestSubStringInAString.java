package InterveiwBasicProgram;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class LongestSubStringInAString {
	public static void main(String[] args){
		
		String given="thelongestsubstring";
		char[] a=given.toCharArray();
		
		int longestSubString=0;
		String subStringIs=null;
		//char c;
		//Number of accurance to find
		LinkedHashMap<Character,Integer> m=new LinkedHashMap<Character,Integer>();
		 
		 for (int i=0;i<a.length;i++){
			 
			char c=a[i];
			 
			 if(!m.containsKey(c)){
				 m.put(c,i);
				 
			 }else{  
				 i=m.get(c);
				 m.clear();
			 }
			 
			 if(m.size()>longestSubString){
				 longestSubString=m.size();
				 subStringIs=m.keySet().toString();
			 }
		/*	 
			 {u=11, b=12, s=13, t=14, r=15, i=16, n=17, g=18}
*/
		 }
		 
		 System.out.println("longestSubString: "+longestSubString);
		 
		 System.out.println("longestSubString: "+subStringIs);
		 System.out.println(m);
	}

}










/*for(char c:a){
	if(m.containsKey(c)){
		m.put(c,m.get(c)+1);
	}else{
		m.put(c,1);
		
	}
}



for(int i=0;i<a.length;i++){
	
	   
	if(m.containsKey(a[i])){
		m.put(a[i],m.get(a[i])+1);
	}else{
		m.put(a[i],1);
		
	}
	
}*/