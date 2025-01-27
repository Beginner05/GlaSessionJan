package Backtracking;

public class Suduko {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][] = new int[9][9];
		arr[0][0] = 5;
		arr[0][1] = 3;
		arr[0][4] = 7;
		arr[1][0] = 6;
		arr[1][3] = 1;
		arr[1][4] = 9;
		arr[1][5] = 5;
		arr[2][1] = 9;
		arr[2][2] = 8;

		arr[2][7] = 6;
		arr[3][0] = 8;
		arr[3][4] = 6;
		arr[3][8] = 3;
		arr[4][0] = 4;
		arr[4][3] = 8;

		arr[4][5] = 3;
		arr[4][8] = 1;
		arr[5][0] = 7;
		arr[5][4] = 2;
		arr[5][8] = 6;
		arr[6][1] = 6;
		arr[6][6] = 2;
		arr[6][7] = 8;
		arr[7][3] = 4;
		arr[7][4] = 1;
		arr[7][5] = 9;
		arr[7][8] = 5;
		arr[8][4] = 8;
		arr[8][7] = 7;
		arr[8][8] = 9;
		sol(arr, 0, 8, 0, 9);
		

	}

	public static void sol(int arr[][],int cr,int er,int cc,int ec)
	{
		if(cr==er&&cc==ec)
		{
			display(arr);
			return;
		}
		
		if(cc>=ec)
		{
			sol(arr,cr+1,er,0,ec);
		return;
		}
	
		

	if(arr[cr][cc]!=0)
	{
		sol(arr, cr, er, cc + 1, ec);
	}else
	{
		for (int i = 1; i <= 9; i++) {
			if (isItPossible(arr, cr, cc, i) == true) {
				arr[cr][cc] = i;
				sol(arr, cr, er, cc + 1, ec);
				arr[cr][cc]=0;
			}
		}
	}

}
	public static boolean isItPossible(int arr[][],int cr,int cc,int val)
	{
		
		
//		row check
		for(int strt=0;strt<9;strt++)
		{
			if(arr[cr][strt]==val)
			{
				return false;
			}
		}
//		col check
		for(int i=0;i<9;i++)
		{
			if(arr[i][cc]==val)
			{
				return false;
			}
		}
	
		int sr=(cr/3)*3;
		int sc=(cc/3)*3;
		for(int row=sr;row<sr+3;row++)
		{
		
			for(int col=sc;col<sc+3;col++)
			{
				if(arr[row][col]==val)
				{
					return false;
				}
			}
		}
		return true;
		
	}

	public static void display(int arr[][])
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}
	
	
	
	
	