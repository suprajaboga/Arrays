package countpairs;
import java.util.*;

public class countpairs {

	public static void main(String[] args) {
		int arr[]= {1,5,7,-1};
		int sum=6;
		HashMap<Integer,Integer> hm=new HashMap<>();
		for(int i=0;i<arr.length;i++)
		{
			Integer j=hm.get(arr[i]);
			hm.put(arr[i],(j==null)?1:j+1);
			//System.out.println(hm);
		}
		int ans=0;
		for(int i=0;i<arr.length;i++)
		{
			Integer j=hm.get(sum-arr[i]);
			if(j!=null)
				ans+=j;
			if(arr[i]==sum-arr[i])
				ans--;
		}
		System.out.println(ans/2);
	}

}
