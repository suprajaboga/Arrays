package Max_Minelement;

public class Max_Minelement {
	public static void main(String args[]) {
		int a[]= {5,2,8,11,10,1};
		int min=0,max=0;
		int n=a.length;
		if(n==1)
			min=max=a[0];
		if(a[0]>a[1]) {
			max=a[0];
			min=a[1];
		}
		else {
			max=a[1];
			min=a[0];
		}
		for(int i=2;i<n;i++) {
			if(a[i]>max)
				max=a[i];
			else if(a[i]<min)
				min=a[i];
		}
		System.out.println("max="+max+" "+"min="+min);
	}
    
}
