public class ChengCasino
{
	public static void main(String[] args)
	{
		int balance = 100;
		int bet = 0;
		char game = ' ';
		char answer = ' ';
		char anotherGame = ' ';
		
		do
		{
			System.out.println("Welcome to the casino! What game would you like to play? \nA) Rock, Paper, Scissors \nB) Slot Machine \nC) War \nD) Roulette \nE) Blackjack");
			game = SavitchIn.readLineNonwhiteChar();
			
			while(game != 'a' && game != 'b' && game != 'c' && game != 'd' && game != 'e' && game != 'A' && game != 'B' && game != 'C' && game != 'D' && game != 'E')
			{
				System.out.println("\nInvalid answer! Try again.");
				game = SavitchIn.readLineNonwhiteChar();
			}
			
			if(game == 'a' || game == 'A')
			{
				String choice = "";
				int choiceNumb = 0;
				answer = ' ';
				anotherGame = ' ';
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
						balance = balance + bet;
						games++;
					}
					else
					{
						balance = balance - bet;
					}
					
					System.out.println("\nYou have $" + balance + " remaining in your account! You have won " + games + " games.");
					if(balance == 0)
					{
						System.out.println("\nYou are not allowed to gamble anymore!");
						break;
					}
					else
					{
						System.out.println("\nWould you like to play again? Please enter 'y' or 'n'.");
						answer = SavitchIn.readLineNonwhiteChar();
						
						while(answer != 'y' && answer != 'Y' && answer != 'n' && answer != 'N')
						{
							System.out.println("\nInvalid answer! Try again.");
							answer = SavitchIn.readLineNonwhiteChar();
						}
					}

				} while(answer == 'y' || answer == 'Y');
				
				if(answer == 'n' || answer == 'N')
				{
					System.out.println("\nWould you like to play another game? Please enter 'y' or 'n'.");
					anotherGame = SavitchIn.readLineNonwhiteChar();
					
					while(anotherGame != 'y' && anotherGame != 'Y' && anotherGame != 'n' && anotherGame != 'N')
					{
						System.out.println("\nInvalid answer. Try again.");
						anotherGame = SavitchIn.readLineNonwhiteChar();
					}
				}
			}
			else if(game == 'b' || game == 'B') ////////////////////////////////// SLOTS //////////////////////////////
			{
				anotherGame = ' ';
				answer = ' ';
				int real1 = 0;
				int real2 = 0;
				int real3 = 0;
				char p = ' ';
		
				do
				{
					System.out.println("How much do you want to bet? Your bet can not be higher than your current balance: $" + balance + ".");
					bet = SavitchIn.readLineInt();
					
					while(bet > balance)
					{
						System.out.println("\nYour bet is more than your balance! Try again.");
						bet = SavitchIn.readLineInt();
					}
					
					System.out.println("\nPress 'p' to play the slots!");
					p = SavitchIn.readLineNonwhiteChar();
					
					while(p != 'p' && p != 'P')
					{
						System.out.println("\nOops! You did not press 'p'! Try again.");
						p = SavitchIn.readLineNonwhiteChar();
					}
					
					real1 = (int)(Math.random() * 10 + 0);
					real2 = (int)(Math.random() * 10 + 0);
					real3 = (int)(Math.random() * 10 + 0);
					
					System.out.println("\nFIRST NUMBER: " + real1 + "");
					try{
					Thread.sleep(1000);       
					}catch(InterruptedException ie){
					ie.printStackTrace();
					}
					
					System.out.println("\nSECOND NUMBER: " + real2 + "");
					try{
					Thread.sleep(1000); 
					}catch(InterruptedException ie){
					ie.printStackTrace();
					}
					
					System.out.println("\nTHIRD NUMBER: " + real3 + "");
					try{
					Thread.sleep(500); 
					}catch(InterruptedException ie){
					ie.printStackTrace();
					}
					
					if(real1 == 7 && real1 == 2 && real2 == real3)
					{
						System.out.println("\nYou won the grand prize! You won $" + (1000 * bet) + "!");
						balance = balance + (999 * bet);
					}
					else if(real1 == real2 && real2 == real3)
					{
						System.out.println("\nYou got all three to match! You won $" + (100 * bet) + "!");
						balance = balance + (99 * bet);
					}
					else if(real1 == real2 || real2 == real3 || real3 == real1)
					{
						System.out.println("\nYou got two to match! You won $" + (4 * bet) + "!");
						balance = balance + (3 * bet);
					}
					else
					{
						System.out.println("\nYou won nothing. Sorry!");
						balance = balance - bet;
					}
					
					System.out.println("\nYou have $" + balance + " remaining in your account!");
					if(balance == 0)
					{
						System.out.println("\nYou are not allowed to gamble anymore!");
						break;
					}
					else
					{
						System.out.println("\nWould you like to play again? Please enter 'y' or 'n'.");
						answer = SavitchIn.readLineNonwhiteChar();
						
						while(answer != 'y' && answer != 'Y' && answer != 'n' && answer != 'N')
						{
							System.out.println("\nInvalid answer! Try again.");
							answer = SavitchIn.readLineNonwhiteChar();
						}
					}

				} while(answer == 'y' || answer == 'Y');
				
				if(answer == 'n' || answer == 'N')
				{
					System.out.println("\nWould you like to play another game? Please enter 'y' or 'n'.");
					anotherGame = SavitchIn.readLineNonwhiteChar();
					
					while(anotherGame != 'y' && anotherGame != 'Y' && anotherGame != 'n' && anotherGame != 'N')
					{
						System.out.println("\nInvalid answer. Try again.");
						anotherGame = SavitchIn.readLineNonwhiteChar();
					}
				}
			}
			else if(game == 'c' || game == 'C') /////////////////////////// WAR /////////////////////////////////////
			{
				anotherGame = ' ';
				answer = ' ';
				int card = 0;
				int compCard = 0;
				String royals = "";
				String royalsD = "";
				int computer = 0;
				int player = 0;
				
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
						
						if(card == 11)
						{
							royals = "JACK";
						}
						if(compCard == 11)
						{
							royalsD = "JACK";
						}
										
						if(card == 12)
						{
							royals = "QUEEN";
						}
						if(compCard == 12)
						{
							royalsD = "QUEEN";
						}
												
						if(card == 13)
						{
							royals = "KING";
						}
						if(compCard == 13)
						{
							royalsD = "KING";
						}
						
						if(card == 14)
						{
							royals = "ACE";
						}
						if(compCard == 14)
						{
							royalsD = "ACE";
						}
						
						if((card == 11 || card == 12 || card == 13 || card == 14) && (compCard == 11 || compCard == 12 || compCard == 13 || compCard == 14))
						{
							System.out.println("\nYOUR CARD: " + royals + " \nTHE COMPUTER'S CARD: " + royalsD + "");
						}
						else if(card == 11 || card == 12 || card == 13 || card == 14)
						{
							System.out.println("\nYOUR CARD: " + royals + " \nTHE COMPUTER'S CARD: " + compCard + "");
						}
						else if(compCard == 11 || compCard == 12 || compCard == 13 || compCard == 14)
						{
							System.out.println("\nYOUR CARD: " + card + " \nTHE COMPUTER'S CARD: " + royalsD + "");
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
						System.out.println("\nYour balance is now $" + balance + ". Would you like to play again? Please enter 'y' or 'n'.");
						answer = SavitchIn.readLineNonwhiteChar();
						
						while(answer != 'y' && answer != 'Y' && answer != 'n' && answer != 'N')
						{
							System.out.println("\nInvalid answer. Try again.");
							answer = SavitchIn.readLineNonwhiteChar();
						}	
					}
					
				} while(answer == 'y' || answer == 'Y');
				
