package Shape;

public class GradeHolder 
{
	
	private int ChosenStudent;
	private int ChosenClass;
	public void StudentChoice(int student,int CLAS)
	
	{
		switch(student) 
		{
		case 1:
			ChosenStudent = 1;
			System.out.println("You chose Billy!");
			break;
		case 2:
			ChosenStudent = 2;
			System.out.println("You chose James!");
			break;
		}
		
		switch(CLAS)
		{
		case 1:
			ChosenClass = 1;
			System.out.println("You chose Bio!");
			break;
		case 2:
			ChosenClass = 2;
			System.out.println("You chose Geo!");
			break;
		case 3:
			ChosenClass = 3;
			System.out.println("You chose Math!");
			break;
		}
		
		
	}
	
	//These arrays store the point values for each class.
	private int[] Totals = {22, 35, 50};
	private int[] BillyPoints = {19, 28, 40};
	private int[] JamesPoints = {20, 26, 49};
	
	public void StudentGrade(int grade)
	{
		
		int outcome;
		
		//This displays Billy's Points and percentage grade.
		
		if (ChosenStudent == 1) 
			{
				switch (ChosenClass) 
				{
				case 1:					
					System.out.println("Billy Scored " + BillyPoints[ChosenClass-1] + " out of " + Totals[ChosenClass-1]);
					outcome =  BillyPoints[ChosenClass-1] * 100/ Totals[ChosenClass-1];
					System.out.println("Billy's grade is " + outcome);
					break;
				case 2:
					System.out.println("Billy Scored " + BillyPoints[ChosenClass-1] + " out of " + Totals[ChosenClass-1]);
					outcome =  BillyPoints[ChosenClass-1] * 100 / Totals[ChosenClass-1] ;
					System.out.println("Billy's grade is " + outcome);
					break;
				case 3:
					System.out.println("Billy Scored " + BillyPoints[ChosenClass-1] + " out of " + Totals[ChosenClass-1]);
					outcome =  BillyPoints[ChosenClass-1] * 100/ Totals[ChosenClass-1];
					System.out.println("Billy's grade is " + outcome);
					break;
				}
			}
		//This displays James's Points and percentage grade.
		if (ChosenStudent == 2) 
			{
				switch(ChosenClass) 
				{
				case 1:
					System.out.println("James scored " + JamesPoints[ChosenClass-1] + " out of " + Totals[ChosenClass-1]);
					outcome = JamesPoints[ChosenClass-1] * 100 / Totals[ChosenClass-1];
					System.out.println("James's grade is " + outcome);
					break;
				case 2:
					System.out.println("James scored " + JamesPoints[ChosenClass-1] + " out of " + Totals[ChosenClass-1]);
					outcome = JamesPoints[ChosenClass-1] * 100 / Totals[ChosenClass-1];
					System.out.println("James's grade is " + outcome);
					break;
				case 3:
					System.out.println("James scored " + JamesPoints[ChosenClass-1] + " out of " + Totals[ChosenClass-1]);
					outcome = JamesPoints[ChosenClass-1] * 100 / Totals[ChosenClass-1];
					System.out.println("James's grade is " + outcome);
					break;				

				}
			}
	}
    

	
	public void TotalGrade(int Result)
	{
		int a;
		int b;
		int c = 0;
		System.out.println("Debug");
		for (int temp = 0; temp < 4; temp++)			
		{
			a = BillyPoints[temp] + JamesPoints[temp];
			Result = c+a;
			
			
		}
		
		
	}

}