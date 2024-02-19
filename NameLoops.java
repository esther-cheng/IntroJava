public class NameLoops
{
	public static void main(String[] args)
	{
		String name = "";
		int i = 0;
		int vowelNumber = 0;
		int consonants = 0;
		int letterK = 0;
		int spaces = 0;
		
		System.out.println("Please enter your full name all at once. There needs to be a space and must be at least 5 characters long (including the space).");
		name = SavitchIn.readLine();
		
		while(name.indexOf(' ') == -1)
		{
			System.out.println("\nYou do not have a space in your entry! Try again.");
			name = SavitchIn.readLine();
		}
		
		while(name.length() < 5)
		{
			System.out.println("\nYour entry is too short! Try again.\n");
			name = SavitchIn.readLine();
		}
		
		while(i < name.length())
		{
			System.out.println("" + name.charAt(i) + "\n");
			if(name.charAt(i) == 'a' || name.charAt(i) == 'e' || name.charAt(i) == 'i' || name.charAt(i) == 'o' || name.charAt(i) == 'u' || name.charAt(i) == 'A' || name.charAt(i) == 'E' || name.charAt(i) == 'I' || name.charAt(i) == 'O' || name.charAt(i) == 'U')
			{
				vowelNumber++;
			}
			else if(name.charAt(i) == ' ')
			{
				spaces++;
			}
			else
			{
				consonants++;
				if(name.charAt(i) == 'K' || name.charAt(i) == 'k')
				{
					letterK++;
				}
			}
			i++;
		}
		
		if(vowelNumber % 2 == 0) //number of vowels
		{
			System.out.println("There are " + vowelNumber + " vowels. That number is even!");
		}
		else
		{
			System.out.println("There are " + vowelNumber + " vowels. That number is odd!");
		}
		
		if(consonants % 2 == 0) //number of consonants
		{
			System.out.println("There are " + consonants + " consonants. That number is even!");
		}
		else
		{
			System.out.println("There are " + consonants + " consonants. That number is odd!");
		}
		
		if(letterK % 2 == 0) //number of 'k's
		{
			System.out.println("There are " + letterK + " k(s). That number is even!");
		}
		else
		{
			System.out.println("There are " + letterK + " k(s). That number is odd!");
		}
	}
}