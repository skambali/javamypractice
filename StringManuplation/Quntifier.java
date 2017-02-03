package StringManuplation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Quntifier {

	public static void main(String[] args) {
	
		String x="aaa?";
		String RegularExp="abaabaaaaaabzaa";

	Pattern p=Pattern.compile(x);
	Matcher m=p.matcher(RegularExp);
	
	
	while(m.find()){
		
		System.out.println("RegExp:"+ m.start() +"   String is:"+ m.group());
		
	}
}
}
/*String x="a";
RegExp:0   String is:a
RegExp:2   String is:a
RegExp:3   String is:a
RegExp:5   String is:a
RegExp:6   String is:a
RegExp:7   String is:a*/

/*String x="a+";

atleast one A

RegExp:0   String is:a
RegExp:2   String is:aa
RegExp:5   String is:aaa
RegExp:10   String is:aaaa


*/

/*String x="a*";
RegExp:0   String is:a
RegExp:1   String is:
RegExp:2   String is:aa
RegExp:4   String is:
RegExp:5   String is:aaa
RegExp:8   String is:
RegExp:9   String is:*/

/*At most one a
 * String x="a?";
 *
RegExp:0   String is:a
RegExp:1   String is:
RegExp:2   String is:a
RegExp:3   String is:a
RegExp:4   String is:
RegExp:5   String is:a
RegExp:6   String is:a
RegExp:7   String is:a
RegExp:8   String is:
RegExp:9   String is:

*/
