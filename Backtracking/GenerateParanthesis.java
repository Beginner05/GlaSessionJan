package Backtracking;

public class GenerateParanthesis {

	public static void main(String[] args) {
	
		int n=4;
		sol(n*2,0,0,"");
		
	}
	public static void sol(int n,int ob,int cb,String ans)
	{
		if(ob>n/2)return;
		if(ob+cb==n)
		{
			System.out.println(ans);
			return;
		}
		if(cb>ob)return;
		
		sol(n,ob+1,cb,ans+"(");
		sol(n,ob,cb+1,ans+")");
		
		
	}
}