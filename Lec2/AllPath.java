package Lec2;

public class AllPath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[][]=new int[3][3];
		int ans=sol(arr,0,0,arr.length-1,arr[0].length-1);
	System.out.println(ans);
	}
	public static int sol(int arr[][],int cr,int cc,int er,int ec)
	{
		if(cr==er&&cc==ec)return 1;
		if(cr>er||cc>ec)return 0;
	int hori=sol(arr,cr,cc+1,er,ec);
	int ver=sol(arr,cr+1,cc,er,ec);
	return hori+ver;
	}

}
