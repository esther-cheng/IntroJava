public class Quiz1Review
{

	public static void main(String[] args)
	{
		String name = "";
		char answer = ' ';
		char answerNo = ' ';
		
		System.out.println("What's your name?");
		name = SavitchIn.readLine();
		
		System.out.println("\nHi, " + name + "! Are you ready for the quiz on Tuesday? Please answer 'y' or 'n'.");
		answer = SavitchIn.readLineNonwhiteChar();
		
		if (answer == 'y')
		{
			System.out.println("\nNice! I'm so glad you're prepared!");
		}
		else if (answer == 'n')
		{
			System.out.println("\nWhat is it you need the most help with? \n     a) variables \n     b) if statements \n     c) the computer syntax");
			answerNo = SavitchIn.readLineNonwhiteChar();
			if (answerNo == 'a')
			{
				System.out.println("\nSo, you need some help with variables! Remember that there are four different types of variables: int, double, char, and String. int is used when you're typing an integer (no decimals), double is used when you're typing a decimal, char is used for a single character, and String is used for multiple characters like phrases or words. Lastly, the different variables have different input commands. Make sure you study those!");
			}
			else if (answerNo == 'b')
			{
				System.out.println("\nSo, you need some help with if statements! Make sure you remember that a semicolon can not follow the if statement, and that brackets are used. Also, remember every 'if' must have an 'else'.");
			}
			else if (answerNo == 'c')
			{
				System.out.println("\nSo, you need some help understanding computer syntax! This one would take a long time to explain, so I would suggest going back to your notes and looking at some lines of code that include the words you have some problems with. Familiarize yourself with the material, and you'll for sure get it!");
			}
			else 
			{
				System.out.println("\nSorry, I can't help you with that.");
			}
		}
		else 
		{
			System.out.println("\nThat is not an answer choice provided.");
		}
	}
}		
		