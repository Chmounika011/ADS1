//package MODULE3;

public class BinarySearch 
{
	public int binarysearch(int []arr,int m,int n,int s)
	{
		while(m<=n)
		{
			int mid=m+(n-1)/2;
			if(arr[mid]==s)
			{
				if(arr[mid]>=s)
				{
				return mid;
				}
			}
			if(arr[mid]<s)
			{
				m=mid+1;
			}
			else
			{
				n=mid-1;
			}
		}
		
		return -1;
		
	}
}

	
