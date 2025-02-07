package LinkedList;

public class Construct {
	class node {
		int val;
		node next;
	}

	int size = 0;
	node head = null;
	node tail = null;

	public void addFirst(int val) {

		node nn = new node();
		nn.val = val;
		if (head == null) {
			head = nn;
			tail = nn;
		} else {
			nn.next = head;
			head = nn;
		}
		size++;

	}
	public void addLast(int val)
	{
		
		
		node nn=new node();
		nn.val=val;
		if(head==null)
		{
			head=nn;
			tail=nn;
		}
		
		
		else {
			tail.next=nn;
			tail=nn;
		}
		size++;	
	}
	public void removeFirst()
	{
		if(head==null)
		{
			return;
		}
		head=head.next;
		size--;
	}
	
	public void removeLast()
	{
		if(head==tail)
		{
			head=null;
			size--;
			return;
		}
		node temp=head;
		while(temp.next.next!=null)
		{
			temp=temp.next;
			
		}
		temp.next=null;
		tail=temp;
	size--;
	}
	public void display()
	{
		node temp=head;
		
		while(temp!=null)
		{
			System.out.print(temp.val+" ");
			temp=temp.next;
		}
		
	}
	public  void addAt(int idx,int val)
	{
		if(idx==0)
		{
			addFirst(val);
			return;
		}
		if(idx==size) {
			addLast(val);
			return;
		}
		if(idx<0||idx>size)
		{
			return;
		}
		
		int i=0;
		node temp=head;
		while(i<idx-1)
		{
		temp=temp.next;
		i++;
		}
		node nn=new node();
		nn.val=val;
		nn.next=temp.next;
		temp.next=nn;
		size++;

	}
	
public void removeAt(int idx)
{
	if(idx==0)
	{
		removeFirst();
		return;
	}
	if(idx==size-1)
	{
		removeLast();
		return;
	}
	if(idx<0||idx>=size)
	{
		return;
	}
	node temp=head;
	int i=0;
	while(i<idx-1)
	{
		temp=temp.next;
		i++;
	}
	temp.next=temp.next.next;
	size--;
}
	
	
	
	
	
	
	
	
}
