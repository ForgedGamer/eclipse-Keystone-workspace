import java.util.Scanner;

public class DArrayExample 
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		DynamicArray numbers;
		int numCt;
		int num;
		numbers = new DynamicArray();
		numCt=1;
		
		System.out.println("Enter some positive integers; Enter 0 to end.");
		
		while (true) 
		{
			System.out.println("Number:   ");
			num = input.nextInt();
			if (num <=0)
			{
				break;
			}
			numbers.putelement(numCt,num);
				numCt++;
		}
		
		System.out.println("\nYour numbers in reverse order are;\n");
		for (int i = numCt - 1 ; i >= 0; i--)
		{
			System.out.println(numbers.getelement(i));
		}
	}
}
