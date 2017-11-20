package AQ_Q2;
/**********************************************************
 * 
 * Filename:  Q602Question_2.java
 * Author: Evan Darnell
 * Class:  Programming:  Visual Basic.NET and Java
 * Semester:  2
 * Assignment Number:  6.02 Assertion Quiz
 * Description:  
 * Write a program based on second form assertion to check if the user-given number is 6.
 *
 */
import java.util.Scanner;
public class Q602Question_2 
{
	public static void main(String args[])
	{
		Scanner Input = new Scanner(System.in);
		int ClientInput;
		System.out.println("Please enter 6.");
		ClientInput = Input.nextInt();
		assert(ClientInput == 6) : "You've entered the wrong number: " +ClientInput ;
		System.out.println("Thank you!");
	}

}
