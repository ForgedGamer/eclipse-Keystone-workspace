package ASMENT;
/**********************************************************
 * 
 * Filename:  Threads2.java
 * Author: Evan Darnell
 * Class:  Programming:  Visual Basic.NET and Java
 * Semester:  2
 * Assignment Number:  6.03 Threads
 * Description:  
 *  Write a program to print the even numbers and the odd numbers between 0 and 30 using a single thread and then again using multiple threads.
 *
 */
public class Threads2 {

	public static void main(String args[])
	{
		ThreadsLifeCycle thread1 = new ThreadsLifeCycle("Thread 1!" );
		thread1.start();
		try
		{
			Thread.sleep(20);
			thread1.suspend();
			System.out.println("Suspending Thread.");
			Thread.sleep(40); 
			System.out.println("Gonna resume the thread now!");
			thread1.resume();
			
		}
		catch(InterruptedException ex)
		{
			System.out.println("The thread was interrupted while suspending and resuming the thread.");
		}
		try
		{
			thread1.uni.join();
		}
		catch(InterruptedException joined)
		{
			System.out.println("There was a problem when joining.");
		}
	}
}
