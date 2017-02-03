package Arrays;

public class swapArraywithOutUsing3rdParty {
	
	public void swap(int a[]){
		int i=a.length;
		if(a.length>2 ||a==null) return;
		
		a[0]=a[1]-a[0];
		a[1]=a[1]-a[0];
		a[0]=a[0]+a[1];
		}
	public static void main(String[] args) {
		int[] a={4,2};
		
		swapArraywithOutUsing3rdParty ada=new swapArraywithOutUsing3rdParty();
		ada.swap(a);
		for(int a2:a){
			System.out.println(a2);
		}
		System.out.println();	
	}

}
