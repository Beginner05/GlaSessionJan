package Stack;

import java.util.*;

public class NextGreater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 8, 5, 13, 7, 19 };
		sol(arr);
	}
	public static void sol(int arr[])
	{
		
		Stack<Integer>s=new Stack();
		for(int i=0;i<arr.length;i++)
		{
			while(!s.isEmpty()&&arr[s.peek()]<arr[i])
			{
				arr[s.pop()]=arr[i];
			}
			s.push(i);
		}
		
		while(!s.isEmpty())
		{
			arr[s.pop()]=-1;
		}
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
		
	}

}
