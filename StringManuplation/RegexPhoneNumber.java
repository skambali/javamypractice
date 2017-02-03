package StringManuplation;
 
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexPhoneNumber {
	public static void main(String[] args) {
		
		
		
		//Pattern p=Pattern.compile([7-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9]
	
		Pattern p=Pattern.compile("(91|0)?[7-9][0-9]{9}");
		Matcher m=p.matcher(args[0]);
		if(m.find()&& m.group().equals(args[0])){
			System.out.println("Match found:" +m.group());
			
		}else{
			System.out.println("Sorry,Not Match found:" +m.group());
		}
		
	}
	}

 