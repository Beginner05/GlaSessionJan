package Lec4;

public class TrgtSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {1,2,15,8,25};
boolean ans=sol(arr,50,0,0,"");
	System.out.println(ans);
	}
	public static boolean sol(int arr[],int trgt,int sum,int idx,String ans)
	{
		if(trgt==sum)
		{
			System.out.println(ans);
			return true;
		}
		if(trgt<sum||idx==arr.length)
		{
			return false;
		}
		boolean in=sol(arr,trgt,sum+arr[idx],idx+1,ans+arr[idx]+" ");
		boolean ex=sol(arr,trgt,sum,idx+1,ans);
		return in||ex;
	}
	

}
