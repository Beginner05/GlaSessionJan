package Backtracking;

public class nQueens {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=4;
		int arr[][]=new int[n][n];
sol(arr,0,n-1,0,n-1,n,0,new boolean[n][n],"");
	}
	public static void sol(int arr[][],int cr,int er,int cc,int ec,int tq,int qp,boolean visited[][],String ans)
	{
		if(qp==tq)
		{
			System.out.println(ans);
			return;
		}
		if(tq-qp>arr.length-cr)
		{
			return;
		}
		if(cr>er)return;
		if(cc>ec)
			{
			sol(arr,cr+1,er,0,ec,tq,qp,visited,ans);
			return;
			}
		
		
		if(isItPossible(visited,cr,cc)==true)
		{
			visited[cr][cc]=true;
			sol(arr,cr+1,er,0,ec,tq,qp+1,visited,ans+"{ "+cr+" "+cc+" }");
			visited[cr][cc]=false;
		}
		sol(arr,cr,er,cc+1,ec,tq,qp,visited,ans);

	}
	public static boolean isItPossible(boolean visited[][],int cr,int cc)
	{
		
//		col check
		for(int strt=cr;strt>=0;strt--)
		{
			if(visited[strt][cc]==true)
			{
				return false;
			}
		}
		for(int row=cr,col=cc;row>=0&&col>=0;row--,col--)
		{
			if(visited[row][col]==true)
			{
				return false;
			}
		}
		
		for(int row=cr,col=cc;row>=0&&col<visited.length;row--,col++)
		{
			if(visited[row][col]==true)
			{
				return false;
			}
		}
		return true;
		
	}
}