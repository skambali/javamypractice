package Selinum;

import java.util.LinkedHashMap;

/*Logic

Read a String "javaIlike"
conver to Char array

LengthOfSubString
subString

used LinkedHashMap
1.if LinkedHashMap is empty add all values in to Map
2. if containesKey anything.
i=hashmap.get(c); stroing that postion.
clear array

if l.size()> lengthOfSusting{
	lengthOfSusting=l.size();
	subString= print the string
 */
public class sustringGivenString {
	
	public static void main(String[] args){
	//	String s="javaconceptoftheday";
		String s="javailike";
		
		char[] c=s.toCharArray();
		int lengthOfSubString=0;
		String subStringIs=null;
		LinkedHashMap<Character,Integer> l=new LinkedHashMap<Character,Integer>();
	//	char ch;
		for(int i=0;i<c.length;i++){
			
			char ch=c[i];
			if(!l.containsKey(ch)){
				l.put(ch,i);
			}else{
				i=l.get(ch);
				l.clear();
				
			}
			
			if(l.size()>lengthOfSubString){
				lengthOfSubString=l.size();
				subStringIs=l.keySet().toString();
			}
			
		}
		
		System.out.println("SubString is:"+subStringIs);
		System.out.println("SubString Length is:"+lengthOfSubString);
	}
	
	

}
