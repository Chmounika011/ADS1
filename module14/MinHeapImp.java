package week4;

import java.util.Arrays;
import java.util.Scanner;

public class MinHeapImp {
	static void display(int []a,int m)
	{
		for(int k=0;k<a.length;k++)
		{
			System.out.println("display"+a[k]);
		}
	}
	static void Minh(int []a,int m)
	{
	
		int count=0;
		
		for(int i=0;i<m;i++)
		{
			
			count++;
			//System.out.println("//////"+i);
			int n=(count)%2;
			Sort(a,m);
			//display(a,m);
			System.out.println(a[i]);
			if(n%2==0)
			{
				
				float n1=(a[i-1]+a[i])/2;
				System.out.println(n1);
			}
			else
			{
				
				//System.out.println("%%%"+a[i]);
				float b1=a[i];
				System.out.println(b1);
			}
		}
		
	}
	static void Sort(int a[],int m)
	{
		for(int i=1;i<m;i++)
		{
			int value=a[i];
			int k=i;
			while(k>0&&a[k-1]>value)
			{
				a[k]=a[k-1];
				k--;
			}
			a[k]=value;
		}
	}
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int []a=new int [n];
		int l=0;
		for(int i=0;i<n;i++)
		{
			l=i+1;
			a[i]=sc.nextInt();
			Minh(a,l);
		}
	
		
	}

}
