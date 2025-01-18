package Lec4;

public class RodCutting {

	public static void main(String[] args) {
	int arr[]= {};
	
		int ans=sol(6,arr,0);
	System.out.println(ans);
	}
	public static int sol(int len,int arr[],int profit)
	{
		if(len==0)
		{
			return profit;
		}
		int ans=0;
		for(int cut=1;cut<=len;cut++)
		{
			int res=sol(len-cut,arr,profit+arr[cut-1]);
		ans=Math.max(ans, res);
		}
		return ans;
	}
	
}