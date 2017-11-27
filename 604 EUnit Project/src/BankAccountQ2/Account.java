package BankAccountQ2;
import java.util.Scanner;
public class Account {
	public static int Balance;
	public static void main(String []args)
	{
		Balance = 10000;
		Scanner Input = new Scanner(System.in);
		Account Access = new Account();
		System.out.println("How much will you withdraw frin ... " + Balance + "?" );
		int Modyfier = Input.nextInt();
		Access.Withdraw(Modyfier);
		System.out.println(Balance);
	}
	
	public int Withdraw(int Sub)
	{
		assert 0 < Sub : "The amount you are attempting to withdraw is too small.";
		assert Balance < Sub : "The amount you are attempting to withdraw is too large."; 
		Sub = Balance - Sub;
		Balance = Sub;
		System.out.println("Your new balance is... " + Balance);
		return Balance;
	}
}
