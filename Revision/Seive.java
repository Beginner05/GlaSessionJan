package Revision;
import java.util.*;
public class Seive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scn=new Scanner(System.in);
	int n=scn.nextInt();
check(n);
//	System.out.println(res);
	}
	public static void check(int n)
	{
		boolean arr[]=new boolean[n+1];
for(int i=2;i*i<=n;i++)
{
	if(arr[i]==true)continue;
	for(int jump=2;jump*i<=n;jump++)
	{
		arr[jump*i]=true;
	}
}
for(int i=0;i<arr.length;i++)
{
	if(arr[i]==false)
		{
	System.out.println(i);	
		}
}
	}
	
	
	
//	public static boolean check(int n)
//	{
//		if(n==0||n==1)return false;
//		for(int i=2;i*i<=n;i++)
//		{
//			if(n%i==0)return false;
//		}
//		return true;
//	}
//	

}
