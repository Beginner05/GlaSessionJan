package Lec1;

public class FindFirst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,5,10};
int ans=sol(arr,0,10);
	}
	public static int sol(int arr[],int idx,int trgt)
	{
		if(idx==arr.length)return -1;
		if(arr[idx]==trgt)return idx;
	return sol(arr,idx+1,trgt);
	}
	

}
