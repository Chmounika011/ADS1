//package week1;

public class SortedArray
{
	public void Sorted(int []a,int []b,int []c)
	{
		int p=a.length;
		int q=b.length;
		int r=c.length;
		int i=0,j=0,k=0;
		while(i<p)
		{
			c[k]=a[i];
			k++;
			i++;
		}
		while(j<q)
		{
			c[k]=b[j];
			k++;
			j++;
		}
		System.out.println("common elements");
		
		for(i=0;i<r;i++)
		{
		for(k=i+1;k<r-1;k++)
		{
			if(c[k]==c[i])
			{
				System.out.println(c[k]);
				
			}
		}
		}
	}
}
