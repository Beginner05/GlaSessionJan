package Sorting;

public class Bubble_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int arr[]={1,3,2,4,2,65,0};
	sort(arr);
	}
	public static void sort(int arr[])
	{
		for(int i=0;i<arr.length-1;i++)
		{
			boolean flag=true;
			for(int j=0;j<arr.length-i-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					flag=false;
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
			if(flag)break;
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
}
