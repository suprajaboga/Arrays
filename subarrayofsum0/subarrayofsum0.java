package subarrayofsum0;

import java.util.*;

public class subarrayofsum0 {

	public static void main(String[] args) {
		int a[]= {-3,3,3,1,6};
		Set<Integer> hs=new HashSet<>();
		int sum=0;
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			sum+=a[i];
			if(a[i]==0||sum==0||hs.contains(sum))
			{
				System.out.println("Found subarray");
				count++;
				break;
			}
			hs.add(sum);
		}
		if(count==0)
			System.out.println("No subarray found");
	}

}
