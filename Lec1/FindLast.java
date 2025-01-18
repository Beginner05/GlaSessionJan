package Lec1;

public class FindLast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {1,2,1,3,2,1};
int ans=sol(arr,0,1);
	}
	public static int sol(int arr[],int idx,int trgt)
	{
		if(arr.length==idx)return -1;
		if(arr[idx]==trgt)
		{
			int res=sol(arr,idx+1,trgt);
			if(res==-1)
			{
				res=idx;
				
			}
			return res;
		}
		return sol(arr,idx+1,trgt);
	}

}
