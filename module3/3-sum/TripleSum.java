package week1;

import java.util.Arrays;

public class TripleSum 
{
	int p,q;
	public void Triple(int []arr,int n)
	{
		Arrays.sort(arr);
		for(int i=0;i<n;i++)
		{
			//System.out.println("in for");
			
			p=i+1;
			q=n-1;
			while(p<=q)
			{
				//System.out.println("im while");
				if((arr[i]+arr[p]+arr[q])==0)
				{
					System.out.println(arr[i]+" " +arr[p]+" "+arr[q]);
					p=p+1;
					q=q-1;
				}
				else if((arr[i]+arr[p]+arr[q])>0)
				{
					q--;
				}
				else
				{
					p++;
				}
			}
		}
		
	}

	
}
