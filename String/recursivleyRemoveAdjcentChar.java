package String;

public class recursivleyRemoveAdjcentChar {
	public static char[] removeAdjcent(char[] s,int len){
		int j=0;
	for(int i=1;i<=len;i++){
		while((s[i]==s[j])&&(j>=0)){
			i++;
			j--;
		}
		s[++j]=s[i];
		
	}
	return null;
	 }
	
	public static void main(String[] args) {
		String a="abbacadd";
		
		char[] c=a.toCharArray();
		int len=c.length-2;
		removeAdjcent(c,len);
		
		for(char c1:c){
			System.out.print(c1);
			System.out.print(" ");
		}
		
	
	}

}
