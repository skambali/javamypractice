import java.util.Arrays;


public class numberOfaccurances {
	public static void main(String[] args) {

        int[] a = {
            1, 9, 8, 8, 7, 6, 5, 4, 3, 3, 2, 1
        };

        Arrays.sort(a);

        int nbOccurences = 0;

        for (int i = 0, length = a.length - 1; i < length; i++) {

            if (a[i] == a[i + 1]) {
                nbOccurences++;
            }
  
        }

        System.out.println("Number same occurences : " + nbOccurences);

      //Number same occurences : 3
    }



}
