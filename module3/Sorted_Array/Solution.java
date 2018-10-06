import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Solution {

	public static void main(String[] args) throws IOException
	{
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		//System.out.println("enter number of elements in array1");
		int n=br.read();
		//System.out.println("enter number of elements in array2");
		int m=br.read();
		//System.out.println("enter elements");
		int	[] a=new int[n];
		int []b=new int[m];
		int []c=new int[n+m];
		for(int i=0;i<n;i++)
		{
			a[i]=br.read();
		}
		for(int i=0;i<m;i++)
		{
			b[i]=br.read();
		}
		SortedArray s=new SortedArray();
		s.Sorted(a, b, c);
	}

}
