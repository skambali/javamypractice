package Arrays;

import java.util.Arrays;

/*same thing can be achived by

int i, X = 0, Y = 0;
for (i = 0; i < n-1; i ++)
X ^= A[i];
for (i = 1; i <= n; i ++)
Y ^= i;
//In fact, one variable is enough.
return X ^ Y;
}*/

public class MissingNumberInArray
{
    //Method to calculate sum of 'n' numbers
 
    static int sumOfNnumbers(int n)
    {
        int sum = (n * (n+1))/ 2;
 
        return sum;
    }
 
    //Method to calculate sum of all elements of array
 
    static int sumOfElements(int[] array)
    {
        int sum = 0;
 
        for (int i = 0; i < array.length; i++)
        {
            sum = sum + array[i];
        }
 
        return sum;
    }
 
    public static void main(String[] args)
    {
    	//number which missed so=length+1
        int n = 8;
 
        int[] a = {1, 4, 5, 3, 7, 8, 6};
       // int[] a = {1,2,3,5};
        
        Arrays.sort(a);
         for(int a1:a){
        	 System.out.print(a1);
        	 System.out.print(" ");
         }
 
        //Step 1
 
        int sumOfNnumbers = sumOfNnumbers(n);
 
        //Step 2
 
        int sumOfElements = sumOfElements(a);
 
        //Step 3
 
        int missingNumber = sumOfNnumbers - sumOfElements;
 
        System.out.println("Missing Number is = "+missingNumber);
    }
}