public class Primes
{
	public static void main(String[] args)
	{
		int answer = 0;
		System.out.println("Please enter an integer between 1 and 20.");
		answer = SavitchIn.readLineInt();
		
		if (answer < 1 || answer > 20)
		{
			System.out.println("Invalid answer.");
		}
		else if (answer == 1 || (answer % 3 == 0 && answer != 3))
		{
			System.out.println("That number is not prime!");
		}
		else if (answer == 2 || answer % 2 == 1)
		{
			System.out.println("That number is prime!");
		}
		else
		{
			System.out.println("That is not correct.");
		}
	}
}