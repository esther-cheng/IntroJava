public class CalculateGradesCLASS
{
	public int numStudents = 0;
	public int score = 0;
	public double total = 0;
	public double avg = 0;
	public int numA = 0;
	public int numB = 0;
	public int numC = 0;
	public int numD = 0;
	public int numF = 0;
	public int lowScore = 0;
	public int highScore = 0;
	
	public void displayGreeting()
	{
		System.out.println("Welcome!");
	}
	
	public void enterScores()
	{
		System.out.println("\nHow many students are there?");
		numStudents = SavitchIn.readLineInt();
		
		for(int x = 1; x < numStudents + 1; x++)
		{
			System.out.println("\nEnter score for student #" + x + ".");
			score = SavitchIn.readLineInt();
			
			while(score > 100 || score < 0)
			{
				System.out.println("\nInvalid answer. Try again.");
				score = SavitchIn.readLineInt();
			}
			total = total + score;
			
			if(score <= 100 && score >= 90)
			{
				numA++;
			}
			else if(score <= 89 && score >= 80)
			{
				numB++;
			}
			else if(score <= 79 && score >= 70)
			{
				numC++;
			}
			else if(score <= 69 && score >= 60)
			{
				numD++;
			}
			else
			{
				numF++;
			}
			
			if(score > highScore)
			{
				highScore = score;
			}
			if(score < lowScore || x == 1)
			{
				lowScore = score;
			}
			
			avg = total/x;
		}
	}
	
	public double getAvg()
	{
		return avg;
	}
	
	public int getAs()
	{
		return numA;
	}
	
	public int getBs()
	{
		return numB;
	}	

	public int getCs()
	{
		return numC;
	}

	public int getDs()
	{
		return numD;
	}
	
	public int getFs()
	{
		return numF;
	}
	
	public int getLowest()
	{
		return lowScore;
	}
	
	public int getHighest()
	{
		return highScore;
	}
}