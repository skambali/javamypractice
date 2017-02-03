package A101Problems;

/*https://github.com/stevekrenzel/Miscellaneous/blob/9a5d71051b2c3caffdf85a5c9630b85bd177aebc/palindrome/palindrome.py#L200
 * """This program finds the longest palindrome in a given string.
The algorithm works as follows:
    Assume for simplicity that the palindrome is a length that is an odd
    number. Also, we treat a single character as a palindrome of length 1. 
    For each position in the string we store an upper and lower pointer
    that tracks the upper and lower bounds of the largest palindrome centered
    at that position.
    For instance, position 2 in the string "racecar" would start as:
    i.e.      lower
                |
               \|/
            r a c e c a r
               /|\ 
                |
              upper  
    At this point, the longest known palindrome at position 2 is the single
    character 'c'. We then increment the upper pointer and decrement the lower
    pointer and compare their respective values.
    i.e.    lower
              |
             \|/
            r a c e c a r
                 /|\ 
                  |
                upper  
    Since the upper and lower values are not the same, we stop and now know
    that the longest palindrome centered at position 2 is 'c'. We then start
    the process again at the next string position, 3.
    
    i.e.        lower
                  |
                 \|/
            r a c e c a r
                 /|\ 
                  |
                upper  
    We increment and decrement the upper and lower pointers and see that they
    are equal. Our current longest palindrome centered at position 3 is now
    'cec'.
    i.e.      lower
                |
               \|/
            r a c e c a r
                   /|\ 
                    |
                  upper 
    Since they were equal, we increment and decrement the pointers again and
    see that they are still equal. Our new longest palindrome centered at
    position 3 is now 'acece'.
    i.e.    lower
              |
             \|/
            r a c e c a r
                     /|\ 
                      |
                    upper 
    We continue incrementing and decrementing the upper and lower pointers
    until they don't match or they hit one of the ends of the string.
    
    Since our pointers are equal, we increment and decrement them again.
    We hit an end of the string and the pointers are equal so we know that
    our longest palindrome centered at position 3 is 'racecar'.
    i.e.  lower
            |
           \|/
            r a c e c a r
                       /|\ 
                        |
                      upper 
    We're done with position 3 and continue this same process again at
    position 4. We'll do this until we've covered every position in the string.
    NOTE: We initally assumed that the palindrome had an odd length. This
    algorithm works for even palindromes as well. The only change we make is
    that when we initialize the pointers, instead of having the lower and upper
    pointer point to the same position we have the upper pointer point at the
    next position. Everything else with the algorithm remains the same.
    i.e. The initial pointers for an even palindrome 'centered' at position 3
    would look like:
                lower
                  |
                 \|/
            r a c e c a r
                   /|\ 
                    |
                  upper 
The algorithm's runtime is:
    Worst-Case: O(N^2)
    Best-Case:  O(N)
The worst case is achieved when the string is a single repeated character
because every substring is a palindrome.
The best case is achieved when the string contains no palindromes.
Typically if a string only contains a single palindrome (the fewer the
better), the closer to O(N) it will run. This is because everytime it checks
a position in the string, it checks the character before and after that
position, and if they don't match then it stops looking for the palindrome.
Positions in the string can be discarded after only one lookup if that position
doesn't have a palindrome, so if there are no palindromes you only do N
comparisons.
"""
 * 
 * 
 * */
public class StringHighestPalindromeInAString {
	
	public  static String palindrome(String str){
		
		char[] c=str.toCharArray();
		char low,upper;
		int start = 0, end = 0;
		
		char[] temp=new char[c.length];
		for(int i=0;i<str.length()-1;i++){
			for(int j=2;j<str.length();j++){
				
			low=c[j];
			upper=c[j];
			
			if(low==upper){
				i++;
				j--;
				start=i;
				end=j;
				
				 }else{
					 i++;
						j--;
					 
				 }
				}
		
		}
		
		System.out.println("Palindrome is"+c[start] +c[end]);
		return str;
	}
	
	public static void main(String[] args) {
		
		System.out.println(palindrome("racecar"));
		
	}

}
