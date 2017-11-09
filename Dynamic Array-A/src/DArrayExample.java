
/**********************************************************
 * 
 * Filename:  DynamArray.java
 * Author: Evan Darnell
 * Class:  Programming:  Visual Basic.NET and Java
 * Semester:  2
 * Assignment Number:  3.02 - Dynamic Arrays
 * Description:  Use a Dynamic Array to produce a Fibonacci Series
 *
 */
public class DArrayExample 
{
	public static void main(String args[])
	{
		DynamicArray numbers;
		int numCt;
		int num;
		numbers = new DynamicArray();
		numCt=2;
				
		for(int c = 0; c <= 20; c++)
		{
			num = 0;
			numbers.putelement(numCt,num);
				numCt++;
		}
		
		System.out.println("\nYour numbers in order are;\n");
		for (int i = 0; i <= numCt; i++)
		{
			System.out.println(numbers.getelement(i));
		}
	}
}
