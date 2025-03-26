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
		sol(arr, 0, 8, 0, 8);
	}

	public static void sol(int arr[][], int cr, int er, int cc, int ec) {

		if(cr==8&&cc==9)
		{
			display(arr);
		return;
		}
		if(cc>ec)
		{
			sol(arr,cr+1,er,0,ec);
			return;
		}
		
		if (arr[cr][cc] != 0) {
			sol(arr, cr, er, cc + 1, ec);
		} else {
			for (int i = 1; i <= 9; i++) {
				if (isPossible(arr, cr, cc, i) == true) {
					arr[cr][cc] = i;
					sol(arr, cr, er, cc + 1, ec);
					arr[cr][cc] = 0;
				}
			}
		}

	}
public static boolean isPossible(int arr[][],int cr,int cc,int val)
{

//	row check;
	for(int col=0;col<9;col++) {
		if(arr[cr][col]==val)return false;
	}
//	col check
	for(int row=0;row<9;row++)
	{
		if(arr[row][cc]==val)return false;
	}
	
	int row=cr%3;
	row=cr-row;
	int col=cc%3;
	col=cc-col;
	for(int sr=row;sr<row+3;sr++)
	{
		for(int sc=col;sc<col+3;sc++)
		{
			if(arr[sr][sc]==val)return false;
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





public ListNode sol(ListNode head,ListNode temp)
{if(temp==null)
{
    return head;
}
    ListNode res=sol(head,temp.next);
    if(res==null)return res;
    if(res==temp)
    {
        res.next=null;
        return null;
    }
    ListNode cur=res.next;
 if(cur==temp)
 {
	 cur.next=null;
	 return null;
 }
    res.next=temp;
    temp.next=cur;

    return cur;
}
}







	