package Backtracking;

import java.util.ArrayList;

public class GenerateParanthesis {

	public static void main(String args[]) {
int arr[][]=new int[3][3];
sol(arr,0,2,0,2);

}
	public static void sol(int arr[][],int cr,int er,int cc,int ec)
	{
		
	if(cr==er&&cc==ec)return;
	if(cr<0||cc<0||cc>ec||cr>er)return;
	
		sol(arr,cr-1,er,cc,ec);
		sol(arr,cr+1,er,cc,ec);
		sol(arr,cr,er,cc-1,ec);
		sol(arr,cr,er,cc+1,ec);
	}
}