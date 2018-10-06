//package week1;

import java.util.Scanner;

public class Solution2 {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number of elements in array1");
		int n=sc.nextInt();
		System.out.println("enter number of elements in array2");
		int m=sc.nextInt();
		System.out.println("enter elements");
		int [] a=new int[n];
		int []b=new int[m];
		int []c=new int[n+m];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<m;i++)
		{
			b[i]=sc.nextInt();
		}
		SortedArray s=new SortedArray();
		s.Sorted(a, b, c);
	}

}
