package StringManuplation;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class numberofFileinDirec {
	
	public static void main(String[] args) throws IOException {
		Pattern p=Pattern.compile("[A-Za-z0-9_-]*[.](java|class)");
		PrintWriter pw=new PrintWriter("numberOFFile.txt");
		
		File f= new File("C:/Users/rkambali/Desktop/QA/java/javaMyPractice/StringManuplation");
		int count=0;
		String s[]=f.list(); 
		 	 for(String n:s){
		 		 
		 		 Matcher m=p.matcher(n); 
		 		 if(m.find()&&m.group().equals(n)){
		 			 count++;
		 			 System.out.println(m.group());
		 			 pw.write(m.group());
		 			 pw.println();
		 			 pw.println();
		 		 }
		 		 
		  	 }
		 	 System.out.println("Totla count of Java file Is"+count);
		 	 pw.println();
		 	 pw.write("Totla count of Java file Is"+count);
		 	 pw.flush();
		 	 pw.close();
		 	
	}

}
