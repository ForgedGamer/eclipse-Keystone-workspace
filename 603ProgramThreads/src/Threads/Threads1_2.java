package Threads;
/**********************************************************
 * 
 * Filename:  Threads1_2.java
 * Author: Evan Darnell
 * Class:  Programming:  Visual Basic.NET and Java
 * Semester:  2
 * Assignment Number:  6.03 Threads 
 * Description:  
 * Write a program to print the even numbers and the odd numbers between 0 and 30 using a single thread and then again using multiple threads.
 *
 */
public class Threads1_2 
{
	public static void main(String args[])
	{
	Threads1 thread1 = new Threads1("Thread 1");
	thread1.start();
	}
}
