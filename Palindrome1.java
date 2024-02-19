public class Palindrome1
{
	public static void main(String[] args)
	{
		String word = "";
		String backwards = "";
		
		System.out.println("Please enter a word. It must be at least 5 letters.");
		word = SavitchIn.readLine();
		
		while(word.length() < 5)
		{
			System.out.println("\nThat word is too short! Try again.");
			word = SavitchIn.readLine();
		}
		
		for(int x = (word.length() - 1); x>=0; x--)
		{
			backwards = backwards + word.charAt(x);
		}
		
		System.out.println("\n" + backwards + "");
		
		if(word.equalsIgnoreCase(backwards))
		{
			System.out.println("\nThat word is a palindrome!");
		}
		else
		{
			System.out.println("\nThat word is not a palindrome!");
		}
	}
}