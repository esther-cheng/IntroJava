public class SlotMachine
{
	public static void main(String[] args)
	{
		int real1 = 0;
		int real2 = 0;
		int real3 = 0;
		char answer = ' ';
		int balance = 100;
		int bet = 0;
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
			
			System.out.println("");
		} while(answer == 'y' || answer == 'Y');
	}
}	
		
				