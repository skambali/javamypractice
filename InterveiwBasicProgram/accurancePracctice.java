package InterveiwBasicProgram;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class accurancePracctice {
	
	public static void main(String[] args) {
		String a="abcc";
		char[] c=a.toCharArray();
		HashMap<Character,Integer> map=new HashMap<Character,Integer>();
		 
		for(int i=0;i<c.length;i++){
		 
		if(map.containsKey(c[i])){
			map.put(c[i],map.get(c[i])+1);
		}else{
			map.put(c[i],1);
			
		}
		
		}
		
		/*for(char c1:c){
			if(map.containsKey(c1)){
				map.put(c1, map.get(c1)+1);
			}else{
				map.put(c1, 1);
			}
			 
		}*/
		System.out.println(map);
		
	}

}
