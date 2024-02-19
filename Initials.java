public class Initials
{
	public static void main(String[] args)
	{
		String name = "";
		System.out.println("Please enter your full name with a space.");
		name = SavitchIn.readLine();
		name = name.toUpperCase();
		
		int length = 0;
		length = name.length();
		length = length - 1;
		
		System.out.println("\nThere are " + length + " characters in your name.");
		
		if (length % 2 == 0)
		{
			System.out.println("\nThat number is even.");
		}
		else 
		{
			System.out.println("\nThat number is odd.");
		}
		
		if (length % 3 == 0)
		{
			System.out.println("\nThat number is divisible by 3!");
		}
		else
		{
			System.out.println("\nThat number is not divisible by 3.");
		}
		
		char initial1 = ' ';
		char initial2 = ' ';
		int lastIndex = 0;
		initial1 = name.charAt(0);
		lastIndex = name.indexOf(" ");
		
		initial2 = name.charAt(lastIndex + 1);
		System.out.println("\nYour initials are " + initial1 + "." + initial2 + "..");
	}
}