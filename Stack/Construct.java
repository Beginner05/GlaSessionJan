package Stack;

public class Construct {

	int arr[]=new int[5];
	int tos=-1;
	int size=0;
	public void push(int val)
	{
		if(size==arr.length)
		{
	int res[]=new int[arr.length*2];
		for(int i=0;i<arr.length;i++)
		{
			res[i]=arr[i];
		}
		arr=res;
		}
		tos++;
		arr[tos]=val;
		size++;
	}
	public int peek()
	{
		if(tos==-1)
		{
			System.out.println("EMpty h");
		return -1;	
		}
		return arr[tos];
	}
	public void pop()
	{
		if(tos==-1)
		{
			System.out.println("Khali h");
			return;
		}
		arr[tos]=0;
		tos--;
		size--;
	}
	public void display()
	{
		for(int strt=tos;strt>=0;strt--)
		{
			System.out.println(arr[strt]);
		}
	}
	
	
	}
