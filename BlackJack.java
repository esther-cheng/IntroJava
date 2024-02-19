public class BlackJack
{
	public static void main(String[] args)
	{
		int balance = 100;
		int bet = 0;
		char answer = ' ';
		int wins = 0;
		int loss = 0;
		
		do
		{
			int dealer1 = 0;
			int dealer2 = 0;
			int card1 = 0;
			int card2 = 0;
			int hit = 0;
			char ansHit = ' ';
			int ansAces = 0;
			String royals1 = "";
			String royals2 = "";
			String royalsD1 = "";
			String royalsD2 = "";
			int pTotal = 0;
			int dTotal = 0;
			
			System.out.println("Please enter your bet! It has to be even and cannot be higher than your current balance: $" + balance + ".");
			bet = SavitchIn.readLineInt();
			
			while(bet > balance || bet % 2 != 0)
			{
				System.out.println("\nInvalid answer! Try again.");
				bet = SavitchIn.readLineInt();
			}
			
			dealer1 = (int)(Math.random() * 13 + 2);
			dealer2 = (int)(Math.random() * 13 + 2);
			card1 = (int)(Math.random() * 13 + 2);
			card2 = (int)(Math.random() * 13 + 2);
			
			
			if(card1 == 11) //////////////////////////// PLAYER VALUES ////////////////////////////////////
			{
				royals1 = "JACK";
				card1 = 10;
			}
			if(card2 == 11)
			{
				royals2 = "JACK";
				card2 = 10;
			}
			
			if(card1 == 14)
			{
				royals1 = "ACE";
				card1 = 11;
			}
			if(card2 == 14)
			{
				royals2 = "ACE";
				card2 = 11;
			}
			
			if(card1 == 12)
			{
				royals1 = "QUEEN";
				card1 = 10;
			}
			if(card2 == 12)
			{
				royals2 = "QUEEN";
				card2 = 10;
			}
			
			if(card1 == 13)
			{
				royals1 = "KING";
				card1 = 10;
			}		
			if(card2 == 13)
			{
				royals2 = "KING";
				card2 = 10;
			}
				
			if(card1 == 11 && card2 == 11)
			{
				pTotal = 12;
			}
			else
			{
				pTotal = card1 + card2;
			}
	
			if(dealer1 == 14) ////////////////////////////////// DEALER VALUES ////////////////////
			{
				royalsD1 = "ACE";
			}
			else if(dealer1 == 11)
			{
				royalsD1 = "JACK";
			}
			else if(dealer1 == 12)
			{
				royalsD1 = "QUEEN";
			}
			else if(dealer1 == 13)
			{
				royalsD1 = "KING";
			}
			
			if(dealer2 == 14)
			{
				royalsD2 = "ACE";
			}
			else if(dealer2 == 11)
			{
				royalsD2 = "JACK";
			}
			else if(dealer2 == 12)
			{
				royalsD2 = "QUEEN";
			}
			else if(dealer2 == 13)
			{
				royalsD2 = "KING";
			}
			
			if(dealer1 == 14)
			{
				dTotal = 11;
			}
			else if(dealer1 == 11 || dealer1 == 12 || dealer1 == 13)
			{
				dTotal = 10;
			}
			else
			{
				dTotal = dealer1;
			}
			
			if(dealer1 == 11 || dealer1 == 12 || dealer1 == 13 || dealer1 == 14) ///////////////////// PRINTOUTS //////////////////
			{
				System.out.println("\nDEALER HAS " + royalsD1 + " AND ??.");
				System.out.println("DEALER'S TOTAL: " + dTotal + "");
			}
			else
			{
				System.out.println("\nDEALER HAS " + dealer1 + " AND ??.");
				System.out.println("DEALER'S TOTAL: " + dTotal + "");
			}
			
			if((card1 == 11 || card1 == 12 || card1 == 13 || card1 == 14) && (card2 == 11 || card2 == 12 || card2 == 13 || card2 == 14))
			{
				System.out.println("\nYOU HAVE " + royals1 + " AND " + royals2 + ".");
				System.out.println("YOUR TOTAL: " + pTotal + "");
			}
			else if(card1 == 11 || card1 == 12 || card1 == 13 || card1 == 14)
			{
				System.out.println("\nYOU HAVE " + royals1 + " AND " + card2 + ".");
				System.out.println("YOUR TOTAL: " + pTotal + "");
			}
			else if(card2 == 11 || card2 == 12 || card2 == 13 || card2 == 14)
			{
				System.out.println("\nYOU HAVE " + card1 + " AND " + royals2 + ".");
				System.out.println("YOUR TOTAL: " + pTotal + "");
			}
			else 
			{
				System.out.println("\nYOU HAVE " + card1 + " AND " + card2 + ".");
				System.out.println("YOUR TOTAL: " + pTotal + "");
			}
			
			if(pTotal == 21)
			{
				System.out.println("\nBLACKJACK! You won! Congrats!");
				balance = balance + (bet * 3/2);
			}
			
			while(pTotal < 21) //////////////////////// PLAYER HITS ////////////////////////////
			{
				System.out.println("\nHit? Please answer 'y' or 'n'.");
				ansHit = SavitchIn.readLineNonwhiteChar();
				if(ansHit == 'y' || ansHit == 'Y')
				{
					hit = (int)(Math.random() * 13 + 2);
					if(hit == 14)
					{
						royals1 = "ACE";
						System.out.println("NEW CARD: ACE");
						System.out.println("\nDo you want this value to be 1 or 11? Press '1' for 1 and '2' for 11.");
						ansAces = SavitchIn.readLineInt();
						
						while(ansAces != 1 && ansAces != 2)
						{
							System.out.println("\nInvalid answer. Try again.");
							ansAces = SavitchIn.readLineInt();
						}
						
						if(ansAces == 1)
						{
							pTotal = pTotal + 1;
						}
						else
						{
							pTotal = pTotal + 11;
						}
					}
					else if(hit == 11)
					{
						royals1 = "JACK";
						pTotal = pTotal + 10;
					}
					else if(hit == 12)
					{
						royals1 = "QUEEN";
						pTotal = pTotal + 10;
					}
					else if(hit == 13)
					{
						royals1 = "KING";
						pTotal = pTotal + 10;
					}
					else
					{
						pTotal = pTotal + hit;
					}
				}
				else
				{
					break;
				}
				
				if(hit == 11 || hit == 12 || hit == 13)
				{
					System.out.println("\nNEW CARD: " + royals1 + "");
					System.out.println("\nNEW TOTAL: " + pTotal + "");
				}
				else
				{
					System.out.println("\nNEW CARD: " + hit + "");
					System.out.println("\nNEW TOTAL: " + pTotal + "");
				}
			}
			
			if(pTotal <= 21)
			{
				if(dealer2 == 11 || dealer2 == 12 || dealer2 == 13 || dealer2 == 14)
				{
					System.out.println("\nDEALER'S SECOND CARD: " + royalsD2+ "");
					if(dealer2 == 11 || dealer2 == 12 || dealer2 == 13)
					{
						dTotal = dTotal + 10;
					}
					else if(dealer2 == 14)
					{
						if(dealer1 == 14)
						{
							dTotal = 12;
						}
						else
						{
							dTotal = dTotal + 11;
						}
					}
					System.out.println("DEALER TOTAL: " + dTotal + "");
				}
				else
				{
					System.out.println("\nDEALER'S SECOND CARD: " + dealer2 + "");
					dTotal = dTotal + dealer2;
					System.out.println("DEALER TOTAL: " + dTotal + "");
				}
				
				while(dTotal < 17)
				{
					hit = (int)(Math.random() * 13 + 2);
					if(hit == 14)
					{
						royals1 = "ACE";
						hit = 11;
					}
					else if(hit == 11)
					{
						royals1 = "JACK";
						hit = 10;
					}
					else if(hit == 12)
					{
						royals1 = "QUEEN";
						hit = 10;
					}
					else if(hit == 13)
					{
						royals1 = "KING";
						hit = 10;
					}
					if(hit == 11 || hit == 12 || hit == 13 || hit == 14)
					{
						System.out.println("\nThe dealer had to hit! His new card is: " + royals1 + ".");
					}
					else
					{
						System.out.println("\nThe dealer had to hit! His new card is: " + hit + ".");
					}
					dTotal = dTotal + hit;
					System.out.println("DEALER TOTAL: " + dTotal + "");
				}
			}
			
			if(pTotal > 21)
			{
				System.out.println("\nBUST! You lost!");
				balance = balance - bet;
				loss++;
			}
			else if(dTotal > 21)
			{
				System.out.println("\nThe dealer busted! You win!");
				balance = balance + bet;
				wins++;
			}
			else if(dTotal == pTotal)
			{
				System.out.println("\nTie!");
			}
			else if(dTotal > pTotal)
			{
				System.out.println("\nThe dealer won! Sorry!");
				balance = balance - bet;
				loss++;
			}
			else if(pTotal > dTotal && pTotal != 21)
			{
				System.out.println("\nYou won! Congrats!");
				balance = balance + bet;
				wins++;
			}
			else if(pTotal > dTotal)
			{
				wins++;
			}
			
			System.out.println("\nDEALER'S TOTAL: " + dTotal + " \nYOUR TOTAL: " + pTotal + "");
			System.out.println("WINS: " + wins + " \nLOSSES: " + loss + "");
						
			if(balance == 0)
			{
				System.out.println("\nYour balance is $0! You are not allowed to gamble anymore.");
				break;
			}
			else
			{
				System.out.println("\nYour new balance is $" + balance + ". Would you like to play again? Please answer 'y' or 'n'.");
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