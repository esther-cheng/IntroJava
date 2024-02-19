public class ReviewQuiz3
{
	public static void main(String[] args)
	{
		String word = "";
		
		System.out.println("Please enter a word that is between 5 and 10 letters, inclusive.");
		word = SavitchIn.readLine();
		
		while(word.length() < 5 || word.length() > 10)
		{
			System.out.println("\nThat does not have the right amount of letters!");
			word = SavitchIn.readLine();
		}
		
		if(word.charAt(3) == 'a' || word.charAt(3) == 'e' || word.charAt(3) == 'i' || word.charAt(3) == 'o' || word.charAt(3) == 'u')
		{
			System.out.println("\nThe 4th letter of the word is the vowel: " + word.charAt(3) + ".");
		}
		
		int start = 0;
		int end = 0;
		
		System.out.println("\nPlease enter an even beginning number.");
		start = SavitchIn.readLineInt();
		
		while(start % 2 != 0)
		{
			System.out.println("\nThat is not even! Try again.");
			start = SavitchIn.readLineInt();
		}
		
		System.out.println("\nPlease enter an odd ending number.");
		end = SavitchIn.readLineInt();
		
		while(end % 2 != 1)
		{
			System.out.println("\nThat is not odd! Try again.");
			end = SavitchIn.readLineInt();
		}
		
		int x = start;
		System.out.println("\n");
		
		if(start<end)
		{
			while(x<end)
			{
				System.out.println(x);
				x=x+2;
			}
		}
		else
		{
			for(int y = start; y > end; y = y - 2)
			{
				System.out.println(y);
				if(y == 16)
				{
					break;
				}
			}
		}
		
		int quiz = 0;
		String answer = "";
		int numberQuizzes = 0;
		int least80 = 0;
		int less80 = 0;
		int average = 0;
		int total = 0;
		
		do
		{
			numberQuizzes++;
			System.out.println("\nPlease enter quiz score #" + numberQuizzes +".");
			quiz = SavitchIn.readLineInt();
			total = total + quiz;
			average = total/numberQuizzes;
			
			if(quiz>=80)
			{
				least80++;
			}
			else
			{
				less80++;
			}
			
			System.out.println("\nDo you have another score to enter? Please enter yes or no.");
			answer = SavitchIn.readLine();
			
			if(answer.equalsIgnoreCase("no"))
			{
				break;
			}
		} while(answer.equalsIgnoreCase("yes"));
		
		System.out.println("\nYou entered " + numberQuizzes + " quiz score(s).");
		System.out.println("\nThe average of those scores is " + average + ".");
		System.out.println("\nThere are " + least80 +  " scores that are at least 80% and " + less80 + " scores that are less than 80%.");
		
		char answerLess90 = ' ';
		
		if(average < 90)
		{
			System.out.println("\nWhat is my favorite color?\n a) yellow\n b) blue\n c) green\n d) white");
			answerLess90 = SavitchIn.readLineNonwhiteChar();
			
			if(answerLess90 == 'd')
			{
				System.out.println("\nYou get 2% extra credit!");
			}
			else
			{
				System.out.println("\nWrong.");
			}
		}
		
		int start2 = 0;
		int amount = 0;
		int addValue = 0;
		int total2 = 0;
		
		System.out.println("\nPlease enter a starting number.");
		start2 = SavitchIn.readLineInt();
		
		System.out.println("\nPlease enter how many numbers to display.");
		amount = SavitchIn.readLineInt();
		
		System.out.println("\nPlease enter what value to count by.");
		addValue = SavitchIn.readLineInt();
		
		System.out.println("");
		for(int w = 0; w < amount; w++)
		{
			System.out.println(start2);
			total2 = total2 + start2;
			start2 = start2 + addValue;
		}
		
		System.out.println("\nThe sum of those numbers is " + total2 + ".");
		if(total2 % 6 == 0)
		{
			System.out.println("\nThat is divisible by 6!");
		}
		else
		{
			System.out.println("\nThat is not divisible by 6!");
		}
	}
}