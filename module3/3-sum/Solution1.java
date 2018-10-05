package week1;

import java.util.Scanner;

public class Solution1 {

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
		TripleSum t=new TripleSum ();
		t.Triple(arr,n);

	}

}
