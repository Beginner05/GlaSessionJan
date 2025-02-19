package LinkedList;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.*;

public class Client {

	public static void main(String[] args) {
	int ans=sol(new int[] {18,43,36,13,7});
	System.out.println(ans);
	}
	 public static int sol(int arr[])
	    {
	        HashMap<Integer,ArrayList<Integer>>map=new HashMap();
	    for(int i=0;i<arr.length;i++)
	    {
	        int val=arr[i]%9!=0?arr[i]%9:9;
	        if(map.containsKey(val))
	        {
	if(map.get(val).size()<2)
	{
	    map.get(val).add(i);
	}
	else{
	    if(arr[map.get(val).get(0)]<arr[i]||arr[map.get(val).get(1)]<arr[i])
	    {
	        if(arr[map.get(val).get(0)]>arr[map.get(val).get(1)])
	        {
	map.get(val).set(1,i);
	        }
	        else{
	map.get(val).set(0,i);
	        }
	    }
	}
	        }
	        else{
	            map.put(val,new ArrayList());
	            map.get(val).add(i);
	        }
	    }
	    int sum=0;
	    Set<Integer>keys=map.keySet();
	    for(int key:keys)
	    {
	    	if(map.get(key).size()>1)
	    	{
	    		int ans=arr[map.get(key).get(0)]+arr[map.get(key).get(1)];
	    		sum=Math.max(ans, sum);
	    	}
	    }
	    System.out.println(map);
	    return sum;
	    }

	
}