//package week1;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number of elements");
		int n=sc.nextInt();
		System.out.println("enter elements");
		int	[] arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("enter a number to search");
		int s=sc.nextInt();
		BinarySearch b=new BinarySearch();
		int r=b.binarysearch(arr, 0, n-1, s);
		System.out.println("index :"+r);
	}

}