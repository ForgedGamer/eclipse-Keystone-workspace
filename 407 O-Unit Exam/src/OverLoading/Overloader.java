package OverLoading;
/**********************************************************
 * 
 * Filename:  Overloader.java
 * Author: Evan Darnell
 * Class:  Programming:  Visual Basic.NET and Java
 * Semester:  2
 * Assignment Number:  4.07 O-Unit Exam 
 * Description:  
 * Write a program to demonstrate the overloading method that would have a class with many functions of same name (i.e. adding two values of different data types).
 *
 */
public class Overloader 
{
	public static void main(String args[])
	{
		
	Overload overloader = new Overload();
	double z =overloader.DoSomething(15.5, 17.8, 0);
	int x = overloader.DoSomething(15, 0, 0);
	overloader.DoSomething(7, 20);
	System.out.println(x);
	System.out.println(z);
	}
	
}
