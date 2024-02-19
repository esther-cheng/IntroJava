public class RockPaperScissors
{
	public static void main(String[] args)
	{
		String choice = "";
		int choiceNumb = 0;
		char answer = ' ';
		int balance = 100;
		int bet = 0;
		int games = 0;
		
		do
		{
			int ties = 0;
			int player = 0;
			int computer = 0;
			
			System.out.println("How much do you want to bet? This must be less than your current balance: $" + balance + ".");
			bet = SavitchIn.readLineInt();
			
			while(bet > balance || bet < 0)
			{
				System.out.println("\nYou bet more than your balance! Try again.");
				bet = SavitchIn.readLineInt();
			}
			
			while(player !=5 && computer !=5)
			{
				System.out.println("\nPlease enter \"rock\", \"paper\", or \"scissors\".");
				choice = SavitchIn.readLine();
				
				while(!(choice.equalsIgnoreCase("rock")) && !(choice.equalsIgnoreCase("paper")) && !(choice.equalsIgnoreCase("scissors")))
				{
					System.out.println("\nThat is not correct! Try again.");
					choice = SavitchIn.readLine();
				}
				
				if(choice.equalsIgnoreCase("rock"))
				{
					choiceNumb = 1;
				}
				else if(choice.equalsIgnoreCase("paper"))
				{
					choiceNumb = 2;
				}
				else
				{
					choiceNumb = 3;
				}
				
				String compChoice = "";
				int compChoiceNumb = 0;
				
				compChoiceNumb = (int)(Math.random() * 3 + 1);
				if(compChoiceNumb == 1)
				{
					compChoice = "rock";
				}
				else if(compChoiceNumb == 2)
				{
					compChoice = "paper";
				}
				else
				{
					compChoice = "scissors";
				}
				
				System.out.println("\nYOUR CHOICE: " + choice + " \nTHE COMPUTER'S CHOICE: " + compChoice + "");
				
				if(choiceNumb == compChoiceNumb)
				{
					System.out.println("\nYou tied!");
					ties++;
				}
				else if((choiceNumb == 1 && compChoiceNumb == 3) || (choiceNumb == 2 && compChoiceNumb == 1) || (choiceNumb == 3 && compChoiceNumb == 2))
				{
					System.out.println("\nYou won!");
					player++;
				}
				else
				{
					System.out.println("\nThe computer won!");
					computer++;
				}
				
				System.out.println("\nWINS: " + player + " \nLOSSES: " + computer + "");
			}
			
			if(player > computer)
			{
				balance = balance + (bet * 2);
				games++;
			}
			else
			{
				balance = balance - bet;
			}
			
			System.out.println("\nYOUR NEW BALANCE: $" + balance + " \nYOU HAVE WON " + games + " GAMES.");
			System.out.println("\nDo you want to play again? Please answer 'y' or 'n'.");
			answer = SavitchIn.readLineNonwhiteChar();
			
		} while(answer == 'y' || answer == 'Y' || balance == 0);
	}
}