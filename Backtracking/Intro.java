package Backtracking;
import java.util.*;
public class Intro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[][]=new int[3][3];

sol(arr,0,arr.length-1,0,arr[0].length-1,new boolean[3][3],"");
	}
	public static void sol(int arr[][],int cr,int er,int cc,int ec,boolean visited[][],String ans)
	{
		if(cr==er&&cc==ec)
		{
	System.out.println(ans);		
			return;
	}
		if(cr<0||cc<0||cr>er||cc>ec||visited[cr][cc]==true)
		{
			return;
		}
//		udlr
		visited[cr][cc]=true;
		sol(arr,cr-1,er,cc,ec,visited,ans+"U ");
		sol(arr,cr+1,er,cc,ec,visited,ans+"D ");
		sol(arr,cr,er,cc-1,ec,visited,ans+"L ");
		sol(arr,cr,er,cc+1,ec,visited,ans+"R ");
		visited[cr][cc]=false;
	}

}
