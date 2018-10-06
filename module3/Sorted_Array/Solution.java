//package week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Solution {

	public static void main(String[] args) throws IOException
	{
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		//System.out.println("enter number of elements in array1");
		int[] a=null;
		int[] b=null;
		int[] c;
		int n;
		String s1=br.readLine();
		n=Integer.parseInt(s1);
		//System.out.println("enter number of elements in array2");
		int m;
		String s=br.readLine();
		m=Integer.parseInt(s);
		//System.out.println("enter elements");
		a=new int[n];
		b=new int[m];
		c=new int[n+m];
		for(int i=0;i<n;i++)
		{
			//System.out.println(i);
			a[i]=br.read();
			
		}
		for(int j=0;j<m;j++)
		{
			//System.out.println("b["+j+"]");
			b[j]=br.read();
		}
		SortedArray s2=new SortedArray();
		s2.Sorted(a, b, c);
	}

}
