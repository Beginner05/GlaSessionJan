package Lec4;

public class AllPath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][]=new int[3][3];
int res=sol(arr,0,arr.length-1,0,arr[0].length-1,"");
	System.out.println(res);
	}
	public static int sol(int arr[][],int cr,int er,int cc,int ec,String ans)
	{
		if(cr==er&&cc==ec)
		{
			System.out.println(ans);
			return 1;
		}
		if(cr>er||cc>ec)return 0;
		int h=sol(arr,cr,er,cc+1,ec,ans+"h ");
		int v=sol(arr,cr+1,er,cc,ec,ans+"v ");
	return h+v;	
	}
}
