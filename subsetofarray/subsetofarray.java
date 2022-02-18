//Find whether if an array is subset of another array

package subsetofarray;

import java.util.*;
public class subsetofarray 
{
    public static void main(String args[])
    {
      int arr1[]={ 11, 1, 13, 21, 3, 7, 3 };
      int arr2[]={ 3, 1, 11, 7 };
      HashMap<Integer,Integer> frequency=new HashMap<>();
      
      for(int i = 0; i < arr1.length; i++)
       frequency.put(arr1[i],frequency.getOrDefault(arr1[i],0) + 1);
      
      for(int i = 0; i < arr2.length; i++) 
      {
           if (frequency.getOrDefault(arr2[i], 0) > 0)
        	   frequency.put(arr2[i],frequency.get(arr2[i]) - 1);
           else
           {
        	   System.out.println("No subarray found");
               System.exit(0);
           }
      }
      System.out.println("subarray found");
    }
}