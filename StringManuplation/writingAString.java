package StringManuplation;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class writingAString {

	public static void main(String[] args) throws IOException{
	
	 BufferedReader r=new BufferedReader(new FileReader("C:\\Users\\rkambali\\Desktop\\QA\\java\\javaMyPractice\\StringManuplation\\normalTextData.txt"));
		Pattern pa=Pattern.compile("[\\s]");	
		PrintWriter w=new PrintWriter("namcaps.txt");
		
		String line=r.readLine();
		
		boolean convert=true;
		
		 while(line!=null){
			 
			//Matcher m=pa.matcher(line);
	      String[] a=pa.split(line);
			
			 for(String na:a){
				 
				 if(convert){
				 System.out.println(na);
				convert=false; 
				w.write(na);
				w.println();
				 } else{
					 System.out.println(na.toUpperCase());
						convert=true; 
						w.write(na.toUpperCase());
						w.println();
							 
				 }
				 
			 }
		line=r.readLine();
			  
		 }
		  w.flush();
		 w.close();

		}
	
	
	
}
