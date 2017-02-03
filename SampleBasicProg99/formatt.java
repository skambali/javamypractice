package SampleBasicProg99;

import java.util.Formatter;

public class formatt {
	public static  void main(String args[]){
		Formatter formatter = new Formatter();
  //  System.out.println(formatter.format("%20s %20s %20s %20s", "Title*", "Title*", "Title*","Title*"));
String cuser = "is";
		String ex="customer \""+cuser+"\"name";
		System.out.println(ex);
    int number=5;
    
    for(int i=1;i<=number;i++){
    	
    }
    for (int i = 1; i <=10; i++) {
        formatter = new Formatter();
         
		while(number!=0){
			
			
		}
		int  rowdata=i*2;
        int rowData1 = 3*i;
        int rowData2 = 4*i;
        int rowData3 = 5*i;
        
       // System.out.println(formatter.format("%20s %20s %20s %20s", rowdata, rowData1, rowData2,rowData3));
        
        System.out.println("	" +rowdata + "		"+ rowData1 +"		" +rowData2  +"		" +rowData3);
    }
}
}
