 package StringManuplation;

import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CdrivertotalTxtFiles {
	public static void main(String[] args) {
		Pattern p=Pattern.compile("[A-Za-z0-9][A-Za-z0-9$*_.]*[.](java|class)");
		File f= new File("C:/Users/rkambali/Desktop/QA/java/javaMyPractice/StringManuplation");
		
		//File f= new File("C:\\");
	    int count=0;
		String s[]=f.list();
		
		//it will give the list of all files and sub folders
		
		 for(String s1:s){
			 Matcher m=p.matcher(s1);
			 
			 if(m.find()&& m.group().equals(s1)){
				 count++;
				 System.out.println(s1);
				 
			 }
			 
			 
			 
		 }
		 System.out.println("Total count of file is :" +count);	
	}

}
