package Arrays;

public class ananymosArry {
	public static void main(String[] args) {
		ananymosArry a= new ananymosArry();
		a.sum(new int[]{10,20,30});
	}
	
	
	public int sum(int[] x){
		
		int sum=0;
  for(int x1:x){
	  sum=sum+x1;
	  
  }
  System.out.println(sum); //60
return sum;
	}
	
 
}
