package String;

import org.testng.reporters.jq.Main;

public class combinationOFString {
	
	public static void combination(String st){
		combinatin2("",st);
		
	}
	
	public static void combinatin2(String prefix,String st){
		System.out.println(prefix);
		for(int i=0;i<st.length();i++){
			
			combinatin2(prefix+st.charAt(i), st.substring(i+1));
		}
		
 

		
		
	}
public static void main(String[] args) {
	String a="ab";
	combinatin2("",a);
	//System.out.println(a);
	
}
	
	
}
