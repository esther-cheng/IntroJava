public class HighLowGame
{
	public static void main(String[] args)
	{
		int x = 0;
		int guess = 0;
		int amount = 0;
		String answer = "";
		
		do
		{
			x = (int)(Math.random() * 200 + 1);
			do
			{
				System.out.println("Guess the number! It is between 1 and 200, inclusive.");
				guess = SavitchIn.readLineInt();
			
				while(guess < 1 || guess > 200)
				{
					System.out.println("\nThat number is not between 1 and 200! Try again.");
					guess = SavitchIn.readLineInt();
				}
			
				if(guess > x)
				{
					System.out.println("\nThat number is too high!");
				}	
							
				if(guess < x)
				{
					System.out.println("\nThat number is too low!");
				}	
			
				System.out.println("");
				amount++;
				
			} while(guess != x);
				
			System.out.println("That is right! That took you " + amount + " guess(es).");
			System.out.println("\nDo you want to play again? Please answer \"yes\" or \"no\".");
			answer = SavitchIn.readLine();
			
		} while(answer.equalsIgnoreCase("yes"));
	}
}
		
		
		
		