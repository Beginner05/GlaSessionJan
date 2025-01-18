package Lec4;

public class Rat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[][]= {{1,0,0,0},{1,1,0,1},{0,1,0,0},{0,1,1,1} };
sol(arr,0,0,arr.length-1,arr[0].length-1,"",new boolean[arr.length][arr[0].length]);

	}
public static void sol(int arr[][],int cr,int cc,int er,int ec,String ans,boolean visited[][])
{
if(cr==er&&cc==ec)
{
//	System.out.println("Hello");
	System.out.println(ans);
	return;
}

if(cr<0||cc<0||cr>er||cc>ec||visited[cr][cc]==true)
{
	return;
}
if(arr[cr][cc]==0)
{
	return;
}
visited[cr][cc]=true;
sol(arr,cr-1,cc,er,ec,ans+"U ",visited);
sol(arr,cr+1,cc,er,ec,ans+"D ",visited);
sol(arr,cr,cc-1,er,ec,ans+"L ",visited);
sol(arr,cr,cc+1,er,ec,ans+"R ",visited);
visited[cr][cc]=false;
}
}
