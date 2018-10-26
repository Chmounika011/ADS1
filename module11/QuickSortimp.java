package week3;

import java.util.Scanner;

public class QuickSortimp {
	public static int 	Quick(int a[],int l,int h)
	{
		//System.out.println(l);
		int i=l+1;
		int j=h;
		int p=a[l];
		//System.out.println("in quick"+p);
		while(true)
		{
			while(i<=h && a[i]<p)
			{
				i++;
			}
			while(j>=0 && a[j]>p)
			{
				j--;
			}
			 if(i<j)
			{
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				i++;
				j--;
			}
			else
				break;
		}
		return i;
	}
	
	static void par(int a[],int l,int h)
	{
		
		if(l<h)
		{
			
			int pi=Quick(a,l,h);
			//System.out.println("//////"+pi);
			
			int temp=a[pi-1];
			a[pi-1]=a[l];
			a[l]=temp;
			
			par(a,l,pi-2);
			par(a,pi,h);
			
		}
	}
		
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=6;
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		par(a,0,a.length-1);
		for(int i=0;i<n;i++)
		{
			System.out.println(a[i]);
		}
	}

}
