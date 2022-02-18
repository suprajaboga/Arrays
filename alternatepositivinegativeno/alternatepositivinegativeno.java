//rearrange no's in alternate +ve and -ve no's

package alternatepositivinegativeno;

public class alternatepositivinegativeno {

	public static void main(String[] args) {
		int a[]= {2,-10,3,-4,-1,6,-9};
		int n=a.length;
		int j=a.length-1;
		int i=0,k=0,temp;
		//move -ve no's to the end of the array
		while(i<j)
		{
			while(i<=j&&a[i]>0)
				i++;
			while(j>=0&&a[j]<0)
				j--;
			if(i<j)
			{
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
		while(k<n&&i<n)
		{
	        temp=a[i];
			a[i]=a[k];
			a[k]=temp;
			i++;
			k=k+2;
		}
		for(int x=0;x<a.length;x++)
			System.out.print(a[x]+" ");
	}

}
