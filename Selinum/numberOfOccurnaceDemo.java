package Selinum;

import java.util.HashMap;
//Number of accurance of Charcaters in a  given String


/*Logic
Take a given String ex:abbba
Store it CharArry
user HashMap and put the values such that 
if value is not there in map add it. if it there incrment the exsisitng count
 */

class numberOfOccurnaceDemo{
	public static void main(String[] args){
		String s="abbbacca";
		char c[]=s.toCharArray();
		HashMap<Character,Integer> stringMap=new HashMap<Character, Integer>();
		for(char ch:c){
			
		if(stringMap.containsKey(ch)){
			stringMap.put(ch,stringMap.get(ch)+1);
			
		}else{
			stringMap.put(ch,1);
		}
			 
		}
		
	System.out.println(stringMap);	
		 
		
	}
	
}