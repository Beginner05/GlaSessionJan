package Lec1;

public class AllIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,1,1,1};
int res[]=sol(arr,0,0,1);
	}
	public static int[] sol(int arr[],int idx,int cnt,int trgt)
	{
		if(idx==arr.length)
		{
			return new res[cnt];
		}
		if(arr[idx]==trgt)
		{
			int res[]=sol(arr,idx+1,cnt+1,trgt);
			res[cnt]=idx;
		return res;
		}
		return sol(arr,idx+1,cnt,trgt);
	}

}