				if(answer == 'n' || answer == 'N')
				{
					System.out.println("\nWould you like to play another game? Please enter 'y' or 'n'.");
					anotherGame = SavitchIn.readLineNonwhiteChar();
					
					while(anotherGame != 'y' && anotherGame != 'Y' && anotherGame != 'n' && anotherGame != 'N')
					{
						System.out.println("\nInvalid answer. Try again.");
						anotherGame = SavitchIn.readLineNonwhiteChar();
					}
				}
			}
			else if(game == 'd' || game == 'D') /////////////////////////////////// ROULETTE /////////////////////////
			{
				anotherGame = ' ';
				answer = ' ';
				int ball = 0;
				char betAnswer = ' ';
				int individual = 0;
				char evenOdd = ' ';
				int eighteen = 0;
				int twelve = 0;
				int columns = 0;
				
				do
				{
					System.out.println("Please enter your bet! It cannot be higher than your current balance: $" + balance + ".");
					bet = SavitchIn.readLineInt();
					
					while(bet > balance)
					{
						System.out.println("\nThat is higher than your balance! Try again.");
						bet = SavitchIn.readLineInt();
					}
					
					ball = (int)(Math.random() * 37 + 0);
					
					System.out.println("\nHow do you want to bet? \nA) Individual number \nB) Even/Odd \nC) First 18/Second 18 \nD) First 12/Second 12/Third12 \nE) Columns");
					betAnswer = SavitchIn.readLineNonwhiteChar();
					
					while(betAnswer != 'A' && betAnswer != 'a' && betAnswer != 'B' && betAnswer != 'b' && betAnswer != 'C' && betAnswer != 'c' && betAnswer != 'D' && betAnswer != 'd' && betAnswer != 'E' &&betAnswer != 'e')
					{
						System.out.println("\nInvalid answer. Try again.");
						betAnswer = SavitchIn.readLineNonwhiteChar();
					}
					
					if(betAnswer == 'A' || betAnswer == 'a') ///////////////////////////////// INDIVIDUAL //////////////////////////////
					{
						System.out.println("\nWhich individual number would you like to bet on?");
						individual = SavitchIn.readLineInt();
						
						while(individual > 36 || individual < 1)
						{
							System.out.println("\nInvalid answer! Try again.");
							individual = SavitchIn.readLineInt();
						}
						
						if(ball == individual)
						{
							balance = balance + (bet * 35);
						}
						else
						{
							balance = balance - bet;
						}
					}
					else if(betAnswer == 'B' || betAnswer == 'b') ///////////////////////////////////////////// EVENODD //////////////////////
					{
						System.out.println("\nDo you want to bet even or odd? Please enter 'e' for even and 'o' for odd.");
						evenOdd = SavitchIn.readLineNonwhiteChar();
						
						while(evenOdd != 'e' && evenOdd != 'E' && evenOdd != 'O' && evenOdd != 'o')
						{
							System.out.println("\nInvalid answer! Try again.");
							evenOdd = SavitchIn.readLineNonwhiteChar();
						}
						
						if(evenOdd == 'e' || evenOdd == 'E')
						{
							if(ball % 2 == 0 && ball != 0)
							{
								balance = balance + bet;
							}
							else
							{
								balance = balance - bet;
							}
						}
						else
						{
							if(ball % 2 == 1)
							{
								balance = balance + bet;
							}
							else
							{
								balance = balance - bet;
							}
						}
					}
					else if(betAnswer == 'C' || betAnswer == 'c') ////////////////////////////////// EIGHTEENS /////////////////////////
					{
						System.out.println("\nWould you like to bet on the first or second 18? Please enter '1' for the first 18 and '2' for the second 18.");
						eighteen = SavitchIn.readLineInt();
						
						while(eighteen != 1 && eighteen != 2)
						{
							System.out.println("\nInvalid answer! Try again.");
							eighteen = SavitchIn.readLineInt();
						}
						
						if(eighteen == 1)
						{
							for(int x = 1; x < 18; x++)
							{
								if(ball == x)
								{
									balance = balance + bet;
									break;
								}
								
								if(x == 18 && ball != x)
								{
									balance = balance - bet;
								}
							}
						}
						else
						{
							for(int y = 19; y < 36; y++)
							{
								if(ball == y)
								{
									balance = balance + bet;
									break;
								}
								
								if(y == 36 && ball != y)
								{
									balance = balance - bet;
								}
							}
						}
					}
					else if(betAnswer == 'D' || betAnswer == 'd') ////////////////////////////////// TWELVES //////////////////////////
					{
						System.out.println("\nWould you like to bet on the first, second, or third 12? Please enter '1' for the first, '2' for the second, or '3' for the third.");
						twelve = SavitchIn.readLineInt();
						
						while(twelve != 1 && twelve != 2 && twelve != 3)
						{
							System.out.println("\nInvalid answer! Try again.");
							twelve = SavitchIn.readLineInt();
						}
						
						if(twelve == 1)
						{
							for(int z = 1; z < 12; z++)
							{
								if(ball == z)
								{
									balance = balance + (bet * 2);
								}
								
								if(z == 12 && ball != z)
								{
									balance = balance - bet;
								}
							}
						}
						else if(twelve == 2)
						{
							for(int w = 13; w < 24; w++)
							{
								if(ball == w)
								{
									balance = balance + (bet * 2);
								}
								
								if(w == 24 && ball != w)
								{
									balance = balance - bet;
								}
							}
						}
						else
						{
							for(int a = 25; a < 36; a++)
							{
								if(ball == a)
								{
									balance = balance + (bet * 2);
								}
								
								if(a == 36 && ball != a)
								{
									balance = balance - bet;
								}
							}	
						}
					}
					else if(betAnswer == 'E' || betAnswer == 'e') ////////////////////////////////////// COLUMNS /////////////////////////
					{
						System.out.println("\nWhich column would you like to bet on? Please enter '1' for the first, '2' for the second, or '3' for the third.");
						columns = SavitchIn.readLineInt();
						
						while(columns != 1 && columns != 2 && columns != 3)
						{
							System.out.println("\nThat is not possible! Bet again.");
							individual = SavitchIn.readLineInt();
						}
		
						if(columns == 1)
						{
							if(ball % 3 == 1)
							{
								balance = balance + (bet * 2);
							}
							else
							{
								balance = balance - bet;
							}
						}
						else if(columns == 2)
						{
							if(ball % 3 == 2)
							{
								balance = balance + (bet * 2);
							}
							else
							{
								balance = balance - bet;
							}
						}
						else
						{
							if(ball % 3 == 0)
							{
								balance = balance + (bet * 2);
							}
							else
							{
								balance = balance - bet;
							}
						}
					}
					
					System.out.println("\nThe ball is rolling...");
					try{
					Thread.sleep(2000); 
					}catch(InterruptedException ie){
					ie.printStackTrace();
					}
					
					if(ball == 37)
					{
						System.out.println("\nThe ball landed on '00'!");
					}
					else
					{
						System.out.println("\nThe ball is " + ball + "!");
					}
		
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
				} while(answer == 'Y' || answer == 'y');
				
				if(answer == 'n' || answer == 'N')
				{
					System.out.println("\nWould you like to play another game? Please enter 'y' or 'n'.");
					anotherGame = SavitchIn.readLineNonwhiteChar();
					
					while(anotherGame != 'y' && anotherGame != 'Y' && anotherGame != 'n' && anotherGame != 'N')
					{
						System.out.println("\nInvalid answer. Try again.");
						anotherGame = SavitchIn.readLineNonwhiteChar();
					}
				}
			}
			else /////////////////////////////////////////// BLACKJACK ///////////////////////////////////////////////
			{
				int wins = 0;
				int loss = 0;
				
				do
				{
					anotherGame = ' ';
					answer = ' ';
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
					int hits = 0;
					int blackjacks = 0;
					
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
						blackjacks++;
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
							hits++;
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
					
					if(pTotal <= 21 && blackjacks == 0)
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
					else if(pTotal > dTotal && hits == 0)
					{
						System.out.println("\nYou won! Congrats!");
						balance = balance + bet;
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
				
				if(answer == 'n' || answer == 'N')
				{
					System.out.println("\nWould you like to play another game? Please enter 'y' or 'n'.");
					anotherGame = SavitchIn.readLineNonwhiteChar();
					
					while(anotherGame != 'y' && anotherGame != 'Y' && anotherGame != 'n' && anotherGame != 'N')
					{
						System.out.println("\nInvalid answer. Try again.");
						anotherGame = SavitchIn.readLineNonwhiteChar();
					}
				}		
			}
		} while(anotherGame == 'y' || anotherGame == 'Y');
	}
}