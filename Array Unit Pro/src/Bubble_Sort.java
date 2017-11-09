public class Bubble_Sort 
{

	public static void main(String args[]) 
	{	
		int sort[] = {16, 100, 205, 8, 1, 3, 2, 5, 7, 6, 15, 10, 14};
		int i,j,t;
		int l = sort.length;
		System.out.println("The size of the arraylist is: " + sort.length);
		System.out.println("The unsorted numbers inside of the arraylist are: ");
		for (i=0; i < l; i++) {
			System.out.println(sort[i]);
			
		}
		for(j=1; j < l; j++) 
		{

			for(i=0; i <l-j; i++) 
			{			
				if(sort[i] > sort[i+1]) 
				{
					int temp = sort[i];
					sort[i] = sort[i+1];
					sort[i+1] = temp;
				
				}
				
			}
		
		}
		for(i=0; i< 10; i++)
		{
		System.out.println(sort[i]);
	}
	}
}

