package collections;

import java.util.Comparator;
import java.util.NavigableMap;

public class compartorDemo implements Comparator {
	public int compare( Object i,Object j){
	Integer i1=(int)i;
	Integer i2=(int)j;
	//return -i1.compareTo(i2);[ 100,15,4,3]
	//return i2.compareTo(i1);[ 100,15,4,3]
	return -i2.compareTo(i1); //  insertion ordre [3, 4, 15, 100]
	
	
	
	/*
	if(i1<i2)
	{
		return +1;
	}else if (i1>i2){
		return -11;
				
	}else
		
		return 0;
		 
	}*///[ 100,15,4,3]
	}
}
