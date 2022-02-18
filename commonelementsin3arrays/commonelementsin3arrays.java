package commonelementsin3arrays;

public class commonelementsin3arrays
{
	public static void main(String args[])
	{
		int a[]= {1,5,10,20,40,80,80};
		int b[]= {6,7,20,80,80,100};
		int c[]= {3,4,15,20,30,70,80,80,120};
		int n1=a.length;
		int n2=b.length;
		int n3=c.length;
		int i=0,j=0,k=0;
		while(i<n1&&j<n2&&k<n3)
		{
			if(a[i]==b[j]&&b[j]==c[k])
			{
				System.out.println(a[i]);
				i++;j++;k++;
			}
			else if(a[i]<b[j])
				i++;
			else if(b[j]<c[k])
				j++;
			else
				k++;
//			int x=a[i-1];
//			while(a[i]==x)
//				i++;
//			int y=b[j-1];
//			while(b[j]==y)
//				j++;
//			int z=c[k-1];
//			while(c[k]==z)
//				k++;
		}
	}
}
