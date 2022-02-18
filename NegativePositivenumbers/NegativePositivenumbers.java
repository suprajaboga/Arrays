//move -ve no's to one side and +ve no's to one side


package NegativePositivenumbers;

public class NegativePositivenumbers {

	public static void main(String[] args) {
		int a[]= {-12, 11, -13, -5, 6, -7, 5, -3, -6};
		int j=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<0)
			{
				if(i!=j)
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
				j++;
			}
		}
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+" ");
	}

}

