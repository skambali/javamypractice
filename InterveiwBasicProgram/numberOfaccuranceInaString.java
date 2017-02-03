package InterveiwBasicProgram;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

import javax.swing.text.html.HTMLDocument.Iterator;

public class numberOfaccuranceInaString {

	public static void main(String[] args){
		String a="aabcc";
		System.out.println("entered string:"+a);
	/* */
      char charArry[]=a.toCharArray();
      
      LinkedHashMap<Character,Integer> map=new LinkedHashMap<Character ,Integer>();
      System.out.println(map);

      for(char c:charArry){
    	  if(map.containsKey(c)){
    		 map.put(c, map.get(c)+1);
    	//  System.out.println(map.put(c, map.get(c)+1));
    		  
    	  }else{
    		  map.put(c, 1);
    	//  System.out.println(map.put(c,1));
    	  }
    	  
    	  
    	//  System.out.println(); 
      }
      
      System.out.println(map.get('b'));
   
      
      String st=map.keySet().toString();
      System.out.println(st);
      
      
	}

	
	}
