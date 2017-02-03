package String;

import java.io.BufferedReader;

class RemoveRepChar
{
   /* public static void main(String args[])
    {
         
        String s = "ABCBA";
 
        s = s + " "; // Adding a space at the end of the word
        int l=s.length(); // Finding the length of the word
        String ans=""; // Variable to store the final result
        char ch1,ch2;
 
        for(int i=0; i<l-1; i++)
        {
            ch1=s.charAt(i); // Extracting the first character
            ch2=s.charAt(i+1); // Extracting the next character
 
// Adding the first extracted character to the result if the current and the next characters are different
 
            if(ch1!=ch2)
            {
            ans = ans + ch1;
            }
        }
        System.out.println("Word after removing repeated characters = "+ans); // Printing the result
    }*/
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(removeDup("ABCCBCBBA"));

	}
	
	public static String removeDup(String s){
		
		String finalRes = s;
		//if(s.equals(f));
		String f="";
		for(int i=0; i<=s.length()-2;i++){
			if(s.charAt(i) == s.charAt(i+1)){
				String temp = s.substring(0, i);
				f = temp+s.substring(i+2, s.length());
				System.out.println("fin "+f);
			}
			/*else{
				finalRes = finalRes+s.charAt(i);
			}*/
		}
		while(!finalRes.equals(f))
			{removeDup(f);
			}
		return finalRes;
	}

}
