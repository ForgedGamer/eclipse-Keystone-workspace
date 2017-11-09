
import java.util.Scanner;
public class Fetch {
	public static void main(String args[]) {
		boolean s = true;
		Scanner in = new Scanner (System.in);
		int aInput;
		int a[] = new int[10];
		a[0] = 1;
		a[1] = 5;
		a[2] = 8;
		a[3] = 10;
		a[4] = 14;
		a[5] = 17;
		a[6] = 19;
		a[7] = 22;
		a[8] = 29;
		a[9] = 33;
		System.out.println("The numbers in the array, in order, are:");
		for (int i = 0; i < 10; i++) {
			System.out.println(a[i]);
		}
		System.out.println("Please enter the position of the number(1-10) that you want to see agian! If you wan't to stop, Enter a number higher than 10");
		
		while (s = true){
		aInput = in.nextInt();
		aInput = aInput - 1;		
		if(aInput >= 10)
			break;
		System.out.println(a[aInput]);
		}
		System.out.println("Thank you for using this program!");

	}
}
