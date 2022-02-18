package longestconsecutivesubsequence;
import java.util.*;

public class longestconsecutivesubsequence {

	public static void main(String[] args) {
		int a[]= {100,4,101,1,2,3};
		int count=0;
		Set<Integer> hs=new HashSet<>();
		for(int i=0;i<a.length;i++)
			hs.add(a[i]);
		for(int i=0;i<a.length;i++)
		{
			//if current ele is the starting ele of the sequence
			if(!hs.contains(a[i]-1))
			{
				int j=a[i];
				while(hs.contains(j))
					j++;
				if(count<j-a[i])
					count=j-a[i];
			}
		}
		System.out.println(count);
	}

}
