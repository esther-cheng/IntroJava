public class GradeCalculator
{

	public static void main(String[] args)
	{
		int someVariable = 0;
		
		double quiz1 = 0;
		double quiz2 = 0;
		double quiz3 = 0;
		double quiz4 = 0;
		double quiz5 = 0;
		
		System.out.println("---------Grade Calculator--------- \n");
		
			System.out.println("Please enter quiz score #1.");
			quiz1 = SavitchIn.readLineInt();
			
			System.out.println("\nPlease enter quiz score #2.");
			quiz2 = SavitchIn.readLineInt();
		
			System.out.println("\nPlease enter quiz score #3.");
			quiz3 = SavitchIn.readLineInt();
		
			System.out.println("\nPlease enter quiz score #4.");
			quiz4 = SavitchIn.readLineInt();
		
			System.out.println("\nPlease enter quiz score #5.");
			quiz5 = SavitchIn.readLineInt();		
			
		double quizAverage = 0;
		quizAverage = (quiz1 + quiz2 + quiz3 + quiz4 + quiz5)/5;
			
			System.out.println("\nThe average of the test scores is " + quizAverage +".");
	}
}	