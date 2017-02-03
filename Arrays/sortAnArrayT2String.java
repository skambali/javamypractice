package Arrays;

public class sortAnArrayT2String {
public static void main(String[] args){
	
	 String arr[]={"a","v","a","b","z","d"};
	 String temp;
	 for(int i=0;i<arr.length;i++){
		for(int j=i+1;j<arr.length;j++){
			if(arr[i].compareTo(arr[j])>0){
			 
			temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			}
				 
				
				 
			}
		}
 
for(String a:arr){
	System.out.print(a);
	System.out.println(" ");
}
}
}	/*String arr[]={"h","w","t","s"};
	//String arr[]={"a","v","a","b","z","d"};
	for(String a:arr){
    	System.out.print(a);
    	System.out.println();
    }
	
	System.out.println("after sort");
	String temp;
	
	for(int i=0;i<arr.length;i++){
		for(int j=i+1;j<arr.length;j++){
			if(arr[i].compareTo(arr[j])<0)
			{
				
	
}*/
