package StringManuplation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringReplace {
	public static void main(String[] args) {
		String regex = "^(https?)://([-a-zA-Z0-9+&@#/%?=~_|!:,.;]*[-a-zA-Z0-9+&@#/%=~_|])/(.*)";
		Pattern pattern = Pattern.compile(regex);
		
		String currURL="https://scgi.qa.ebay.com/ws/eBayISAPI.dll?UpgradeLimits";
		
		String replaceURL="https://scgi.fp.1231.strauts.qa.ebay.com/ws/eBayISAPI.dll?UpgradeLimits";
		Matcher m = pattern.matcher(currURL);
		String newURL = currURL;
		if (m.find() && replaceURL != null) {
			newURL = currURL.replace(m.group(2), replaceURL);
		}
		System.out.println(newURL);
	
	}

}
