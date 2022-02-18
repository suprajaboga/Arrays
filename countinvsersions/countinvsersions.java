package countinvsersions;
import java.util.*;
public class countinvsersions {

	public static int merge(int arr[],int temp[],int left,int mid,int right)
	{
		int i,j,k;
		int inv_count=0;
		
		i=left;   //index for left sub-array
		j=mid;    //index for right sub-array
		k=left;   //index for resultant merged sub-array
		
		while((i<=mid-1)&&(j<=right))
		{
			if(arr[i]<=arr[j])
				temp[k++]=arr[i++];
			else
			{
				temp[k++]=arr[j++];
				inv_count+=(mid-i);
			}
		}
		while(i<=mid-1)
			temp[k++]=arr[i++];
		while(j<=right)
			temp[k++]=arr[j++];
		for(i=left;i<=right;i++)
			arr[i]=temp[i];
		return inv_count;
	}
	public static int _mergesort(int arr[],int temp[],int left,int right) 
		{
			int inv_count=0;
			if(left<right)
			{
				int mid=(left+right)/2;
				inv_count+=_mergesort(arr,temp,left,mid);
				inv_count+=_mergesort(arr,temp,mid+1,right);
				inv_count+=merge(arr,temp,left,mid+1,right);
			}
			return inv_count;
		}
	public static void main(String[] args)
	{
		
		int arr[]= {5,3,2,4,1};
		int temp[]=new int[arr.length];
		int ans=_mergesort(arr,temp,0,arr.length-1);
		System.out.println(ans);
	}

}
