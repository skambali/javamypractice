package StringManuplation;
 
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexFindEmail {
	public static void main(String[] args) {
		
		
		
		//aba02.22@gmail.co.in
	
		Pattern p=Pattern.compile("[a-zA-z0-9][a-zA-z0-9.-]*@[a-zA-Z0-9]+([.][a-zA-Z]+)+");
		Matcher m=p.matcher(args[0]);
		if(m.find()&& m.group().equals(args[0])){
			System.out.println("Valid email:" +m.group());
			
		}else{
			System.out.println("Sorry,Not Match found:" +m.group());
		}
		
	}
	}

 