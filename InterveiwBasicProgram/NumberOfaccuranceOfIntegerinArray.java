package InterveiwBasicProgram;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class NumberOfaccuranceOfIntegerinArray {
	public static void main(String[] args){
		
	 int num[]={11,11,12,22,42,33,23,44,233,444,444};
	 int count = 0;
	/* for(int i=0;i<num.length;i++){
		 for(int j=1;j<num.length;j++){
			 if(num[i]==num[j]){
				 
				count++;
				 
				System.out.println(num[i] +":occured in:"+count +":Times");
			 }
		 }
	 }*/
		
	 
	 LinkedHashMap<Integer,Integer> h=new LinkedHashMap<Integer,Integer>();
	 
	 for(int a:num){
if(h.containsKey(a)){
	h.put(a,h.get(a)+1);
}else{
	h.put(a, 1);
}
	 }
	 String n=h.keySet().toString();
	 
		System.out.println(n);
		System.out.println(n.length());
	}

}
