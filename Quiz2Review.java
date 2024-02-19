public class Quiz2Review
{
	public static void main(String[] args)
	{
		String name = "";
		String birthplace = "";
		int time = 0;
		System.out.println("Please enter your full name.");
		name = SavitchIn.readLine();
		
		System.out.println("\nHello, " + name + "!");
		
		System.out.println("\nWhat town/city were you born in?");
		birthplace = SavitchIn.readLine();
		
		if(birthplace.equalsIgnoreCase("Buckingham"))
		{
			System.out.println("\nThat's so cool!");
		}
		else
		{
			System.out.println("\nYou suck.");
		}
		
		System.out.println("\nHow long does it take you to get to school in the morning? Please enter an integer.");
		time = SavitchIn.readLineInt();
		
		if(time < 5 || time > 20)
		{
			System.out.println("\nThat time is unusual.");
		}
		else
		{
			System.out.println("\nThat time is normal.");
		}
		
		char char4 = ' ';
		int length = 0;
		int location = 0;
		char4 = birthplace.charAt(4);
		length = birthplace.length();
		location = birthplace.indexOf('t');
		
		System.out.println("\nThe fifth character in " + birthplace + " is " + char4 + ".");
		System.out.println("\n" + birthplace + " is " + length + " characters long.");
		
		if (location > -1)
		{
			System.out.println("\nThe first 't' is located at " + location + ".");
		}
		else
		{
			System.out.println("\nThere is no 't' in " + birthplace + ".");
		}
		
		int  houseNumber = 0;
		System.out.println("\nPlease enter your house address number.");
		houseNumber = SavitchIn.readLineInt();
		
		if(houseNumber % 3 == 0)
		{
			System.out.println("\nThat number is divisible by 3!");
		}
		else
		{
			System.out.println("\nThat number is not divisible by 3.");
		}
	}
}
		
		
		