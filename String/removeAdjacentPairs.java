package String;


public class removeAdjacentPairs {
	public static void removeAdajcentPairs(char[] str,int len)
	{
		int j=0;
		for(int i=1;i<=len;i++){
			while((str[i]==str[j])&&(j>=0)){
				i++;
				j--;
			}
			str[++j]=str[i];
			System.out.print(str[j]);
		}
		return;
	}
	public static void main(String[] args) {
		
		//String a="ABCCBCBA";
		String a="ABBCBA";
		
		int len=a.length()-1;
		char[] al=a.toCharArray();
		System.out.println("Adjcent pair is: ");
		removeAdajcentPairs(al,len);
	}
}
