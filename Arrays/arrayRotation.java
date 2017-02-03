package Arrays;

public class arrayRotation {
	
	public static void doStringRotate(char a[],int rotate){
		for (int i=0;i<rotate;i++){
		for(int j=a.length-1;j>0;j--){
			char temp=a[j];
			a[j]=a[j-1];
			a[j-1]=temp;
 	
			}
			}
			}
	
	public static void main(String[] args){
		String a="welcome";
		
	char[] c=a.toCharArray();
		//int[] a={1,2,3,4,5,6};
		doStringRotate(c,1);
		for(char i3:c){
			System.out.print(i3);
		}
	}

}
