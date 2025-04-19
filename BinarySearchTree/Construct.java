package BinarySearchTree;

//import BinaryTree.Construct.node;

class node{
	int val;
	node left;
	node right;
}
public class Construct {
node root;
	Construct(int arr[])
	{
		root=construct(arr,0,arr.length-1);
	}
	public node construct(int arr[],int lo,int hi)
{

if(lo>hi)
{
	return null;
}
if(lo==hi)
{
	node nn=new node();
	nn.val=arr[lo];
	return nn;
}
int mid=(lo+hi)/2;
node nn=new node();
nn.val=arr[mid];
nn.left=construct(arr,lo,mid-1);
nn.right=construct(arr,mid+1,hi);
return nn;
}
	public void display()
	{
		display(root);
	

//	display(root);
}
	
		private void display(node root)
		{
			if(root==null)return;
			String str="";
			if(root.left!=null)
			{
				str+=root.left.val+" <- "+root.val+" -> ";
			}
			else {
				str+="."+" <- "+root.val+" -> ";
			}
			if(root.right!=null)
			{
				str+=root.right.val;
			}
			else {
				str+=".";
			}
			System.out.println(str);
			display(root.left);
			display(root.right);
		}
	}

