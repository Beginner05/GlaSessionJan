package Backtracking;

public class AllPath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[][]=new int[3][3];
sol(arr,0,arr.length-1,0,arr[0].length-1,"");
	}
	public static void sol(int arr[][],int cr,int er,int cc,int ec,String ans)
	{
		if(cr==er&&cc==ec)
		{
			System.out.println(ans);
			return;
		}
		if(cr>er||cc>ec)return;
		sol(arr,cr,er,cc+1,ec,ans+"H");
		sol(arr,cr+1,er,cc,ec,ans+"V");
	}
}