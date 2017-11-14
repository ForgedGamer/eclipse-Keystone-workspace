import java.util.*;
public class STRBUF {
	/**********************************************************
	 * 
	 * Filename:  STRBUF.java
	 * Author: Evan Darnell
	 * Class:  Programming:  Visual Basic.NET and Java
	 * Semester:  2
	 * Assignment Number:  5.03 - S-Unit Project
	 * Description:  
	 * Write two programs: one using the String class and one using the StringBuffer class. 
	 * Your programs should store a set of Strings in an ArrayList and print those Strings in the order by which they are added. 
	 * The output of your programs should create a complete sentence.
	 *
	 */

	public static void main(String[] args)	
	{
		ArrayList<String> words = new ArrayList<String>();
		//Creating the StringBuffer object, and naming it sentence.
		StringBuffer sentence = new StringBuffer();
		//Adding "words" to the array of Strings named "words"
		words.add("Steve");
		words.add(" is");
		words.add(" a");
		words.add(" cool");
		words.add(" guy");
		words.add("!");
		//This for-loop adds all of the strings in "words" to the StringBuffer "sentence".
		for (int i = 0; i < 6; i++)
		{
			//.append() Allows you to add string objects to your StringBuffer.
			sentence.append(words.get(i));
		}
		System.out.println(sentence);
	}
}
