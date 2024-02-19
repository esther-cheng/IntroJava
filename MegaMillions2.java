public class MegaMillions2
{
	public static void main(String[] args)
	{
		int money = 0;
		int jackpot = 0;
		int tries = 0;
		int budget = 0;
		int total = 0;
		char answer = ' ';
		int one = 0;
		int two = 0;
		int three = 0;
		int four = 0;
		int five = 0;
		int zero = 0;
		int megaBall0 = 0;
		int megaBall1 = 0;
		int megaBall2 = 0;
		int megaBall3 = 0;
		int megaBall4 = 0;
		int jackpots = 0;
		double finalTotal = 0;
	
		while(jackpot == 0)
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
			choice1 = (int)(Math.random() * 70 + 1);
			choice2 = (int)(Math.random() * 70 + 1);
			while(choice2 == choice1)
			{
				choice2 = (int)(Math.random() * 70 + 1);
			}
			
			choice3 = (int)(Math.random() * 70 + 1);
			while(choice3 == choice2 || choice3 == choice1)
			{
				choice3 = (int)(Math.random() * 70 + 1);
			}
			
			choice4 = (int)(Math.random() * 70 + 1);
			while(choice4 == choice3 || choice4 == choice2 || choice4 == choice2 || choice4 == choice1)
			{
				choice4 = (int)(Math.random() * 70 + 1);
			}
			
			choice5 = (int)(Math.random() * 70 + 1);
			while(choice5 == choice4 || choice5 == choice3 || choice5 == choice2 || choice5 == choice1)
			{
				choice5 = (int)(Math.random() * 70 + 1);
			}
			
			megaBallGuess = (int)(Math.random() * 25 + 1);
		///////////////////////////////////////////////////////////////////////// PRINTING CHOICES //////////////
//			System.out.println("YOUR CHOICES: " + choice1 + ", " + choice2 + ", " + choice3 + ", " + choice4 + ", " + choice5 + "");
//			System.out.println("MEGABALL CHOICE: " + megaBallGuess + "");
			
		//////////////////////////////////////////////////////////////////////////// PRINTING THE REAL NUMBERS ///////////////
/*
			System.out.println("\nTHE FIRST BALL IS: " + real1 + "");
			
			System.out.println("\nTHE SECOND BALL IS: " + real2 + "");
			
			System.out.println("\nTHE THIRD BALL IS: " + real3 + "");
			
			System.out.println("\nTHE FOURTH BALL IS: " + real4 + "");
			
			System.out.println("\nTHE FIFTH BALL IS: " + real5 + "");

			System.out.println("\nAND THE MEGABALL IS: " + megaBall + "");
*/
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
			
//			System.out.println("\nYou got " + numbers + " numbers right!");
			if(megaBallGuess == megaBall)
			{
//				System.out.println("\nYou got the megaBall!");
				megaBalls++;
			}
			else
			{
//				System.out.println("\nYou did not get the megaBall.");
			}
		///////////////////////////////////////////////////////////////////////// MONEY ///////////////////////////////
			if(megaBalls == 1 && numbers == 0)
			{
				money = 2;
				megaBall0++;
			}
			else if(megaBalls == 0 && numbers == 1)
			{
				money = 0;
				one++;
			}
			else if(megaBalls + numbers == 0)
			{
				money = 0;
				zero++;
			}
			else if(megaBalls == 1 && numbers == 1)
			{
				money = 4;
				megaBall1++;
				
			}
			else if(megaBalls == 1 && numbers == 2)
			{
				money = 10;
				megaBall2++;
			}
			else if(megaBalls == 0 && numbers == 3)
			{
				money = 10;
				three++;
			}
			else if(megaBalls == 1 && numbers == 3)
			{
				money = 200;
				megaBall3++;
			}
			else if(megaBalls == 0 && numbers == 4)
			{
				money = 500;
				four++;
			}
			else if(megaBalls == 1 && numbers == 4)
			{
				money = 10000;
				megaBall4++;
			}
			else if(megaBalls == 0 && numbers == 5)
			{
				money = 1000000;
				five++;
			}
			else if(megaBalls == 1 && numbers == 5)
			{
				jackpot++;
			}
			
			if(jackpot > 0)
			{
				System.out.println("\nYou won the jackpot!");
				money = 50000000;
				jackpots++;
			}
			
//			System.out.println("\nYou won $" + money + "!");
			finalTotal = finalTotal + money;
		}
			
			System.out.println("\n5 + MegaBall = " + jackpots + " times");
			System.out.println("\n5 + No MB = " + five + " times");
			System.out.println("\n4 + MegaBall = " + megaBall4 + " times");
			System.out.println("\n4 + No MB = " + four + " times");
			System.out.println("\n3 + MegaBall = " + megaBall3 + " times");
			System.out.println("\n3 + No MB = " + three + " times");
			System.out.println("\n2 + MegaBall = " + megaBall2 + " times");
			System.out.println("\n1 + MegaBall = " + megaBall1 + " times");
			System.out.println("\n1 + No MB = " + one + " times");
			System.out.println("\n0 + MegaBall = " + megaBall0 + " times");
			System.out.println("\n0 + No MB = " + zero + " times");
			
			System.out.println("\nWinnings: $" + (int)finalTotal);
			System.out.println("\nAverage winnnings: $"+ (finalTotal/1000) + " ");
	}
}
