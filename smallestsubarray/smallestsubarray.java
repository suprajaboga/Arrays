//smallest subarray with sum greater than given value

package smallestsubarray;

public class smallestsubarray {

	public static void main(String[] args) {
		int a[]= {1,4,45,6,0,19};
		int x=51,n=a.length;
		int i=0,j=0,sum=0,min_len=Integer.MAX_VALUE;
		while(j<n)
		{
			while(sum<=x&&j<n)
				sum=sum+a[j++];
			while(sum>x&&i<n)
			{
				if(j-i<min_len)
					min_len=j-i;
				sum=sum-a[i++];
			}
		}
		System.out.println("Smallest lebgth subarray: "+min_len);
	}

}
