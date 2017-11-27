	import java.util.Scanner;
public class AgeCheck {
//append

	 public static void main(String []args)
	 {
		 Scanner input = new Scanner(System.in);
		 int age;
		 System.out.println("Enter Your age.");
		 age = input.nextInt();
		 assert (0 < age) : "The age entered is invalid";
		 assert (age < 125): "The age entered is invalid";
	 }
	}
