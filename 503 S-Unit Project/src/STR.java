import java.util.*;
public class STR {
	/**********************************************************
	 * 
	 * Filename:  STR.java
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
		String S1 ="Steve";
		String S2 = " is";
		String S3 = " not";
		String S4 = " that";
		String S5 = " cool";
		String S6 = "," ;
		String S7 = " but";
		String S8 = " he";
		String S9 = " is";
		String S10 = " chill";
		String S11= ".";
		words.add(S1);
		words.add(S2);
		words.add(S3);
		words.add(S4);
		words.add(S5);
		words.add(S6);
		words.add(S7);
		words.add(S8);
		words.add(S9);
		words.add(S10);
		words.add(S11);
		System.out.println(words.toArray());
		for(int i = 0; i < 11; i++)
		{
			System.out.print(words.get(i));
		}
	}
}
