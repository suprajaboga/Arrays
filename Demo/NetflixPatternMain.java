package Demo;
import java.util.*;

public class NetflixPatternMain {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		NetflixController plan=new NetflixController();
		
		System.out.println("Enter your plan");
		String user_plan=sc.next();
		
		System.out.println("Enter no.of months");
		int n=sc.nextInt();
		
		NetflixPlan final_value=plan.getPlan(user_plan);
		System.out.println(final_value);
		System.out.println("Monthly bill: "+final_value.getPrice());
		System.out.println("Total bill: "+final_value.getFinalamount(n));
	}

}
