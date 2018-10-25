package week3;

import java.util.Scanner;


public class MergeSort {
	static void Merge(int a[],int left,int mid,int right)
	{
		int l1=mid-left+1;
		int r1=right-mid;
		int []l=new int[l1];
		int []r=new int[r1];
		
		
		for(int i=0;i<l1;i++)
			l[i]=a[left+i];
		for(int j=0;j<r1;j++)
			r[j]=a[mid+1+j];
		int i=0,j=0,k=left;
		while(i<l1&&j<r1)
		{
			if(l[i]<=r[j])
			{
				//System.out.println("----------"+l[i]);
				a[k]=l[i];
				i++;
			}
			else
			{
				a[k]=r[j];
				j++;
			}
			k++;
		}
		while(i<l1)
		{
			a[k]=l[i];
			i++;
			k++;
		}
		while(j<r1)
		{
			a[k]=r[j];
			j++;
			k++;
		}
		
	}
	static void Sort(int a[],int l,int r)
	{
			if(l<r)
			{
		
			int mid=(l+r)/2;
			 Sort(a, l, mid); 
	         Sort(a, mid+1, r); 
	            Merge(a, l, mid, r); 
			}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter elements");
		int n=6;
		int []a = new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		
		Sort(a, 0, a.length-1);
		for(int i=0;i<n;i++)
		{
			System.out.println(a[i]+"");
			//System.out.println();
		}
		
	}

}
