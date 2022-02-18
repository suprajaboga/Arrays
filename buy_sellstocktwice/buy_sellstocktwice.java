package buy_sellstocktwice;

public class buy_sellstocktwice {

	public static void main(String[] args)
	{
		int a[]= {2, 30, 15, 10, 8, 25, 80};
		int n=a.length;
		int profit[]=new int[n];
		for(int i=0;i<n;i++)
			profit[i]=0;
		int max_price=a[n-1];	//max_price means selling price
		for(int i=n-2;i>=0;i--)
		{
			if(a[i]>max_price)
				max_price=a[i];
			profit[i]=Math.max(profit[i+1], max_price-a[i]);	//profit = S.P - C.P, Here a[i] is the cost price
		}
		int min_price=a[0];		//min_price means cost price
		for(int i=1;i<n;i++)
		{
			if(a[i]<min_price)
				min_price=a[i];
			profit[i]=Math.max(profit[i-1], profit[i]+a[i]);
		}
		System.out.println(profit[n-1]);
	}
}
