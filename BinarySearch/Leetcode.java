package BinarySearch;

import java.util.*;
public class Leetcode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][]= {{1,4},{2,5},{1,3},{3,4}};
int res[]=sol(4,arr);
for(int val:res)
{
	System.out.print(val+" ");
}
	}
public static int [] sol(int limit,int arr[][])
{
	HashMap<Integer,HashSet<Integer>>color=new HashMap();
	HashMap<Integer,Integer>ball=new HashMap();
	int res[]=new int[arr.length];
	for(int i=0;i<arr.length;i++)
	{
		int b=arr[i][0];
		int c=arr[i][1];
		if(ball.containsKey(b)==false)
		{
			ball.put(b,c);
		}
		else {
			int temp=ball.get(b);
			color.get(temp).remove(b);
			if(color.get(temp).size()==0)color.remove(temp);
		ball.put(b,c);
		}
		if(color.containsKey(c))
		{
			color.get(c).add(b);
		}
		else {
			color.put(c,new HashSet());
			color.get(c).add(b);
		}
		res[i]=color.size();
	}
	return res;
}
}