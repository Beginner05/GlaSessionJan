package Lec4;

public class permutation3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
sol("abc","");
	}
	public static void sol(String str,String ans)
	{
		if(str.length()==0)
		{
			System.out.println(ans);
			return;
		}
		
		for(int i=0;i<str.length();i++)
		{
			sol(str.substring(0,i)+str.substring(i+1),ans+str.charAt(i));
		}
		
		
		
	}

}
