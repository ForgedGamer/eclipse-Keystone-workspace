package OverLoading;
/**********************************************************
 * 
 * Filename:  Overload.java
 * Author: Evan Darnell
 * Class:  Programming:  Visual Basic.NET and Java
 * Semester:  2
 * Assignment Number:  4.07 O-Unit Exam 
 * Description:  
 * Write a program to demonstrate the overloading method that would have a class with many functions of same name (i.e. adding two values of different data types).
 *
 */
public class Overload 
{

	void DoSomething(int a, int b)
	{
		System.out.println(a+b);
	}
	int DoSomething(int a, int c, int b)
	{
		double z = 10;
		c = (int)z;
		b = a + (int)c;
		return b;
	}
	double DoSomething(double c, double b, double a)
	{
		int z = 15;
		a = (double) z;
		b = a + b;
		c =b+c;
		return c;
	}
}



