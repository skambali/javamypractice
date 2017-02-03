package StringManuplation;

import java.io.BufferedReader;
 	
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractEmailfromFile {

	public static void main(String[] args) throws IOException {
		Pattern p=Pattern.compile("((0|91)?[7-9][0-9]{9})|([a-zA-Z0-9][a-zA-Z0-9_-]*@[a-zA-Z0-9]+([.][a-zA-Z0-9]+)+)");
		int count=0;
		PrintWriter pw=new PrintWriter("PhoneAndemailOutput.txt");
		BufferedReader br=new BufferedReader(new FileReader("C:/Users/rkambali/Desktop/QA/java/javaMyPractice/StringManuplation/normalTextData.txt"));
		
		String line=br.readLine();
		while(line!= null){
			count++;
			Matcher m= p.matcher(line);
			 
			
			if(m.find()){
				pw.write(m.group());
				pw.println();
				
			}
			line=br.readLine();
			
		}
		pw.flush();
		pw.close();
		br.close();
		System.out.println("Total  count of the match is:"+count+"  Match found");
	}
}
