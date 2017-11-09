
public class bin 
{
	public static final int NOT_FOUND = -1;
	public static int binarySearch(int[] a, int x)
	{
		int low = 0;
		int high = a.length -1;
		int mid;
		while(low <= high)
		{
			mid = (low + high)/2;
			if(a[mid].compareTo(x)<0) 
			{
				low = mid +1;
			}else if(a[mid].compareTo(x)>0) 
			
			{
				high = mid-1;
			}else 
			
			{
				return mid;
			}
			return NOT_FOUND;
		}
	}
	
	public static void main(String []args)
	{
		int size =8;
		Integer[] a = new Integer[size];
		for(int i = 0; i < size; i++)
		{
			a[i] = new Integer(i*2);
		}
		for(int i = 0; i < size; i++) 
		{
			System.out.println("Found " + i + " at " + binarySearch(a, new Integer(i)));
		}
	}
}
