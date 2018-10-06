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
		String w[]=null;
		String w1[]=null;
		String p=br.readLine();
		String q=br.readLine();
		w=p.split("[,.]");
		w1=q.split("[,.]");
		for(int i=0;i<n;i++)
		{
			//System.out.println(i);
			a[i]=Integer.parseInt(w[i]);
			
		}
		for(int j=0;j<m;j++)
		{
			//System.out.println("b["+j+"]");
			b[j]=Integer.parseInt(w1[j]);
		}
		int i=0,j=0,k=0;
		while(i<a.length&&j<b.length)
		{
			if(a[i]>b[j])
			{
				c[k]=b[j];
				j++;
				k++;
			}
			else
			{
				c[k]=a[i];
				k++;
				i++;
			}
		}
		while(i<a.length)
		{
			c[k]=a[i];
			i++;
			k++;
		}
		while(j<b.length)
		{
			c[k]=b[j];
			k++;
			j++;
		}
	for(k=0;k<c.length;k++)
	{
		if(k<c.length-1)
		{
			System.out.print(c[k]+",");
		}
		else
		{
			System.out.print(c[k]);
		}
	}
	}

}
