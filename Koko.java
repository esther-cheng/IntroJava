public class Koko
{
	public static void main(String[] args)
	{
		String teacher = "";
		int t = 0;
		int vowels = 0;
		int consonants = 0;
		
		System.out.println("Please enter the full name of your favorite teacher.");
		teacher = SavitchIn.readLine();
		
		System.out.println("\n");
		
		while(teacher.length() < 6)
		{
			System.out.println("That name is too short! Try again.\n");
			teacher = SavitchIn.readLine();
		}
		
		if(teacher.equalsIgnoreCase("Koko Lampino"))
		{
			System.out.println("You suck.\n");
		}
		
		for(int x = 0; x <= (teacher.length() - 1); x++)
		{
			System.out.println(teacher.charAt(x));
			if(teacher.charAt(x) == 't' || teacher.charAt(x) == 'T')
			{
				t++;
			}
			
			if(teacher.charAt(x) == 'a' || teacher.charAt(x) == 'e' || teacher.charAt(x) == 'i' || teacher.charAt(x) == 'o' || teacher.charAt(x) == 'u' || teacher.charAt(x) == 'A' || teacher.charAt(x) == 'E' || teacher.charAt(x) == 'I' || teacher.charAt(x) == 'O' || teacher.charAt(x) == 'U')
			{
				vowels++;
			}
			else
			{
				consonants++;
			}
		}
		
		System.out.println("\nThere are " + t + " 't's, " + vowels + " vowels, and " + (consonants - 1) + " consonants in " + teacher + ".");
		
		if((consonants - 1) % 4 == 0)
		{
			System.out.println("\nThe number of consonants is divisible by four!");
		}
		else
		{
			System.out.println("\nThe number of consonants is not divisible by four!");
		}
		
		System.out.println("\nThe last letter of " + teacher.substring(0,teacher.indexOf(' ')) + " is " + teacher.charAt(teacher.indexOf(' ') - 1) + ".");
		System.out.println("\nThe last letter of " + teacher.substring((teacher.indexOf(' ') + 1),teacher.length()) + " is " + teacher.charAt(teacher.length() - 1) + ".");
	
	
	}
}
		