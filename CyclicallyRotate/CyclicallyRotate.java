//cyclically rotate array by one position
package CyclicallyRotate;
public class CyclicallyRotate {

	public static void main(String[] args) {
		int a[]= {3,5,1,8,2};
		int n=a.length;
		int x=a[n-1];
		for(int i=n-1;i>0;i--)
			a[i]=a[i-1];
		a[0]=x;
		for(int i=0;i<n;i++)
			System.out.print(a[i]+" ");
	}

}
