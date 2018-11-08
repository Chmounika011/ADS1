package week5;

import java.util.Scanner;

class Node
{
	Node left,right;
	int data;
	Node(int data)
	{
		left=null;
		right=null;
		this.data=data;
	}
}
class Bst1
{
	Node root;
	Bst1()
	{
		root=null;
	}
	void insert(int data)
	{
		root=insert(root,data);
	}
	Node insert(Node node1,int data)
	{
		if(node1==null)
		{
			node1=new Node(data);
		}
		else
		{
			if(data<=node1.data)
				node1.left=insert(node1.left,data);
			else
			node1.right=insert(node1.right,data);
		}
		return node1;
	}
	public void delete(int data)
	{
		root=delete(root,data);
	}
	Node delete(Node root, int data)
	{
		if(root==null)
			return null;
		if(data<root.data)
		{
			root.left=delete(root.left,data);
		}
		else if(data>root.data)
		{
			root.right=delete(root.right,data);
		}
		else
		{
			if(root.right==null)
			{
				return root.left;
			}
			if(root.left==null)
			{
				return root.right;
			}
			root.data=min(root.right);
			root.right=delete(root.right,root.data);
		}
		
		return root;
	}
	public int min(Node root)
	{
		int min=root.data;
		if(root.left!=null)
		{
		 min=root.left.data;
			return min;
		}
		return min;
	}
	 void inorder()
     {
         inorder(root);
     }
     void inorder(Node r)
     {
         if (r != null)
         {
             inorder(r.left);
             System.out.print(r.data +" ");
             inorder(r.right);
         }
     }
     
}
public class BSTDouble {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Bst1 b=new Bst1();
		b.insert(5);
		b.insert(8);
		b.insert(2);
		b.insert(1);
		b.insert(4);
		b.inorder();
		b.delete(5);
		System.out.println("\nafter deletion ");
		b.inorder();
		b.delete(2);
		System.out.println("\n after deletion");
		b.inorder();
		
	}

}
