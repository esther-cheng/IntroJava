public class PasswordGuess
{
	public static void main(String[] args)
	{
		String password = "Shut$Down12";
		String guess = "";
		int guesses = 0;
		String specialChar = "";
		int i = 0;
		String firstDigit = "";
		String substring = "";
		int j = 0;
		
		do
		{
			System.out.println("Guess the password! It has between 8-12 characters, inclusive; one special character (the characters above #1-#8 on your keyboard); two numbers; and is case sensitive.");
			guess = SavitchIn.readLine();
			
			// check the length
			while(guess.length() < 8 || guess.length() > 12)
			{
				System.out.println("\nYour guess is not the right length! Try again.");
				guess = SavitchIn.readLine();
				++guesses;
			}
			
			// check for special char	
			specialChar = "!@#$%^&*";
			
			while(i<specialChar.length())
			{
				System.out.println("\nspecialChar.charAt(i)=" + specialChar.charAt(i));
				System.out.println("\nguess.indexOf()=" + guess.indexOf(specialChar.charAt(i)));

				if (guess.indexOf(specialChar.charAt(i++)) >= 0)
				{
					System.out.println("\nfound a special char.");
					break;
				}

/********
				while(guess.indexOf(specialChar.charAt(i)) < 0)
				{
					System.out.println("\nYou do not have a special character in your guess! Try again.");
					guess = SavitchIn.readLine();
					++i;
					++guesses;
				}
***********/
			} // end while
			if (i == specialChar.length())
			{
				System.out.println("\nYou do not have a special character in your guess! Try again.");
				guess = SavitchIn.readLine();
				++guesses;
			}
			
			i = 0;
			
			// check for first digit
			firstDigit = "1234567890";
			while(i<firstDigit.length())
			{
				if (guess.indexOf(firstDigit.charAt(i)) >= 0)
				{
					System.out.println("\nfound a digit.");
					substring = guess.substring(i, guess.length());
					System.out.println("\nsubstring = " + substring);
						
					//check for second digit
					while(j<firstDigit.length())
					{
						if (substring.indexOf(firstDigit.charAt(j++)) >= 0)
						{
							System.out.println("\nfound a second digit.");
							break;
						}
					}
					if (j == firstDigit.length())
					{
						System.out.println("\nYou do not have a second digit in your guess! Try again.");
						guess = SavitchIn.readLine();
						++guesses;
					}
					++i;
				}
			}

			if (i == firstDigit.length())
			{
				System.out.println("\nYou do not have a digit in your guess! Try again.");
				guess = SavitchIn.readLine();
				++guesses;
			}
	
/********
				while(guess.indexOf(firstDigit.charAt(i)) > -1)
				{
					substring = guess.substring(guess.indexOf(i), guess.length());
					
					while(substring.charAt(j) != j)
					{
						System.out.println("You only have one number in your guess! Try again.");
						++guesses;
						++j;
					}
				}
**********/
			
			if(guess.equals(password))
			{
				System.out.println("\nThat is correct.\n");
				++guesses;
			}
			else
			{
				System.out.println("\nThat is incorrect.\n");
				++guesses;
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