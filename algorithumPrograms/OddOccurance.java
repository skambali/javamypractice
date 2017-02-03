package algorithumPrograms;

import java.sql.Array;
import java.util.Arrays;

class OddOccurance 
{
    int getOddOccurrence(int ar[], int ar_size) 
    {
        int i;
        int res = 0;
        for (i = 0; i < ar_size; i++) 
        {
            res = res ^ ar[i];
            System.out.println(res);
        }
        System.out.println("end here");
        return res;
    }
 
    public static void main(String[] args) 
    {
        OddOccurance occur = new OddOccurance();
     int ar[] = new int[]{2, 3, 5, 4, 5, 2, 4, 3, 5, 2, 4, 4, 2};
          
      //  int ar[]={ 1, 2, 3, 2, 3, 1, 3};
     // int ar[]={ 1,1,2,2,5,5,2,1};
      // int ar[]={1,2,2,4,4};
        //int ar[]={2,2,3,3,3};
        
      //  Arrays.sort(ar);
        int n = ar.length;
        System.out.println(occur.getOddOccurrence(ar, n));
    }
}