//find a triplet that sum to given value

package triplet;
import java.util.*;

public class tripet {

	public static void main(String[] args) {
		int a[]= {12,3,4,1,6,9};
		int sum=24;
		HashSet<Integer> hs=new HashSet<Integer>();
		for(int i=0;i<a.length-1;i++)
		{
			int curr_sum=sum-a[i];
			for(int j=i+1;j<a.length;j++)
			{
				int ele=curr_sum-a[j];
				if(hs.contains(ele))
				{
					System.out.println("Triplet is: "+a[i]+" "+a[j]+" "+ele);
					System.exit(0);;
				}
				hs.add(a[j]);
			}
		}
	}

}
