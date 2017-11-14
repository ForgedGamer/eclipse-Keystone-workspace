class Final 
/**********************************************************
 * 
 * Filename:  Final.java
 * Author: Evan Darnell
 * Class:  Programming:  Visual Basic.NET and Java
 * Semester:  2
 * Assignment Number:  4.01 - Classes and Objects Quiz
 * Description:  Write a Java program that implements a final method and performs an arithmetic operation.
 *
 */
{ 
	public int a =2; 
	public int b =4; 
	final void arith() 
	{ 
		int equal; equal = a + b; System.out.println(equal);  
	} 
}
class arit
{ 
	public static void main(String args[]) 
	{ 
		Final math= new Final(); math.arith(); 
	}
}