package InterveiwBasicProgram;

import java.util.Arrays;

public class anagram {

	public static void main(String[] args) {

		String word = "hitlerwoman";
		String ana = "motherinlaw";
		
	String anagram=	ana.toLowerCase();
	
	char[] w=word.toCharArray();
	char[] a=ana.toCharArray();
	Arrays.sort(w);
	Arrays.sort(a);

	System.out.println("its a anagram?:"+Arrays.equals(a, w));
	
	
	}} 
	 /*	
	
	System.out.println(anagram);
		
	//	 System.out.println(word.length());
		 
		 int l=word.length();
		 int a1=anagram.length();
		 if(!(l==a1)){return;}
		 
		 

		char[] w = word.toCharArray();
		char[] a = anagram.toCharArray();
	
		for(char ch:w){
			System.out.print(ch);
			System.out.print(" ");
			if(ch>=97 &&ch<=122){
				ch-=32;
				
				//  ch-=32;
				System.out.println(ch);
				
				
			}
			
		}

		System.out.println(w);

		System.out.println(a);

		Arrays.sort(w);
		Arrays.sort(a);

		System.out.println("After sort:");

		System.out.println(w);

		System.out.println(a);

		System.out.println("its a anagram:" + Arrays.equals(w, a));

	}

}
*/
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
