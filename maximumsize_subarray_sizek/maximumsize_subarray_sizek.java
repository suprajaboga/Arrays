//Sliding window technique
package maximumsize_subarray_sizek;

public class maximumsize_subarray_sizek 
{
	public static void main(String args[])
	{
		int arr[] = new int[] {1, 4, 2, 10, 23, 3, 1, 0, 20};
		int k = 4;
		int n = arr.length;
		int window_sum = 0, max_sum = 0;
		for(int i=0;i<k;i++)
			window_sum = window_sum + arr[i];
		for(int i=k;i<n;i++)
		{
			window_sum = window_sum + arr[i] - arr[i-k];
			max_sum = Math.max(max_sum,window_sum);
		}
		System.out.println(max_sum);
	}
}
