public class War
{
	public static void main(String[] args)
	{
		int card = 0;
		int compCard = 0;
		int balance = 100;
		int bet = 0;
		String royals = "";
		int computer = 0;
		int player = 0;
		char answer = ' ';
		
		do
		{
			int playerDeck = 26;
			int compDeck = 26;
	
			System.out.println("Please place your bet! Your bet cannot be higher than your current balance: $" + balance + ".");
			bet = SavitchIn.readLineInt();
			
			while(bet > balance)
			{
				System.out.println("\nYour bet is greater than your balance! Try again.");
				bet = SavitchIn.readLineInt();
			}
			
			while(compDeck != 52 && playerDeck != 52)
			{
				card = (int)(Math.random() * 13 + 2);
				compCard = (int)(Math.random() * 13 + 2);
				
				if(card == 11 || compCard == 11)
				{
					royals = "JACK";
				}
				
				if(card == 12 || compCard == 12)
				{
					royals = "QUEEN";
				}
				
				if(card == 13 || compCard == 13)
				{
					royals = "KING";
				}
				
				if(card == 14 || compCard == 14)
				{
					royals = "ACE";
				}
				
				if((card == 11 || card == 12 || card == 13 || card == 14) && (compCard == 11 || compCard == 12 || compCard == 13 || compCard == 14))
				{
					System.out.println("\nYOUR CARD: " + royals + " \nTHE COMPUTER'S CARD: " + royals + "");
				}
				else if(card == 11 || card == 12 || card == 13 || card == 14)
				{
					System.out.println("\nYOUR CARD: " + royals + " \nTHE COMPUTER'S CARD: " + compCard + "");
				}
				else if(compCard == 11 || compCard == 12 || compCard == 13 || compCard == 14)
				{
					System.out.println("\nYOUR CARD: " + card + " \nTHE COMPUTER'S CARD: " + royals + "");
				}
				else
				{
					System.out.println("\nYOUR CARD: " + card + " \nTHE COMPUTER'S CARD: " + compCard + "");
				}
				
				int ties = 0;
				
				while(card == compCard && playerDeck > 4 && compDeck > 4)
				{
					System.out.println("\nWAR!");
					card = (int)(Math.random() * 13 + 2);
					compCard = (int)(Math.random() * 13 + 2);
					
					if(card == 11 || compCard == 11)
					{
						royals = "JACK";
					}
					
					if(card == 12 || compCard == 12)
					{
						royals = "QUEEN";
					}
					
					if(card == 13 || compCard == 13)
					{
						royals = "KING";
					}
					
					if(card == 14 || compCard == 14)
					{
						royals = "ACE";
					}
					
					if((card == 11 || card == 12 || card == 13 || card == 14) && (compCard == 11 || compCard == 12 || compCard == 13 || compCard == 14))
					{
						System.out.println("\nYOUR CARD: " + royals + " \nTHE COMPUTER'S CARD: " + royals + "");
					}
					else if(card == 11 || card == 12 || card == 13 || card == 14)
					{
						System.out.println("\nYOUR CARD: " + royals + " \nTHE COMPUTER'S CARD: " + compCard + "");
					}
					else if(compCard == 11 || compCard == 12 || compCard == 13 || compCard == 14)
					{
						System.out.println("\nYOUR CARD: " + card + " \nTHE COMPUTER'S CARD: " + royals + "");
					}
					else
					{
						System.out.println("\nYOUR CARD: " + card + " \nTHE COMPUTER'S CARD: " + compCard + "");
					}
					ties++;
				}
				
				if(compCard > card)
				{
					System.out.println("\nThe computer won! Sorry.");
					compDeck++;
					playerDeck--;
					
					while(ties > 0)
					{
						compDeck = compDeck + 4;
						playerDeck = playerDeck - 4;
						ties--;
					}
				}
				else if(card > compCard)
				{
					System.out.println("\nYou won! Congrats!");
					playerDeck++;
					compDeck--;
					
					while(ties > 0)
					{
						playerDeck = playerDeck + 4;
						compDeck = compDeck - 4;
						ties--;
					}
				}
				
				System.out.println("\nYOUR DECK: " + playerDeck + " \nTHE COMPUTER'S DECK: " + compDeck + "");			
			}
			
			if(playerDeck == 52)
			{
				player++;
				balance = balance + bet;
			}
			else 
			{
				computer++;
				balance = balance - bet;
			}
			
			System.out.println("\nWINS: " + player + " \nLOSSES: " + computer + "");	
			
			if(balance == 0)
			{
				System.out.println("\nYour balance is now $0! You cannot gamble anymore.");
				break;
			}
			else
			{
				System.out.println("\nYour balance is now $" + balance + ". Would you like to play again?");
				answer = SavitchIn.readLineNonwhiteChar();
				
				while(answer != 'y' && answer != 'Y' && answer != 'n' && answer != 'N')
				{
					System.out.println("\nInvalid answer. Try again.");
					answer = SavitchIn.readLineNonwhiteChar();
				}	
			}
			
		} while(answer == 'y' || answer == 'Y');
	}
}