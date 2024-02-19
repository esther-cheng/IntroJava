public class PasswordGuess3
{
	public static void main(String[] args)
	{
		String password = "Shut$Down12";
		String guess = "";
		int guesses = 0;
		String to10 = "";
		int i = 0;
		int numbers = 0;
		String subNumber = "";
		
		do
		{
			System.out.println("Guess the password! It has between 8-12 characters, inclusive; one special character (the characters above #1-#8 on your keyboard); two numbers; and is case sensitive.");
			guess = SavitchIn.readLine();
			while(guess.length() < 8 || guess.length() > 12 && !(guess.equals(password)))
			{
				System.out.println("\nYour guess is not the right length! Try again.");
				guess = SavitchIn.readLine();
				guesses++;
			}
		
			while(guess.indexOf('!') == -1 && guess.indexOf('@') == -1 && guess.indexOf('#') == -1 && guess.indexOf('$') == -1 && guess.indexOf('%') == -1 && guess.indexOf('^') == -1 && guess.indexOf('&') == -1 && guess.indexOf('*') == -1 && !(guess.equals(password)))
			{
				System.out.println("\nYour guess does not have a special character! Try again.");
				guess = SavitchIn.readLine();
				guesses++;
			}
			
			to10 = "1234567890";
			while(i<to10.length() && !(guess.equals(password)))
			{
				numbers = 0;
				if(guess.indexOf(to10.charAt(i)) != -1)
				{
					numbers++;
					subNumber = guess.substring(i,guess.length());
					if(subNumber.indexOf(to10.charAt(i)) != -1)
					{
						numbers++;
					}
					guesses++;
				}
				
				if(numbers == 1 || numbers == 0 && !(guess.equals(password)))
				{
					System.out.println("\nYour guess does not have the right amount of numbers! Try again.");
					guess = SavitchIn.readLine();
				}
				else
				{
					System.out.println("\nThat is incorrect! Try again.");
					guess = SavitchIn.readLine();
				}
				i++;
			}
			
			if(guess.equals(password))
			{
				System.out.println("\nThat is correct!");
				break;
			}		
			
		} while(!(guess.equals(password)));
			
		if(guesses<5)
		{
			System.out.println("That took you less than five tries! Good job!");
		}
		else
		{
			System.out.println("That took five or more guesses. You suck.");
		}
	}
}
		