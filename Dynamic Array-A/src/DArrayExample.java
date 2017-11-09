
/**********************************************************
 * 
 * Filename:  DArrayExample.java
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
		// Prepare the DynamicArray for storing the Fibinacci Sequence numbers
		DynamicArray fibinacciSequence = new DynamicArray();
		int totalNumbersStored = 0;
		int maximumNumbersToCalculate = 20;
		
		// Preload the first two Fibinacci numbers
		fibinacciSequence.putelement(totalNumbersStored++, 1);
		fibinacciSequence.putelement(totalNumbersStored++, 1);
		
		// Calculate the requested number of Fibinacci numbers
		for(int c = totalNumbersStored - 1; c < maximumNumbersToCalculate; c++)
		{
			int fibinacciValue = fibinacciSequence.getelement(totalNumbersStored - 1) + fibinacciSequence.getelement(totalNumbersStored - 2);

			fibinacciSequence.putelement(totalNumbersStored++, fibinacciValue);
		}
		
		// Output all of the numbers that we have stored in the Fibinacci sequence Dynamic array
		System.out.println("\nYour numbers in order are;\n");
		for (int i = 0; i < totalNumbersStored; i++)
		{
			System.out.println(fibinacciSequence.getelement(i));
		}
	}
}
