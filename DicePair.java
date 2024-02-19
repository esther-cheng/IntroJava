public class DicePair
{
	public static void main(String[] args)
	{
		int x = 0;
		int y = 0;
		double equals7 = 0;
		int snakeEyes = 0;
		int hardEight = 0;
		int easyEight = 0;
		int greaterX = 0;
		double percent = 0;
		
		for(int w = 1; w <= 50; w++)
		{
			x = (int)(Math.random() * 6 + 1);
			y = (int)(Math.random() * 6 + 1);
			System.out.println("You rolled a " + x + " and a " + y + ".");
			
			if(x + y == 7)
			{
				equals7++;
			}
			
			if(x == y)
			{
				if(x == 1)
				{
					snakeEyes++;
				}
				else if(x == 4)
				{
					hardEight++;
				}
			}
			
			if((x + y) == 8 && x != 4)
			{
				easyEight++;
			}
			
			if(x > y)
			{
				greaterX++;
			}
			
			percent = (equals7/w) * 100;
		}
		
		System.out.println("\nThe sum of your roll was 7 " + percent + "% of the rolls.");
		System.out.println("\nYou rolled snake eyes " + snakeEyes + " times, an easy eight " + easyEight + " times, and a hard eight " + hardEight + " times.");
		System.out.println("\nThe first number was bigger " + greaterX + " times.");
	}
}