package Stack;

import java.util.*;
public class Stockspan {

	 class hlp{
	        int val;
	        int cnt;
	    }
	    Stack<hlp>s=new Stack();
	  
	    public static void main(String args[])
	    {
	    	int arr[]= {100,80,60,70,60,75,85};
	    	Stockspan ss=new Stockspan();
	    	for(int i=0;i<arr.length;i++)
	    	{
	    		int res=ss.next(arr[i]);
	    System.out.println(res);
	    	}
	    }
	    
	    public int next(int price) {
	        int cnt=1;
	        
	        
	            while(!s.isEmpty()&&s.peek().val<=price)
	            {
	                cnt+=s.pop().cnt;
	                
	            }
	        
	        hlp h=new hlp();
	        h.val=price;
	        h.cnt=cnt;
	        s.push(h);
	        return h.cnt;
	    }
	


}
