//package MODULE3;

import java.lang.reflect.Array;
import java.util.Arrays;

public class NoofPairs 
{
	int []arr;
	int n;
	int count=0;
	public void sort(int []arr,int n)
	{
		/*this.arr=arr;
		this.n=n;*/
		int m=0;
		Arrays.sort(arr);
		for(int i=0;i<n-1;i++)
		{
			if(arr[i]!=m)
			{
				if(arr[i]==arr[i+1])
				{
					m=arr[i];
					count++;
				}
			}
		}
		System.out.println("number of pairs:"+count);
	}
}
