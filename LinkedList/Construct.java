package LinkedList;

public class Construct {

	class node{
		int val;
		node next;
		
	}
	node head;
	node tail=null;
	int size=0;
	
	public void addFirst(int val)
	{
		node nn=new node();
//		nn=1k;
		nn.val=val;
		if(head==null)
		{
			head=nn;
			tail=nn;
		}
		else {
			nn.next=head;
			head=nn;
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
		if(head==null)return;
		head=head.next;
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
	public void removeLast()
	{
		if(head==null||head==tail)
		{
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

public void sol()
{
	node nhead=sol(head);
	node temp=nhead;
	while(temp!=null)
	{
		System.out.println(temp.val);
		temp=temp.next;
	}
	
}
	private node sol(node head) {
		node oh = null;
		node eh = null;
		node et = null;
		node ot = null;
		node temp = head;
		int idx = 1;
		while (temp != null) {
			if (idx % 2 == 0) {
				node nn = new node();
				nn.val = temp.val;
				if (eh == null) {
					eh = nn;
					et = nn;
				} else {
					et.next = nn;
					et = nn;
				}
//even
			} else {
				// odd
				node nn = new node();
				nn.val = temp.val;
				if (oh == null) {
					oh = nn;
					ot = nn;
				} else {
					ot.next = nn;
					ot = nn;
				}
			}
			temp = temp.next;
			idx++;
		}
		ot.next=eh;
		return oh;
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
			i++;
			temp=temp.next;
		}
		temp.next=temp.next.next;
		size--;
		
	}
public void addAt(int idx,int val)
{
if(idx==0)
{
	addFirst(val);
	return;
}
if(idx==size)
{
	addLast(val);
	return;
}
if(idx<0||idx>size)
	return;

node nn=new node();
nn.val=val;
int strt=0;
node temp=head;
while(strt<idx-1)
{
	strt++;
	temp=temp.next;
}
node next=temp.next;
temp.next=nn;
nn.next=next;
size++;



}

//public ListNode sol(ListNode head)
//{
//    ListNode oh=null;
//    ListNode eh=null;
//    ListNode et=null;
//    ListNode ot=null;
//    int idx=1;
//    ListNode temp=head;
//    while(temp!=null)
//    {
//        if(idx%2==0)
//        {
////even
//ListNode nn=new ListNode();
//nn.val=temp.val;
//if(eh==null)
//{
//eh=nn;
//et=nn;
//
//}
//else{
//et.next=nn;
//et=nn;
//}
//        }
//        else{
////odd
//ListNode nn=new ListNode();
//nn.val=temp.val;
//if(oh==null)
//{
//oh=nn;
//ot=nn;
//}
//else{
//ot.next=nn;
//ot=nn;
//}
//        }
//        temp=temp.next;
//        idx=idx+1;
//    }
//    ot.next=eh;
//    return oh;
//}
//
//}
//
//
//
//public void sol(ListNode head)
//{
//	
//ListNode cur=head;
//ListNode next=head.next;
//while(cur!=null&&next!=null)
//{
//	int temp=cur.val;
//	cur.val=next.val;
//	next.val=temp;
//	cur=cur.next;
//	next=next.next;
//	if(next==null)return;
//	if(cur==null)return;
//	cur=cur.next;
//	next=next.next;
//}
//
//
//
//
//
public node sol(node head)
{
    node oh=null;
    node eh=null;
    node et=null;
    node ot=null;
    int idx=1;
    node temp=head;
    while(temp!=null)
    {
        if(idx%2==0)
        {
//even
node nn=new node();
nn.val=temp.val;
if(eh==null)
{
eh=nn;
et=nn;

}
else{
et.next=nn;
et=nn;
}
        }
        else{
//odd
node nn=new node();
nn.val=temp.val;
if(oh==null)
{
oh=nn;
ot=nn;
}
else{
ot.next=nn;
ot=nn;
}
        }
        temp=temp.next;
        idx=idx+1;
    }
    ot.next=eh;
    return oh;
}
public ListNode sol(ListNode l1,ListNode l2)
{
	ListNode head=null;
	ListNode tail=null;
	int carry=0;
	while(l1!=null&&l2!=null)
	{
		int sum=l1.val+l2.val+carry;
		int val=sum%10;
		carry=sum/10;
		ListNode nn=new ListNode();
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
		l1=l1.next;
		l2=l2.next;
		
	}
	while(l2!=null)
	{
		int sum=l2.val+carry;
		int val=sum%10;
		carry=sum/10;
		ListNode nn=new ListNode();
		nn.val=val;
		tail.next=nn;
		tail=nn;
l2=l2.next;
	}
	while(l1!=null)
	{
		int sum=l1.val+carry;
		int val=sum%10;
		carry=sum/10;
		ListNode nn=new ListNode();
		nn.val=val;
		tail.next=nn;
		tail=nn;
l1=l1.next;
	}
	if(carry!=0)
	{
		ListNode nn=new ListNode();
		nn.val=carry;
		tail.next=nn;
		tail=nn;
	}
	return head;
}
public ListNode sol(ListNode head)
{ListNode strt=head;
    Stack<ListNode>s=new Stack();
    ListNode temp=head;
    while(temp!=null)
    {
        s.push(temp);
        temp=temp.next;
    }
    int cnt=0;
    int size=s.size();
    while(cnt<size/2)
    {
         temp=s.pop();
        int val=temp.val;
        temp.val=head.val;
        head.val=val;
        cnt++;
        head=head.next;
    }
    return strt;
}
public ListNode sol(ListNode head)
{
    ListNode slow=head;
    ListNode fast=head;
while(fast!=null&&fast.next!=null)
{
    slow=slow.next;
    fast=fast.next.next;
    
}
    return slow;
}
}

