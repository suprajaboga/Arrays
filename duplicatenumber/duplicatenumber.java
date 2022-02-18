//Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.
//There is only one repeated number in nums, return this repeated number.
//Using Floyd's loop detection

package duplicatenumber;

public class duplicatenumber 
{
	public static void main(String args[]) 
	{
	int a[]= {3,1,3,4,2};
	int slow=a[0];
	int fast=a[0];
	do {
		slow=a[slow]; 				//move slow pointer by 1 step
		fast=a[a[fast]];			//move fast pointer by 2 steps
	}while(slow!=fast);				
	fast=a[0];						//when they intersect at one point,move one pointer to start and then move slow n fast pointers by 1 step
	while(slow!=fast)
	{
		slow=a[slow];
		fast=a[fast];
	}
    System.out.println(fast);
	}
}
