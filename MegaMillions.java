public class MegaMillions
{
	public static void main(String[] args)
	{
		int real1 = 0;
		int real2 = 0;
		int real3 = 0;
		int real4 = 0;
		int real5 = 0;
		int megaBall = 0;
		int megaBallGuess = 0;
		int choice1 = 0;
		int choice2 = 0;
		int choice3 = 0;
		int choice4 = 0;
		int choice5 = 0;
		int megaBalls = 0;
		int numbers = 0;
		int money = 0;
		int jackpot = 0;
		int tries = 0;
		int budget = 0;
		int total = 0;
		char answer = ' ';
	
		do
		{
			real1 = (int)(Math.random() * 70 + 1);
			real2 = (int)(Math.random() * 70 + 1);
			while(real2 == real1)
			{
				real2 = (int)(Math.random() * 70 + 1);
			}
			
			real3 = (int)(Math.random() * 70 + 1);
			while(real3 == real2 || real3 == real1)
			{
				real3 = (int)(Math.random() * 70 + 1);
			}
			
			real4 = (int)(Math.random() * 70 + 1);
			while(real4 == real3 || real4 == real2 || real4 == real2 || real4 == real1)
			{
				real4 = (int)(Math.random() * 70 + 1);
			}
			
			real5 = (int)(Math.random() * 70 + 1);
			while(real5 == real4 || real5 == real3 || real5 == real2 || real5 == real1)
			{
				real5 = (int)(Math.random() * 70 + 1);
			}
			
			megaBall = (int)(Math.random() * 25 + 1);
			
		///////////////////////////////////////////////////////////////// FINDING CHOICES //////////////////////////////
			System.out.println("Please enter choice #1. It must be between 1 and 70, inclusive.");
			choice1 = SavitchIn.readLineInt();
			while(choice1 > 70 || choice1 < 1)
			{
				System.out.println("\nThat is not between 1 and 70! Try again.");
				choice1 = SavitchIn.readLineInt();
			}
		/////////////////////////////////////////////////////////////////////////////////////////////////////////		
			System.out.println("\nPlease enter choice #2. It must be between 1 and 70, inclusive.");
			choice2 = SavitchIn.readLineInt();
			while(choice2 > 70 || choice2 < 1)
			{
				System.out.println("\nThat is not between 1 and 70! Try again.");
				choice2 = SavitchIn.readLineInt();
			}
			
			while(choice2 == choice1)
			{
				System.out.println("\nInvalid answer. Try again.");
				choice2 = SavitchIn.readLineInt();
			}
		///////////////////////////////////////////////////////////////////////////////////////////////////////////////		
			System.out.println("\nPlease enter choice #3. It must be between 1 and 70, inclusive.");
			choice3 = SavitchIn.readLineInt();
			while(choice3 > 70 || choice3 < 1)
			{
				System.out.println("\nThat is not between 1 and 70! Try again.");
				choice1 = SavitchIn.readLineInt();
			}
			
			while(choice3 == choice2 || choice3 == choice1)
			{
				System.out.println("\nInvalid answer. Try again.");
				choice3 = SavitchIn.readLineInt();
			}
		////////////////////////////////////////////////////////////////////////////////////////////////////////////		
			System.out.println("\nPlease enter choice #4. It must be between 1 and 70, inclusive.");
			choice4 = SavitchIn.readLineInt();
			while(choice4 > 70 || choice4 < 1)
			{
				System.out.println("\nThat is not between 1 and 70! Try again.");
				choice1 = SavitchIn.readLineInt();
			}
			
			while(choice4 == choice3 || choice4 == choice2 || choice4 == choice1)
			{
				System.out.println("\nInvalid answer. Try again.");
				choice4 = SavitchIn.readLineInt();
			}
		//////////////////////////////////////////////////////////////////////////////////////////////////////////////
			System.out.println("\nPlease enter choice #5. It must be between 1 and 70, inclusive.");
			choice5 = SavitchIn.readLineInt();
			while(choice5 > 70 || choice5 < 1)
			{
				System.out.println("\nThat is not between 1 and 70! Try again.");
				choice1 = SavitchIn.readLineInt();
			}
			
			while(choice5 == choice4 || choice5 == choice3 || choice5 == choice2 || choice5 == choice1)
			{
				System.out.println("\nInvalid answer. Try again.");
				choice5 = SavitchIn.readLineInt();
			}
		/////////////////////////////////////////////////////////////////////////////////////////////////////////////////		
			System.out.println("Please enter your choice for the Megaball. You can only pick one number between 1 and 25, inclusive.");
			megaBallGuess = SavitchIn.readLineInt();
			
			while(megaBallGuess < 1 || megaBallGuess > 25)
			{
				System.out.println("That is not between 1 and 25! Try again.");
				megaBallGuess = SavitchIn.readLineInt();
			}
		///////////////////////////////////////////////////////////////////////// PRINTING CHOICES //////////////
			System.out.println("YOUR CHOICES: " + choice1 + ", " + choice2 + ", " + choice3 + ", " + choice4 + ", " + choice5 + "");
			System.out.println("MEGABALL CHOICE: " + megaBallGuess + "");
			
		//////////////////////////////////////////////////////////////////////////// PRINTING THE REAL NUMBERS ///////////////
			System.out.println("\nTHE FIRST BALL IS: " + real1 + "");
			try{
			Thread.sleep(3000);        // 3000 = 3 second delay
			}catch(InterruptedException ie){
			ie.printStackTrace();
			}
			
			System.out.println("\nTHE SECOND BALL IS: " + real2 + "");
			try{
			Thread.sleep(3000);        // 3000 = 3 second delay
			}catch(InterruptedException ie){
			ie.printStackTrace();
			}
			
			System.out.println("\nTHE THIRD BALL IS: " + real3 + "");
			try{
			Thread.sleep(3000);        // 3000 = 3 second delay
			}catch(InterruptedException ie){
			ie.printStackTrace();
			}
			
			System.out.println("\nTHE FOURTH BALL IS: " + real4 + "");
			try{
			Thread.sleep(3000);        // 3000 = 3 second delay
			}catch(InterruptedException ie){
			ie.printStackTrace();
			}
			
			System.out.println("\nTHE FIFTH BALL IS: " + real5 + "");
			try{
			Thread.sleep(3000);        // 3000 = 3 second delay
			}catch(InterruptedException ie){
			ie.printStackTrace();
			}
			
			System.out.println("\nAND THE MEGABALL IS: " + megaBall + "");
			
			if(choice1 == real1 || choice1 == real2 || choice1 == real3 || choice1 == real4 || choice1 == real5)
			{
				numbers++;
			}
			
			if(choice2 == real1 || choice2 == real2 || choice2 == real3 || choice2 == real4 || choice2 == real5)
			{
				numbers++;
			}
			
			if(choice3 == real1 || choice3 == real2 || choice3 == real3 || choice3 == real4 || choice3 == real5)
			{
				numbers++;
			}
			
			if(choice4 == real1 || choice4 == real2 || choice4 == real3 || choice4 == real4 || choice4 == real5)
			{
				numbers++;
			}
			
			if(choice5 == real1 || choice5 == real2 || choice5 == real3 || choice5 == real4 || choice5 == real5)
			{
				numbers++;
			}
			
			System.out.println("\nYou got " + numbers + " numbers right!");
			if(megaBallGuess == megaBall)
			{
				System.out.println("\nYou got the megaBall!");
				megaBalls++;
			}
			else
			{
				System.out.println("\nYou did not get the megaBall.");
			}
		///////////////////////////////////////////////////////////////////////// MONEY ///////////////////////////////
			if(megaBalls == 1 && numbers == 0)
			{
				money = 2;
			}
			else if(megaBalls == 0 && numbers == 1 || megaBalls + numbers == 0)
			{
				money = 0;
			}
			else if(megaBalls + numbers == 2)
			{
				money = 4;
			}
			else if(megaBalls + numbers == 3)
			{
				money = 10;
			}
			else if(megaBalls == 1 && numbers == 3)
			{
				money = 200;
			}
			else if(megaBalls == 0 && numbers == 4)
			{
				money = 500;
			}
			else if(megaBalls == 1 && numbers == 4)
			{
				money = 10000;
			}
			else if(megaBalls == 0 && numbers == 5)
			{
				money = 1000000;
			}
			else
			{
				jackpot = 1;
			}
			
			if(jackpot == 1)
			{
				System.out.println("\nYou won the jackpot!");
				money = 50000000;
			}
			else
			{
				System.out.println("\nYou won $" + money + "!");
			}
			
			tries++;
			budget = 100 - (tries * 2) + money;
			
			total = total + money;
			System.out.println("\nTotal winnings: $" + total + "");
			
			if(budget == 0)
			{
				System.out.println("\nYou are not allowed to gamble anymore!");
				break;
			}
			
			System.out.println("\nDo you want to play again? Please answer 'y' or 'n'.");
			answer = SavitchIn.readLineNonwhiteChar();
		} while(answer == 'y' || answer == 'Y');

	}
}
