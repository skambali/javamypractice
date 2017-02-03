package StringManuplation;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class readallJavafileNameSaveinFile {
public static void main(String[] args) throws FileNotFoundException {
	Pattern p=Pattern.compile("[A-Za-z0-9][A-Za-z0-9$*_.]*[.](java|class)");
	File f= new File("C:/Users/rkambali/Desktop/QA/java/javaMyPractice/StringManuplation");

	
	PrintWriter pw=new PrintWriter("outPutofJavaFiles.txt");
	
	String s[]=f.list(); //get all the files
	int count=0;
	
	for(String s1:s){
		Matcher m=p.matcher(s1);
		if(m.find() && m.group().equalsIgnoreCase(s1)){
			count++;
			pw.write(s1);
			pw.println();
		
		}
		
	}
	pw.flush();
	pw.close();
	System.out.println("total number of file writen is: "+count);
	
}
}
