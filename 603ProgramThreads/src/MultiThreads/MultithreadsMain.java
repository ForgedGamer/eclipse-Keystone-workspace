package MultiThreads;
/**********************************************************
 * 
 * Filename:  MultithreadsMain.java
 * Author: Evan Darnell
 * Class:  Programming:  Visual Basic.NET and Java
 * Semester:  2
 * Assignment Number:  6.03 Threads 
 * Description:  
 * Write a program to print the even numbers and the odd numbers between 0 and 30 using a single thread and then again using multiple threads.
 *
 */
public class MultithreadsMain 
{
	public static void main(String args[])
	{
	Multithreads Thread1 = new Multithreads("Thread 1");
	Thread1.start();
	Multithreads Thread2 = new Multithreads("Thread 2");
	Thread2.start();
	Thread2.Choice=2;
	Thread1.Choice=1;
	System.out.println("Thread1 will print even numbers. Thread2 will print odd numbers.");
	
	try 
	{
			
			Thread.sleep(20);
			Thread1.suspend();
			System.out.println("Suspending Thread.");
			Thread.sleep(40); 
			System.out.println("Gonna resume the thread now!");
			Thread1.resume();
			Thread.sleep(20);
			
			
			Thread2.suspend();
			System.out.println("Suspending Thread.");
			Thread.sleep(40); 
			System.out.println("Gonna resume the thread now!");
			Thread2.resume();
		
	}
	catch(InterruptedException ex)
	{
		System.out.println("The operations were interrupted.");
	}
	try
	{
		Thread1.uni.join();
		Thread2.uni.join();
	}
	catch(InterruptedException exx)
	{
		System.out.println("The operations were interrupted.");
	}

	
	
	}

}
