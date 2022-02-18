package largestsumcontiguoussubarray;

//Using Kadane's algorithm
//public class largestsumcontiguoussubarray {
//	public static void main(String args[])
//	{
//		int a[]= {-2,-3,4,-1,-2,1,5,-3};
//		int min_ending_here=0,max_so_far=0,start=0,end=0,s=0;
//		
//		for(int i=0;i<a.length;i++)
//		{
//			
//			min_ending_here=min_ending_here+a[i];
//			
//			if(max_so_far<min_ending_here)
//			{
//				max_so_far=min_ending_here;
//				start=s;
//				end=i;
//			}
//			
//			if(min_ending_here<0)
//			{
//				min_ending_here=0;
//				s=i+1;
//			}
//		}
//	    System.out.println("Maximum subarray sum is: "+max_so_far+" "+"Start index: "+start+" "+"End index: "+end);
//		
//	}
//}


//using Dynamic Programming
public class largestsumcontiguoussubarray {
	public static void main(String args[])
	{
		int a[]= {-2,-3,4,-1,-2,1,5,-3};
		int curr_max=a[0],max_so_far=a[0];
		
		for(int i=1;i<a.length;i++)
		{
			curr_max=Math.max(a[i], curr_max+a[i]);
			max_so_far=Math.max(curr_max, max_so_far);
		}
	    System.out.println("Maximum subarray sum is: "+max_so_far);
		
	}
}