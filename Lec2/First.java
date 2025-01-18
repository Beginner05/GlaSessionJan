package Lec2;

public class First {

	public static void main(String args[])
	{
		int a=10;
		int res=sol();
		System.out.println(res);
	}
	public static int sol()
	{
		int a=20;
		int b=30;
		System.out.println(a+b);
		int res=sol2(100);
	return res;
	}
	public static int sol2(int val)
	{
		System.out.println(val);
		return val+20;
	}
	
}
