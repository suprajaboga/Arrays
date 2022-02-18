package Minimumjumps;

public class Minimumjumps {

	public static void main(String[] args) {
		int a[]={1,3,5,8,9,2,6,7,6,8,9};
		int jumps=0,reach=0,currentend=0;
		for(int i=0;i<a.length;i++)
		{
			reach=Math.max(reach, i+a[i]);
			if(i==currentend) {
				jumps++;
				currentend=reach;
			}
		}
		System.out.println("Min no.of jumps to reach end of an array: "+jumps);
	}

}
