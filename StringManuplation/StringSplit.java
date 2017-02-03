package StringManuplation;

import java.util.regex.Pattern;

public class StringSplit {
	public static void main(String[] args) {
		Pattern p=Pattern.compile("[.]");
		//String s[]=p.split("durga softwate solutions");
		String s[]=p.split("www.ebay.com");
		
		for(String sa:s){
			System.out.println(sa);
		}
		
	}

}


/*
 * *exp://a
 * tokens are
durg
softw
te solutions
*/

 
/*
 *exp://o
  tokens are
ftwate s
luti
ns

*/