package String;

public class stringReverse {
	
/*	static String  doreverse(String str){
		
		StringBuilder br=new StringBuilder();
		
		char c[]=str.toCharArray();
		
	      for(int i=c.length-1;i>=0;i--){
	    	  br.append(c[i]);
	      }
		 
		return br.toString();
		
	}*/
	
	static String doreverse(String a){
		
		char b[]=a.toCharArray();
	 
		for(int i=0;i<b.length/2;i++){
		char temp;
		temp=b[i];
		b[i]=b[b.length-1-i];
		b[b.length-1-i]=temp;
		}
	
		String check = "";
		 
		for (char c2:b){
			check=check+c2;
		
		}
		
		return check;
	}
	
	public static void main(String[] args){
		String a="abcd";
		
		System.out.println("Rever of String is:"+doreverse(a));
		
	/*	String pali=doreverse(a);
		
		if(a.equals(pali)){
			System.out.println("its palindrome:---"+a);
		}else{
			System.out.println("Not a Palindrome");
		}*/
	}
	

}
