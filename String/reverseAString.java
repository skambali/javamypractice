package String;

public class reverseAString {
	public static void main(String[] args) {
		String s="abc12";
		StringBuilder sb=new StringBuilder();
		char[] a=s.toCharArray();
		for(int i=0;i<a.length/2;i++){
			char temp=a[i];
			a[i]=a[a.length-1-i];
			a[a.length-1-i]=temp;
		}
		
		for(char a1:a){
			sb.append(a1);
			System.out.print(a1);
			System.out.println(" ");
			
		}
		System.out.println(sb);
	}

}
