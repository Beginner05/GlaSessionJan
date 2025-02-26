package BinarySearch;

public class Check {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ans = sol("IIIDIDDD", 0, '*', "", new int[10]);
		System.out.println(ans);
	}

	public void sol(String str)
    {
        HashMap<Integer,ArrayList<Integer>map=new HashMap();
        int depth=0;
for(int i=0;i<str.length();)
{
while(str.charAt(i)=='-')
{
    depth++;
    i++;
}
if(map.containsKey(depth))
{
map.get(depth).add(str.charAt(i)-'0');
}
else{
map.put(depth,new ArrayList());
map.get(depth).add(str.charAt(i)-'0');
}
depth=0;
i++;
}



    }
}