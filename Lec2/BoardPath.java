package Lec2;

import java.util.Scanner;

public class BoardPath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int dest=scn.nextInt();
		int dice=scn.nextInt();
int ans=sol(0,dest,dice);
	System.out.println(ans);
	}
	public static int sol(int src,int dest,int dice)
	{
		if(dest==src)return 1;
		if(dest<src)return 0;
		int tc=0;
		for(int jump=1;jump<=dice;jump++)
		{
			tc+=sol(src+jump,dest,dice);
		}
		return tc;
	}

}
