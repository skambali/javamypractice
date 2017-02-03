package InterveiwBasicProgram;

public class segregateEvennAddNumber {

	public static void main(String[] args) {
		int[] a={2,3,4,5,6,7,7,8,9,10,19};
		int k=0;
		int [] temp=new int[a.length];
		int count=0;
		int len=temp.length-1;
		for(int i=0;i<a.length;i++){
			if(a[i]%2==0){
				temp[k]=a[i];
				k++;
				count=count+1;
			}else{			 
				
				temp[len]=a[i];
				
				
				 
				len=len-1;
			 
			}
		}//2 4 6 8 10 19 9 7 7 5 3 
		
		System.out.println(count);
		for(int i=count;i<temp.length;i++){ 
		   for(int j=count+1;j<a.length;j++){
			   if(temp[i]<=temp[j]){
					//System.out.println(temp[i]);
			    int t=temp[i];
			    temp[i]=temp[j];
			    temp[j]=t;
			    
				}   }
		   }
			
		
		for(int a1:temp){
			
			System.out.print(a1);
			System.out.print(" ");
		}
	}
	
	/*int high=a.length-1;
	while(low>=high){	
	if(a[low]%2==0){
			temp[low]=a[low];
			low=low+1;
		}else{
			int len=temp.length-1;
			temp[len]=a[low];
			len=len-1;
			low=low+1;
		}
	*/
	
}
