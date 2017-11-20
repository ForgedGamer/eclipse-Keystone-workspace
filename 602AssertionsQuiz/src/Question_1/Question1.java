package Question_1;
/**********************************************************
 * 
 * Filename:  Question1.java
 * Author: Evan Darnell
 * Class:  Programming:  Visual Basic.NET and Java
 * Semester:  2
 * Assignment Number:  6.02 Assertion Quiz
 * Description:  
 * Write a program based on first form assertion to check to see if the user-input number is 6.
 *
 */
import java.util.Scanner;

public class Question1 
{
	
	public static void main (String args[])
	{
		Scanner Input = new Scanner(System.in);
		int ClientInput;
		System.out.println("Please enter the number 6.");
		
		ClientInput = Input.nextInt();
		
		assert (ClientInput == 6);
		System.out.println("You entered " +ClientInput+"!");

		
	}

}
