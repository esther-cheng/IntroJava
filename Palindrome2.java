public class Palindrome2
{
	public static void main(String[] args)
	{
		String word = "";
		String wordWithoutPunctandSpaces = "";
		String backwards = "";
		
		System.out.println("Please enter a word/phrase. It must be at least 5 letters.");
		word = SavitchIn.readLine();
		
		while(word.length() < 5)
		{
			System.out.println("\nThat word is too short! Try again.");
			word = SavitchIn.readLine();
		}

		for(int x = 0; x < word.length(); x++)
		{
			if(word.charAt(x) == '"' || word.charAt(x) == ' ' || word.charAt(x) == '!' || word.charAt(x) == '?' || word.charAt(x) == ':' || word.charAt(x) == ';' || word.charAt(x) == ',' || word.charAt(x) == '.' || word.charAt(x) == '\'')
			{
				wordWithoutPunctandSpaces = wordWithoutPunctandSpaces;
			}
			else
			{
				wordWithoutPunctandSpaces = wordWithoutPunctandSpaces + word.charAt(x);
			}
		}
		
		for(int w = (wordWithoutPunctandSpaces.length() - 1); w>=0; w--)
		{
			backwards = backwards + wordWithoutPunctandSpaces.charAt(w);
		}
		
		System.out.println("\n" + wordWithoutPunctandSpaces + "");
		System.out.println("\n" + backwards + "");
		
		wordWithoutPunctandSpaces = wordWithoutPunctandSpaces.toLowerCase();
		if(wordWithoutPunctandSpaces.equalsIgnoreCase(backwards))
		{
			System.out.println("\n\""+ word + "\" is a palindrome!");
		}
		else
		{
			System.out.println("\n\"" + word + "\" is not a palindrome!");
		}
	}
}