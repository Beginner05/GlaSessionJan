package BinarySearch;

public class KokoEating {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	  public  int sol(int arr[],int hrs)
	    {

	int lo=1;int hi=-1;
	for(int i=0;i<arr.length;i++)
	{
	    hi=Math.max(arr[i],hi);
	}
	int ans=0;
	while(lo<=hi)
	{
	    int mid=(lo+hi)/2;
	    if(isItPossible(arr,mid,hrs)==true)
	    {
	ans=mid;
	hi=mid-1;
	    }
	    else{
	        lo=mid+1;
	    }
	}
	return ans;

	    }

	public boolean isItPossible(int arr[],int mid,int hr)
	{
	    int tt=0;
	    for(int i=0;i<arr.length;i++)
	    {
	if(arr[i]<=mid)
	{
	    tt+=1;
	}
	else{
	    if(arr[i]%mid==0)
	    {
	        tt+=arr[i]/mid;
	    }
	    else{
	        tt+=(arr[i]/mid)+1;
	    }
	}
	if(tt>hr)return false;
	    }
	    return true;
	}




}
