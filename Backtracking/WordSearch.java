package Backtracking;

public class WordSearch {

	public static void main(String args[])
	{
		char arr[][]= {{'A','B','C','E'},{'S','F','C','S'},
		{'D','E','E','E'}};
		String str="ABCCED";
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[0].length;j++)
			{
				if(arr[i][j]==str.charAt(0))
				{
					boolean res=sol(arr,i,arr.length-1,j,arr[0].length-1,str,new boolean[arr.length][arr[0].length]);
				if(res==true)
				{
					System.out.println(true);
					return;
				}
				}
			}
		}
		System.out.println(false);
	}

	public static boolean sol(char arr[][], int cr, int er, int cc, int ec, String str, boolean visited[][]) {

		if(str.length()==0)
		{
			return true;
		}
		if(cr<0||cc<0||cr>er||cc>ec||visited[cr][cc]==true)return false;
		if (arr[cr][cc] != str.charAt(0)) {
			return false;
		}
		visited[cr][cc]=true;
		boolean up = sol(arr, cr - 1, er, cc, ec, str.substring(1), visited);
		boolean down = sol(arr, cr + 1, er, cc, ec, str.substring(1), visited);
		boolean right = sol(arr, cr, er, cc + 1, ec, str.substring(1), visited);
		boolean left = sol(arr, cr, er, cc - 1, ec, str.substring(1), visited);
visited[cr][cc]=false;
	return up||down||right||left;
	}
}
