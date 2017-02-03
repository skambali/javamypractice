package StringManuplation;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class filePhoneNumberReadStroreAsPhoneNumber {

	public static void main(String [] args) throws IOException{
		Pattern p=Pattern.compile("(0|91)?[7-9][0-9]{9}");
		BufferedReader r=new BufferedReader(new FileReader("C:\\Users\\rkambali\\Desktop\\QA\\java\\javaMyPractice\\StringManuplation\\normalTextData.txt")); 
	   PrintWriter pw=new PrintWriter("PhoneNumber01.txt");
		int count=0;
		 String number=r.readLine();
		 while(number!=null){
		Matcher m=p.matcher(number);	
		if(m.find()){
			count++;
		 System.out.println(m.group());
		
		pw.write(m.group());
	 	pw.println();
		 
		 }
		number=r.readLine();
 
	}
		 pw.print("PHONE NUMBER count is:--"+count);
		 pw.flush();
		 pw.close();
		 r.close();
}}
