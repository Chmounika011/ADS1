package week4;

import java.util.Scanner;

public class Minheap
{
	static void Minheap1(int a[],int s)
	{
		heapify(a,s);
	}
	 static void heapify(int a[],int m) 
	 {
		// int p=a.length;
	//	int []b =new int[p];
		for(int j=0;j<m;j++)
		{
			for(int i=1;i<m;i++)
			{
			//b[i]=a[i];
			//System.out.println("b[i]"+b[i]);
			int par=(i-1)/2;
			//System.out.println("b[par]"+b[par]);
			if(a[par]>a[i])
			{
				int temp=a[par];
				a[par]=a[i];
				a[i]=temp;
				//System.out.println("a[i+1]"+a[i]);
			}
		}
	}
		
}
		static void remove(int []a)
		{
			System.out.println("removed element"+a[0]);
			int temp=a[0];
			a[0]=a[a.length-1];
			a[a.length-1]=temp;
			Minheap1(a,a.length-1);
			
		}
		static void removePosition(int []a,int p)
		{
			for(int i=0;i<a.length;i++)
			{
				if(a[i]==p)
				{
					int temp=a[i];
					a[i]=a[a.length-2];
					a[a.length-2]=temp;
				}
					
			}
		}
		
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number of elements");
		int n=sc.nextInt();
		int []a=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
			Minheap1(a,n);
			System.out.println("*******");
			for(int i=0;i<a.length;i++)
			{
				System.out.println(a[i]);
			}
			remove(a);
			for(int i=0;i<a.length-1;i++)
			{
				System.out.println(a[i]);
			}
			System.out.println("enter the element to remove");
			int p=sc.nextInt();
			removePosition(a,p);
			for(int i=0;i<a.length-2;i++)
			{
				System.out.println(a[i]);
			}
			
	}
}
