package Backtracking;

public class nQueens {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][] = new int[4][4];
int n=4;
		sol(arr, 0, n - 1, 0, n - 1, 0, n, new boolean[n][n],"");
	}

	public static void sol(int arr[][], int cr, int er, int cc, int ec, int qp, int tq, boolean visited[][],String ans) {
		if (qp == tq) {
			System.out.println(ans);
			return;
		}
		if(tq-qp>arr.length-cr)return;
		if (cc > ec) {
			sol(arr, cr + 1, er, 0, ec, qp, tq, visited,ans);
			return;
		}
		if (cr > er) {
			return;
		}
		if (isItPossible(cr, cc, visited) == true) {
			visited[cr][cc] = true;
			sol(arr, cr + 1, er, 0, ec, qp + 1, tq, visited,ans+"{ "+cr+" "+cc+" }");
			visited[cr][cc] = false;
		}
		sol(arr, cr, er, cc + 1, ec, qp, tq, visited,ans);

	}
	public static boolean isItPossible(int cr,int cc,boolean visited[][])
	{
//		rowCheck
		for(int strt=cr;strt>=0;strt--)
		{
			if(visited[strt][cc]==true)
			{
				return false;
			}
		}
//		DiagonalRight
		for(int sr=cr,sc=cc;sc<visited.length&&sr>=0;sr--,sc++)
		{
			if(visited[sr][sc]==true)
			{
				return false;
			}
		}
		for(int sr=cr,sc=cc;sr>=0&&sc>=0;sc--,sr--)
		{
			if(visited[sr][sc]==true)
			{
				return false;
			}
		}
		return true;
		
		
		
		
		
		
		
		
		
		
	}

}
