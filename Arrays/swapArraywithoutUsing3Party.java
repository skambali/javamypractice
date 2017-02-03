package Arrays;

public class swapArraywithoutUsing3Party {
	
public static void swap(int [] a){
	
	if(a.length>2 ||a==null) return;
	
	a[0]=a[1]-a[0];//6,2=-4
	a[1]=a[1]-a[0];//2,-4=6
	a[0]=a[0]+a[1];//-4,6=2
	
}

public  void num(int  a,int b ){
	
	 a=a^b;
	 b=a^b;
	 a=a^b;	
	 /*a=a+b;
	b=a-b;
	a=a-b;*/
}


	
	public static void main(String[] args) {
    int data[]={6,2};
    System.out.println(data.length);
    swapArraywithoutUsing3Party a2=new swapArraywithoutUsing3Party();
	swap(data);
	
	for(int i:data){
		System.out.print(i);
		System.out.print( " ");
	}
	int	a=4;
	int b=2;
	System.out.println("before");
	System.out.println(a +","+ b);
	
	//a.num(i,j);
	
	/*a=a^b;
	b=a^b;
	a=a^b;*/
	
	a=a+b; //5=2+3
	b=a-b;  //2=5-3
	a=a-b;
	
	System.out.println("After");
		
	System.out.println(a +","+ b);
			
		
		/*for(int b:data){
			System.out.print(a);
		}*/
		
	}

	
}
