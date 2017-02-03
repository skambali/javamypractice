package algorithumPrograms;

public class elementsArraySum3 {
	public static void main(String[] args) {
		int a[]={70,20,30,40,10,50,80,12,5,20};
		
		int key=220;
	for(int i=0;i<a.length;i++){
		for(int j=i+1;j<a.length;j++){
			for(int k=j+1;k<a.length;k++){
				if(a[i]+a[j]+a[k]==key){
					System.out.println("found");
					System.out.println(a[i]);
					System.out.println(a[j]);
					System.out.println(a[k]);
					return;
				}
			}
		}
	}
	}
	
 
}
