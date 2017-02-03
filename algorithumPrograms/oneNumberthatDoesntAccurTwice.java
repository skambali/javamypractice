package algorithumPrograms;

import java.util.Arrays;
import java.util.List;

public class oneNumberthatDoesntAccurTwice {
public static void main(String[] args) {
	int a []={3, 4, 5, 3, 4};
//	List list = Arrays.asList(a);
	int result = 0;
	for(int i:a)
	{
	   /* if(list.indexOf(i)==list.lastIndexOf(i))
	    {
	        result = i;
	        
	    }*/
	    
	    		 
	    		  result ^= i;
	    		 
	}
	
	System.out.println(result);
}
}
