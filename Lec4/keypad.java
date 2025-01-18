package Lec4;

public class keypad {
    public static String[] map = {"abc","def","ghi"};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
sol("23","",0);
	}
	public static void sol(String str,String ans,int idx)
    {if(str.length()==idx)
    {
        System.out.println(ans);
        return;
    }
    int currChar= str.charAt(idx);
        //char ch=str.charAt(0);
        int c = currChar-'0';
        for(int i=0;i<map[c-2].length();i++)
        {
            sol(str,ans+map[c],idx+1);
        }
    }
}
