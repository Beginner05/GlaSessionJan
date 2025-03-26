package Stack;

import java.util.*;
public class NextGreater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {9,8,7,6,10};
sol(arr);
	}
	public static void sol(int arr[])
	{
		Stack<Integer>s=new Stack();
		for(int i=0;i<arr.length;i++)
		{
	while(s.isEmpty()==false&&arr[s.peek()]<arr[i])
	{
		arr[s.pop()]=arr[i];
	}
			s.push(i);
		}
		while(!s.isEmpty())
		{
			arr[s.pop()]=-1;
		}
		for(int val:arr)
		{
			System.out.print(val+" ");
		}
		
		
		
		
	}

}
