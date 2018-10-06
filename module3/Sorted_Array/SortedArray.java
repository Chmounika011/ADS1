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
		//System.out.println("common elements");
		
	for(k=0;k<c.length;k++)
	{
		if(k<c.length-1)
		{
			System.out.println(c[k]+",");
		}
		else
		{
			System.out.println(c[k]);
		}
	}
	}
}
