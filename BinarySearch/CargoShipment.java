package BinarySearch;

public class CargoShipment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	   public int sol(int arr[],int days)
	    {
	        int lo=1;
	        int hi=0;
	        for(int i=0;i<arr.length;i++)
	        {
	            hi+=arr[i];
	        }
	        int ans=0;
	        while(lo<=hi)
	        {
	            int mid=(lo+hi)/2;
	            if(isItPossible(arr,mid,days)==true)
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
	   public boolean isItPossible(int weight[],int days,int mid)
	    {
	        int day=1;
	        int capacity=mid;
	        
	        for(int i=0;i<weight.length;)
	        {
	            
	            
	            if(capacity>=weight[i])
	            {
	                capacity=capacity-weight[i];
	            i++;
	            }
	            else{
	                day=day+1;
	                capacity=mid;
	            }
	            if(day>days)
	            {
	                return false;
	            }
	            
	            
	        }
	        return true;
	    }
}
