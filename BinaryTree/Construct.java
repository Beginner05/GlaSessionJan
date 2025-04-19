package BinaryTree;
import java.util.*;
public class Construct {


	class node{
		int val;
		node left;
		node right=null;
	}
	node root=null;
Scanner scn=new Scanner(System.in);
public Construct()
{
	root=construct(null,false);
}
public node construct(node root,boolean flag)
{
	if(root==null)
	{
		System.out.println("enter the value for root node");
	}
	else {
		if(flag==false)
		{
			System.out.println("enter the value for left child of  "+root.val);
		}
		else {
			System.out.println("enter the value for right child of "+root.val);
		}
	}
	node nn=new node();
	nn.val=scn.nextInt();
	System.out.println(nn.val+"has left child?");
boolean lc=scn.nextBoolean();
if(lc==true)
{
	nn.left=construct(nn,false);
}
System.out.println(nn.val+"has right child?");
boolean rc=scn.nextBoolean();
if(rc==true)
{
	nn.right=construct(nn,true);
}
return nn;
}


public void levelorder()
{
	levelorder(root);
}
private void levelorder(node root)
{
	
	
	LinkedList<node>q=new LinkedList();
	q.addLast(root);
	q.addLast(null);
	while(!q.isEmpty())
	{
		node temp=q.removeFirst();
		if(temp==null)
		{
			System.out.println();
			if(q.isEmpty())break;
			q.addLast(null);
			continue;
		}
		System.out.print(temp.val);
		if(temp.left!=null)
		{
			q.addLast(temp.left);
		}
		if(temp.right!=null)
		{
			q.addLast(temp.right);
		}
	}
		
}

public void preOrder()
{
	preOrder(root);
}
public void preOrder(node root)
{
	if(root==null)return;
	System.out.print(root.val+" ");
	preOrder(root.left);
	preOrder(root.right);
	
	
	
}
public void inorder()
{
	inorder(root);
}
private void inorder(node root)
{
	if(root==null)return;
	
	inorder(root.left);
	System.out.print(root.val+" ");
	inorder(root.right);
	
}
public void postorder()
{
	postorder(root);
}
private void postorder(node root)
{
	if(root==null)return;
	
	postorder(root.left);
	
	postorder(root.right);
	System.out.print(root.val+" ");
}


public node intree(int pre[],int in[],int plo,int phi,int ilo,int ihi)
{
	if(plo>phi||ilo>ihi)return null;
	node nn=new node();
	nn.val=pre[plo];
	int cnt=0;
	int i=0;
	for( i=ilo;i<=ihi;i++)
	{
		if(pre[plo]==in[i])
		{
			break;
		}
		cnt++;
	}
	nn.left=intree(pre,in,plo+1,plo+cnt,ilo,i-1);
	nn.right=intree(pre,in,plo+cnt+1,phi,cnt+1,ihi);
return nn;
}
public int height()
{
	return height(root);
}
private int height(TreeNode root)
{
	if(root==null)return -1;
	int l=height(root.left);
	int r=height(root.right);
	return Math.max(l, r)+1;
}
public int size()
{
	return size(root);
}
private int size(TreeNode root)
{
	if(root==null)return 0;
	int l=size(root.left);
	int r=size(root.right);
	return l+ r+1;
}
public int find(int val)
{
	return find(root,val);
}
private boolean find(TreeNode root,int val)
{
	
	if(root==null)return false;
	if(root.val==trgt)return true;
	int l=height(root.left,val);
	if(l)return true;
	int r=height(root.right,val);
	return  l||r;
}
public int diameter()
{
	return diameter(root);
}
class pair{
    int ht=-1;
    int dia=0;
}
public int diameterOfBinaryTree(TreeNode root) {

    return sol(root).dia;
}
public pair sol(TreeNode root)
{
 if(root==null)
 {
     return new pair();
 }
  pair left=  sol(root.left);
   pair right= sol(root.right);
int sd=left.ht+right.ht+2;
    pair p=new pair();
    p.ht=Math.max(left.ht,right.ht)+1;
    p.dia=Math.max(left.dia,Math.max(right.dia,sd));
    return p;
}

}

