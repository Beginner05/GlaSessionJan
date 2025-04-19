package Stack;

public class Temprature {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {1,3,4,2};
System.out.println(sol(arr));
	}

	 public static  boolean sol(int arr[])
	    {
	        int pre[]=new int[arr.length];
	        pre[0]=arr[0];
	        for(int i=1;i<pre.length;i++)
	        {
	            pre[i]=Math.min(pre[i-1],arr[i]);
	        }
	        int j=arr.length-2;
	       // PriorityQueue<Integer>q=new PriorityQueue();
	        Stack<Integer>s=new Stack();
	        s.push(arr[arr.length-1]);
	        while(j>=0)
	        {
	          if(arr[j]!=pre[j]){
	            while(!s.isEmpty()&&s.peek()<=pre[j])
	            {
	                s.pop();
	            }
	            if(!s.isEmpty()&&s.peek()<arr[j])
	            {
	                return true;
	            }
	            s.push(arr[j]);
	          }
	            j--;    
	        }
	        return false;
	    }
	}
