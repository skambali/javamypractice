package InterveiwBasicProgram;

import java.util.Scanner;

import bsh.StringUtil;

public class numberOfAccurance {
	public static void main(String[] args) {

		// String a="a.b.c.d";

	//	Scanner s = new Scanner(System.in);
		String w = "a.b.c.d";		// Scanner c=new Scanner(System.in);
		System.out.println("enter the String to search:"+w);

		char ch='.';
		System.out.println("enter the char to search:"+ch);
 
		//char ch = s.next().charAt(0);
		int count = 0;

		char[] c1 = w.toCharArray();
		int len = w.length();

		for (int i = 0; i < len; i++) {
			if (c1[i] == ch) {
				
				
				count++;

			}
		}

		System.out.println("total number of matche are:" + count);

		// System.out.println("enterd char is:"+ch);

	}
	
	
	
}


/*// String a="a.b.c.d";

		Scanner s = new Scanner(System.in);
		System.out.println("enter the String to search:");

		String w = s.next();
		// Scanner c=new Scanner(System.in);
		System.out.println("enter the char to search:");

		char ch = s.next().charAt(0);

		int count = 0;

		char[] c1 = w.toCharArray();
		int len = w.length();

		for (int i = 0; i < len; i++) {
			if (c1[i] == ch) {
				count++;

			}
		}

		System.out.println("total number of matche are:" + count);

		// System.out.println("enterd char is:"+ch);

	}*/



/*enter the String to search:a.b.c.d
enter the char to search:.
total number of matche are:3
*/

