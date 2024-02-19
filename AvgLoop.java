public class AvgLoop
{
	public static void main(String[] args)
	{
		int scores = 0;
		int x = 0;
		double individualScore = 0;
		double total = 0;
		int evens = 0;
		int odds = 0;
		int passing = 0;
		int failing = 0;
		double average = 0;				
		
		System.out.println("How many scores do you want to enter? This must be less than 10.");
		scores = SavitchIn.readLineInt();
		
		while(scores>10)
		{
			System.out.println("\nThat is more than 10 scores. Please try again.");
			scores = SavitchIn.readLineInt();
		}
		
		while(x<scores)
		{
			x = x + 1;
			System.out.println("\nPlease enter score #" + x + ".");
			individualScore = SavitchIn.readLineDouble();
			total = total + individualScore;
			
			if(individualScore % 2 == 0)
			{
				evens = evens + 1;
			}
			else
			{
				odds = odds + 1;
			}
			
			if(individualScore <= 60)
			{
				failing = failing + 1;
			}
			else
			{
				passing = passing + 1;
			}			
		}
		
		average = total/scores;
		System.out.println("\nThe average of those scores is " + average + ".");
		System.out.println("\nThere are " + evens + " even scores and " + odds + " odd scores.");
		System.out.println("\nThere are " + passing + " passing scores and " + failing + " failing scores.");
	}
}