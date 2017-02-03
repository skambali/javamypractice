package StringManuplation;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractEmailFromfileTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
	//	[a-zA-z0-9][a-zA-z0-9.-]
		Pattern p=Pattern.compile("[a-zA-Z0-9][a-zA-Z0-9*_.-]*@([A-Za-z0-9])+([.][A-zA-Z0-9]+)+");
		BufferedReader br=new BufferedReader(new FileReader("C:\\Users\\rkambali\\Desktop\\QA\\java\\javaMyPractice\\StringManuplation\\normalTextData.txt")); 
	    PrintWriter pw=new PrintWriter("emailTest.txt");
		String line=br.readLine();
		while(line!=null){
			Matcher m=p.matcher(line);
			if(m.find()){
				System.out.println(m.group());
				pw.write(m.group());
				pw.println();
			}
			line=br.readLine();
		}
		pw.flush();
		pw.close();
		
	} 

}
