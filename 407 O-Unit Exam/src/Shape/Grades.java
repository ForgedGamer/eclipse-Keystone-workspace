
package Shape;
import java.util.Scanner;
public class Grades 
{

	static public void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		GradeHolder Grade = new GradeHolder();
		int[] Points = new int[6];
		int student;
		int CLS;
		int grade = 0;
		int outcome = 0;
		
		
		System.out.println("Please enter a number to chose the student. 1 = Billy. 2 = James.");
		while(true)
			{
			int studentTemp = input.nextInt();
			if (studentTemp < 3)
				{
				student = studentTemp;
				break;
				}else
				{
					System.out.println("That number is too large");
				}
			}
		System.out.println("Which class? 1 = Bio. 2 = Geo. 3 = Math.");
		while(true)
		{
		int tempCLS = input.nextInt();
		if (tempCLS < 4)
			{
			CLS = tempCLS;
			break;
			}else
			{
				System.out.println("That number is too large");
			}
		}
		Grade.StudentChoice(student,CLS);
		Grade.StudentGrade(grade);
		
		Grade.TotalGrade(outcome);
		System.out.println(outcome);
	}
}
