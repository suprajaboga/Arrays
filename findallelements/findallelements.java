//find all elements in an array that appear more than n/k times

package findallelements;

import java.util.*;
public class findallelements {
    public static void main(String args[]) {
      int a[]={ 1, 1, 2, 2, 3, 5, 4,2, 2, 3, 1, 1, 1 };
      int n=12,k=4;
      HashMap<Integer,Integer> hm=new HashMap<>();
      for(int i=0;i<a.length;i++)
      {
          if(!hm.containsKey(a[i]))
            hm.put(a[i],1);
          else
          {
              int count=hm.get(a[i]);
              hm.put(a[i],count+1);
          }
          
      }
      for(Map.Entry m:hm.entrySet())
      {
          Integer temp=(Integer)m.getValue();
          if(temp>(n/k))
            System.out.println(m.getKey());
      }
    }
}