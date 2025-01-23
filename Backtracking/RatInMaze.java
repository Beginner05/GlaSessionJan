package Backtracking;

public class RatInMaze {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//1 empty
//		0block
		int arr[][]= {{1,0,0,0},{1,1,0,1},{1,1,0,0},{0,1,1,1}};
	sol(arr,0,arr.length-1,0,arr[0].length-1,new boolean[4][4],"");
	}
	public static void sol(int arr[][],int cr,int er,int cc,int ec,boolean visited[][],String ans)
	{
		
		if(cr==er&&cc==ec&&arr[cr][cc]!=0)
		{
			System.out.println(ans);
			return;
		}
		if(cr<0||cc<0||cc>ec||cr>er||visited[cr][cc]==true)
		{
			return ;
		}
		if(arr[cr][cc]==0)
		{
			return;
		}
		if(arr[cr][cc]==0)
		{
			return;
		}
		visited[cr][cc]=true;
//		udlr
		sol(arr,cr-1,er,cc,ec,visited,ans+"U ");
		sol(arr,cr+1,er,cc,ec,visited,ans+"D ");
		sol(arr,cr,er,cc-1,ec,visited,ans+"L ");
		sol(arr,cr,er,cc+1,ec,visited,ans+"R ");
		visited[cr][cc]=false;
	}

}
