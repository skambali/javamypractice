package Arrays;

public class sumofPairs {

	public static void main(String[] args){
		int a[]={5,6,2,3};
		int sum=8;
		int f,s;
		for(int i=0;i<a.length;i++){
			f=a[i];
			for(int j=i+1;j<a.length;j++){
				s=a[j];
			if(f+s==sum){
				System.out.println("values are"+ f +s);
			}
		}
	}

	} 
}