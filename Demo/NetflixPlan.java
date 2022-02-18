package Demo;

public abstract class NetflixPlan {
	protected int price;
    abstract int getPrice();
    public int getFinalamount(int months) {
    	return price*months;
    }
}
