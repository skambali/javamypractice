package String;

import java.util.regex.Pattern;

public class ReverseASentance {
	public static void main(String[] args) {
		
		String s="welcome to india";
		
		Pattern p= Pattern.compile("\\s");
		String a[]=p.split(s);
	 for(String a1:a){
		 System.out.print(a1);
		 System.out.print(" ");
	 }
	 System.out.println();
	 System.out.println("---After------------");
	 for(int i=0;i<a.length/2;i++){
			String temp=a[i];
			a[i]=a[a.length-1-i];
			a[a.length-1-i]=temp;
		}
		
	 for(String a1:a){
		 System.out.print(a1);
		 System.out.print(" ");
	 }

		
	}

}
