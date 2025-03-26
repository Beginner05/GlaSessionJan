package BinarySearch;

import java.util.*;
public class Leetcode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(sol("((()()))"));
}
    public static String sol(String str)
    {
    	LinkedList<Character>list=new LinkedList();
        Stack<Character>s=new Stack();
//        StringBuilder sb=new StringBuilder();
 boolean flag=false;
        for(int i=0;i<str.length();i++)
        {
if(str.charAt(i)==')')
{
if(s.size()==1)
{
    s.pop();

}
else{
    s.pop();
    if(flag) {
    	list.addLast('(');
    	list.addLast(')');
}
    else if(!flag)
    {
    	list.addFirst('(');
    	list.addLast(')');
    }
    if(s.size()==1)
    {
    	flag=true;
    }
    else {
    	flag=false;
    }
}
}
else{
    s.push('(');
}
        }
//        System.out.println(list);
        StringBuilder sb=new StringBuilder();
        while(!list.isEmpty())
        {
        	sb.append(list.removeFirst());
        }
        return new String(sb);
    }
}
