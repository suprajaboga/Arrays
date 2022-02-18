package mergearrays;
import java.util.*;

public class mergearrays {

	public static void main(String[] args) {
		int a1[] = new int[] { 1, 5, 9, 10, 15, 20 };
	    int a2[] = new int[] { 2, 3, 8, 13 };
	    int m=a1.length,n=a2.length;
	    int i=0,j=0,k=m-1,temp;
	    while(i<=k&&j<n)
	    {
	    	if(a1[i]<a2[j])
	    		i++;
	    	else
	    	{
	    		temp=a2[j];
	    		a2[j]=a1[k];
	    		a1[k]=temp;
	    		j++;
	    		k--;
	    	}
	    }
	    Arrays.sort(a1);
	    Arrays.sort(a2);
	System.out.println(Arrays.toString(a1));
	System.out.println(Arrays.toString(a2));
	}
}
