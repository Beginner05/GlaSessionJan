package Backtracking;

public class HackerBlocks2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="1025";
	sol(str,"");
	}
	public static void sol(String str,String ans)
	{
		
		if(str.length()==0)
		{
			System.out.println(ans);
			return;
		}
		if(str.charAt(0)=='0')return;
		for(int i=0;i<str.length();i++)
		{
			String temp=str.substring(0,i+1);
			int val=Integer.parseInt(temp);
			if(val>26)return;
			char ch=(char)(val+96);
			sol(str.substring(i+1),ans+ch);
		}
	}

}
