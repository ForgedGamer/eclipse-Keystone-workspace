/**********************************************************
 * 
 * Filename:  Question_4.java
 * Author: Evan Darnell
 * Class:  Programming:  Visual Basic.NET and Java
 * Semester:  2
 * Assignment Number:  6.01 - Exception Handling Quiz
 * Description:  Write a program for that would use the ArrayIndexOutOfBoundsException.
 *
 */
public class Question_4 
{
	public static void main(String args[])
	{
		int[] array = new int[2];
		for(int i = 0; i < 3; i++) 
		{
		 try
		 {
			 System.out.println(array[i]);
		 }
		 //ArrayIndexOutOfBoundsException is an exception that is used when you try to call an array index that is out of bounds.
		 catch(ArrayIndexOutOfBoundsException ex){
			 System.out.println("That array index is out of bounds " + ex);
		 }
		 finally
		 {
			 System.out.println("Rotation " + (i+1) + " is complete.");
		 }
		}
	}
}
