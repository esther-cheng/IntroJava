public class Roulette
{
	public static void main(String[] args)
	{
		int balance = 100;
		int bet = 0;
		int ball = 0;
		char betAnswer = ' ';
		char answer = ' ';
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
							balance = balance + bet;
							break;
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
							balance = balance + bet;
							break;
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
							balance = balance + bet;
							break;
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
	}
}
