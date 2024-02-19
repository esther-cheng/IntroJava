public class Words
{
	public static void main(String[] args)
	{
		String word = "";
		int length = 0;
		char answer = ' ';
		
		do
		{
			System.out.println("Please enter a word. It must be at least four letters long.");
			word = SavitchIn.readLine();
			while(word.length()<4)
			{
				System.out.println("\nThat word is too short. Try again.");
				word = SavitchIn.readLine();
			}
			
			if(word.charAt(0) == 'a' || word.charAt(0) == 'e' || word.charAt(0) == 'i' || word.charAt(0) == 'o' || word.charAt(0) == 'u')
			{
				System.out.println("\nThat word begins with a vowel.");
			}
			else if(word.equalsIgnoreCase("Brian"))
			{
				System.out.println("\nPeppers.");
			}
			else
			{
				System.out.println("\nThat word begins with a consonant.");
			}
			
			System.out.println("\nDo you want to enter another word? Answer 'y' or 'n'.");
			answer = SavitchIn.readLineNonwhiteChar();
			
		} while(answer == 'y' || answer == 'Y');
	}
}