package Stack;

public class Pattern132 {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,32,4};
		// TODO Auto-generated method stub
//System.out.println(sol(arr));
	sol(arr);
	}
	public static void sol(int arr[])
    {
        Stack<Integer>s=new Stack();
        for(int i=0;i<arr.length;i++)
        {
            while(!s.isEmpty()&&arr[i]>arr[s.peek()])
            {
                int idx=s.pop();
                int diff=i-idx;
                arr[idx]=diff;
            }
            s.push(i);
        }
        while(!s.isEmpty())
        {
            arr[s.pop()]=0;
        }
        
        
    }
}
