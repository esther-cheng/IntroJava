public class Names
{
	public static void main(String[] args)
	{
		String firstName = "";
		String lastName = "";
		
		System.out.println("Please enter your first name.");
		firstName = SavitchIn.readLine();
		
		System.out.println("\nPlease enter your last name.");
		lastName = SavitchIn.readLine();
		
		if (firstName.equalsIgnoreCase("Quinn") || lastName.equalsIgnoreCase("Quinn"))
		{
			System.out.println("\nYou're amazing!");
		}
		else
		{
			System.out.println("\nYou suck.");
		}
		
		char thirdFirst = ' ';
		thirdFirst = firstName.charAt(2);
		System.out.println("\nThe third letter in your first name is " + thirdFirst + ".");
		
		int length = 0;
		length = lastName.length();
		length = length - 1;
		
		char lastLast = ' ';
		lastLast = lastName.charAt(length);
		System.out.println("\nThe last letter in your last name is " + lastLast + ".");
	}
}
