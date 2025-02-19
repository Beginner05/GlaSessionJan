package BinarySearch;

public class Find {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	sol("IDID","","" ,new int[10],0);
	}
	public static void sol(String str,String ans,String prev,int arr[],int num)
	{
		if(str.length()==0)
		{
			System.out.println(ans);
			return;
		}
		
			if(prev==null)
			{
				for(int i=1;i<10;i++)
				{
				arr[i]=i;
			sol(str.substring(1),ans+i,str.charAt(0)+"",arr,i);
			arr[i]=0;
		}
			}
			else {
				if(prev=="D")
				{
					for(int i=1;i<10;i++)
					{
						if(i<num&&arr[i]==0)
						{
							arr[i]=i;
							sol(str.substring(1),ans+i,str.charAt(0)+"",arr,i);
							arr[i]=0;
						}
					}
				}
				else {
					for(int i=1;i<10;i++)
					{
			if(i>num&&arr[i]==0)
			{
				arr[i]=i;
				sol(str.substring(1),ans+i,str.charAt(0)+"",arr,i);
				arr[i]=0;
			}
					}
				}
			}
	}
}