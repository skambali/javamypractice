package SampleBasicProg99;

public class repalaceString {
	 public static void main(String args[]){
		String a="welcome";
		 
		 StringBuffer str=new StringBuffer(a).reverse();
		 System.out.println(str);
		 String a1="welcome";
		 System.out.println(a);
		 String rev = "",c = "";
		 int l=a1.length();
		 for(int i=l-1;i>=0;i--){
			 rev=rev+a.charAt(i);
		 }
		 
		 System.out.println(rev);
	 }
}
