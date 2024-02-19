public class Errors
{
	public static void main(String[] args)
	{
		System.out.println("What score did you get on the test?");
		
		int score = 0;
		score = SavitchIn.readLineInt();
		
		while(score>100 || score<0)
		{
			System.out.println("\nPlease enter a score between 0 and 100.");
			score = SavitchIn.readLineInt();
		}
		
		if(score>=90)
		{
			System.out.println("\nYou got an A!");
		}
		else if(score>=80)
		{
			System.out.println("\nYou got a B!");
		}
		else if(score>=70)
		{
			System.out.println("\nYou got a C!");
		}
		else if(score>=60)
		{
			System.out.println("\nYou got a D!");
		}
		else
		{
			System.out.println("\nYou failed.");
		}
	}
}
