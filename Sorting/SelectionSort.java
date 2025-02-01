package Sorting;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {2,3,4,3,2,1,1,1,0};
sort(arr);
	}
	public static void sort(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			int min=i;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[min]>arr[j])
				{
					min=j;
				}
			}
			int temp=arr[min];
			arr[min]=arr[i];
			arr[i]=temp;
		}
		for(int val:arr)
		{
			System.out.print(val+" ");
		}
	}

}
