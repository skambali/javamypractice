package algorithumPrograms;

public class traillingZero {
	int  NumberOfTrailingZerosInNumber(int n)
	{
	int i, count = 0;
	if (n < 0)
	return -1;
	for (i = 5; n / i > 0; i *= 5)
	count += n / i; 
	return count;
	}
public static void main(String[] args) {
	
	traillingZero t=new traillingZero();
	int n=140600;
	int count=0;
	//System.out.println(t.NumberOfTrailingZerosInNumber(n));
	int num=0;
	while(n!=0){
		int reminder=n%10;
		if(reminder==0){
			count=count+1;
		}else{
			System.out.println("toal trailing zero is"+count);
			return;
		}
		n=n/10;
		
	}
	System.out.println("toal trailing zero is"+count);
}

}
