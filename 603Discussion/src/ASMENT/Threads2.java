package ASMENT;
/**********************************************************
 * 
 * Filename:  Threads2.java
 * Author: Evan Darnell
 * Class:  Programming:  Visual Basic.NET and Java
 * Semester:  2
 * Assignment Number:  6.03 Threads Life Cycle
 * Description:  
 * Share a sample program that uses the thread life cycle (i.e. uses code to initiate, suspend, and resume threads).
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
