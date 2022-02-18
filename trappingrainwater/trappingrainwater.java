package trappingrainwater;

public class trappingrainwater {

	public static void main(String[] args) {
		int a[]= {3,0,0,2,0,4};
		int n=a.length;
		
		// left[i] contains height of tallest bar to the left of i'th bar including itself
		int left[]=new int[n];
		
		// Right [i] contains height of tallest bar to the right of ith bar including itself
		int right[]=new int[n];
		
		int water=0;
		
		 // Fill left array
		left[0]=a[0];
		for(int i=1;i<n;i++)
			left[i]=Math.max(left[i-1],a[i]);
		
		// Fill right array
		right[n-1]=a[n-1];
		for(int i=n-2;i>0;i--)
			right[i]=Math.max(right[i+1],a[i]);
		
		//Take the min of both the heights and subtract that block
		for(int i=0;i<n;i++)
			water+=Math.min(left[i], right[i])-a[i];
		
		System.out.println(water);
	}

}
