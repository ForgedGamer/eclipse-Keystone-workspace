package Binary;

public class Binary_Search 
{
	public static final Double notfound = (double) -1;
	public static Double binarySearch(double[] a, double a2)
	{
		double low =0;
		double high= a.length;
		double mid;
		while(true)
		{
			mid = (low+high) /2;
			if(Double.compare(a[(int)mid], a2) < 0)
				low = mid +1;
			else if(Double.compare(a[(int)mid], a2) > 0)
				high = mid -1;
			else
				return mid;
		}
	}
	
	
	public static void main(String[]args) 
	{
		double[] a = {-3,10,5,24,45.3,10.5};
		Bubble bubble = new Bubble();
		bubble.bubbleSort(a);
		double z = 45.3;
			System.out.println("Found "  + z + "at "+ binarySearch(a,z));
	}
}
 