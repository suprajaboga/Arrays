package Demo;

public class NetflixController {
	public NetflixPlan getPlan(String plan) {
		if(plan==null)
			return null;
		else if(plan.equalsIgnoreCase("basic"))
			return new Basic();
		else if(plan.equalsIgnoreCase("standard"))
			return new Standard();
		else if(plan.equalsIgnoreCase("premium"))
			return new Premium();
		return null;
	}

}
