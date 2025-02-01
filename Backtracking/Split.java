package Backtracking;

public class Split {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,3,4,5};
sol(arr,0,0,0,"","");
	}
	public static void sol(int arr[],int idx,int s1,int s2,String ans1,String ans2)
	{
		if(idx==arr.length&&s1==s2)
		{
			System.out.println(ans1+" and "+ans2);
		return;
		}
		if(idx>=arr.length)return;
		sol(arr,idx+1,s1+arr[idx],s2,ans1+arr[idx]+" ",ans2);
		sol(arr,idx+1,s1,s2+arr[idx],ans1,ans2+arr[idx]+" ");
	}

}
