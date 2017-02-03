package StringManuplation;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractPhoneNumbrFromFile {

	public static void main(String[] args) throws IOException {
		Pattern p=Pattern.compile("(0|91)?[7-9][0-9]{9}");
		PrintWriter pw=new PrintWriter("outputOfMobileNumber.txt");
		BufferedReader br=new BufferedReader(new FileReader("C:/Users/rkambali/Desktop/QA/java/javaMyPractice/StringManuplation/normalTextData.txt"));
	int count=0;
		//Read a line in file
		String line=br.readLine();
		while(line != null){
			Matcher m=p.matcher(line);
			if(m.find()){
				count++;
				pw.write(m.group()); 
				
				pw.println();
				
				 
			}
           //reading the line for next iteration
			line=br.readLine();
		}
		
		System.out.println("Program ends here: write Sucess fully:"+count+ "-- mobile number");
		pw.flush();
		br.close();
		pw.close();
		
	}
}
