package InterveiwBasicProgram;

import java.util.HashMap;

public class NumberOfaccuranceInteger1 {
	public static void main(String[] args){
	
		int number=123322;
		String a=String.valueOf(number);
		char c[]=a.toCharArray();
		
		 
		
		
		HashMap<Character,Integer>h=new HashMap<Character,Integer>();
		
		 for(int i=0;i<c.length;i++){
		if(h.containsKey(c[i]))	{
			h.put(c[i],h.get(c[i])+1);
		}else{
			h.put(c[i], 1);
		}
		}
		System.out.println(h);
	}

}
























