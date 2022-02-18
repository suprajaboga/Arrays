package chocolatedistribution;

import java.util.Arrays;

public class chocolatedistribution {

	public static void main(String[] args) {
		int a[]= {7,3,2,4,9,12,56};
		int m=3;
		Arrays.sort(a);
		int min_diff=Integer.MAX_VALUE;
		int first=0,last=0;
		for(int i=0;i+m-1<a.length;i++)
		{
			int diff=a[i+m-1]-a[i];
			if(diff<min_diff)
			{
				min_diff=diff;
				first=i;
				last=i+m-1;
			}
		}
		System.out.println("Minimun difference is: "+min_diff);
	}

}
