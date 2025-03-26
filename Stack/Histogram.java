package Stack;
import java.util.*;
public class Histogram {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {1,2,3,5,6,5};
sol(arr);
	}

	 public static int sol(int arr[])
	    {
	        int left[]=new int[arr.length];
	        int right[]=new int[arr.length];
	        Stack<Integer>s=new Stack();
	        for(int i=0;i<arr.length;i++)
	        {
	            while(!s.isEmpty()&&arr[i]<arr[s.peek()])
	            {
	                right[s.pop()]=i;
	            }
	            s.push(i);
	        }
	        while(!s.isEmpty())
	        {
	            right[s.pop()]=-1;
	        }
	        for(int i=arr.length-1;i>=0;i--)
	        {
	            while(!s.isEmpty()&&arr[i]<arr[s.peek()])
	            {
	                left[s.pop()]=i;
	            }
	            s.push(i);
	        }
	        while(!s.isEmpty())
	        {
	            left[s.pop()]=-1;
	        }
	        int ans=0;
	        for(int i=0;i<arr.length;i++)
	        {
	            int l=left[i];
	            int r=right[i];
	            if(l==-1&&r==-1)
	            {
	                ans=Math.max(ans,arr[i]*arr.length);
	            }
	            else if(l==-1||r==-1)
	            {
	                
	                if(l==-1)
	                {
	                    //if(i==0)l=1;
	                    r=((r-i)+i)*arr[i];
	                    ans=Math.max(r,ans);
	                }
	                else{
	                    
	                    l=((i-l)+arr.length-i-1)*arr[i];
	                    ans=Math.max(l,ans);
	                }
	            }
	            else{
	                l=i-l;
	                r=r-i;
	                int ta=(l+r-1)*arr[i];
	                ans=Math.max(ans,ta);
	            }
	           // System.out.println(ans);
	        }
	        return ans;
	    }
}
	