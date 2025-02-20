package BinarySearch;

public class FirstBadversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	   public int sol(int n)
	    {
	        int lo=1;
	        int hi=n;
	        int ans=0;
	        while(lo<=hi)
	        {
	            int mid=(lo+hi)/2;
	            System.out.println(mid);
	            // int mid=((hi-lo)/2)+lo;
	            if(isBadVersion(mid)==true)
	            {
	                hi=mid-1;
	                ans=mid;
	                
	            }
	            else{
	                lo=mid+1;
	            }
	        }
	        return ans;
	    }

}
