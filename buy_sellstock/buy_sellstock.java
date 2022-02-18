package buy_sellstock;

public class buy_sellstock {

	public static void main(String[] args) {
		int price[]= {7,1,5,3,6,4};
		int min_stock=Integer.MAX_VALUE;
		int max_profit=0;
		for(int i=0;i<price.length;i++)
		{
			//to find the least stock price so far
			if(price[i]<min_stock)
				min_stock=price[i];
			
			//profit if the stock is sold today
			int diff=price[i]-min_stock;
			
			//if today's profit is > than max_profit so far then update
			if(max_profit<diff)
				max_profit=diff;
		}
		System.out.println(max_profit);
	}

}
