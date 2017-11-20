
public class Binary_Search 
{
	public static final int notfound = -1;
	public static int binarySearch(int[] ArraytoSearch, int SearchforNum) 
	// Can't tell what's wrong here, save this for last pls. we could talk over a game of Magic! 
	{
	int low =0;
	int high= ArraytoSearch.length;
	int mid;
	while(low <= high)
	{
		mid = (low+high) /2;
		if(Integer.compare(ArraytoSearch[mid], SearchforNum) < 0)
			low = mid +1;
		else if(Integer.compare(ArraytoSearch[mid], SearchforNum) > 0)
			high = mid -1;
		else
			return mid;
	}
	return notfound;
	}
	public static void main(String[]args) 
	{
	int size =8;
	int[] a = new int[size];
	for(int i = 0; i < size; i++)
		a[i] = new Integer(i*2) ;
	for(int i = 0; i<size; i++)
		System.out.println("Found " +i+"at "+ binarySearch(a,a[i]));
	}
}
 