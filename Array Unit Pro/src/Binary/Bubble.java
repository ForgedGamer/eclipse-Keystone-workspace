package Binary;

public class Bubble {
	
	public double[] bubbleSort(double ArraytoSort[]) {
		int i,j,t;
		int l = ArraytoSort.length;
		System.out.println("The size of the arraylist is: " + ArraytoSort.length);
		for (i=0; i < l; i++) {
			System.out.println(ArraytoSort[i]);
			
		}
		for(j=1; j < l; j++) 
		{

			for(i=0; i <l-j; i++) 
			{			
				if(ArraytoSort[i] > ArraytoSort[i+1]) 
				{
					double temp = ArraytoSort[i];
					ArraytoSort[i] = ArraytoSort[i+1];
					ArraytoSort[i+1] = temp;
				
				}
				
			}
		
		}
		for(i=0; i< 6; i++)
		{
		System.out.println(ArraytoSort[i]);
		}
		return ArraytoSort;
		
	}
}
