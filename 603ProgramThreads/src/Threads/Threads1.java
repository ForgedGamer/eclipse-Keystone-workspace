package Threads;
/**********************************************************
 * 
 * Filename:  Threads1.java
 * Author: Evan Darnell
 * Class:  Programming:  Visual Basic.NET and Java
 * Semester:  2
 * Assignment Number:  6.03 Threads 
 * Description:  
 * Write a program to print the even numbers and the odd numbers between 0 and 30 using a single thread and then again using multiple threads.
 *
 */
import java.lang.Runnable;
public class Threads1 implements Runnable
{
	public Thread uni;
	boolean suspended = false;
	private String threadname;
	Threads1 (String name)
	{
		threadname = name;
		System.out.println("We have created a thread named:" + threadname) ;
	}
	
	public void run()
	{
		try
		{
			for(int i = 0; i<30; i+=1) 
			{
				;
				if(i%2 == 0 == false)
				{
					System.out.println(i + " is odd.");
				}else
				{
					System.out.println(i + " is even");
				}
				
				{
					while(suspended)
					{
						wait();
					}
				}
			}
		}
		catch(InterruptedException ex)
		{
			System.out.println("The thread was interupted...");
		}
		System.out.println("Exiting the thread now!!!");
	}
	
	public void suspend()
	{
		suspended = true;
	}
	
	public void start()	
	{
		if (uni == null)
		{
			uni = new Thread(this, threadname);
			uni.start();
		}
	}

	synchronized void resume()
	{
		
		suspended = false;
		notify();
	}


}
