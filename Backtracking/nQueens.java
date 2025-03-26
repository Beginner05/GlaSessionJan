package Backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

public class nQueens {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<ArrayList<String>>mr=new ArrayList();
		int nums[]= {3,2,1};
		String arr[]=new String[nums.length];
		for(int i=0;i<nums.length;i++)
		{
			arr[i]=nums[i]+"";
		}
		Arrays.sort(arr);
		for(String val:arr)
		{
			System.out.print(val+" ");
		}
		sol(arr,0,mr,new ArrayList());
		HashSet<ArrayList<String>>set=new HashSet();
		for(ArrayList<String>val:mr)
		{
			set.add(val);
		}
//		ArrayList<String>l=new ArrayList();/
//		Collections.sort(mr);
		
		
		 System.out.println(mr);
//System.out.println(set);

	}
	public static void sol(String arr[],int idx,ArrayList<ArrayList<String>>mr,ArrayList<String>list)
	{
		if(idx==arr.length)
		{
			ArrayList<String>res=new ArrayList(list);
			mr.add(res);
		
			return ;
		}
	
		list.add(arr[idx]+"");
		sol(arr,idx+1,mr,list);
		list.remove(list.size()-1);
		sol(arr,idx+1,mr,list);
	}
}