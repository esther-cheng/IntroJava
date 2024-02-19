public class Division
{
	public static void main(String[] args)
	{
		double answer1 = 0;
		double answer2 = 0;
		double remainder = 0;
		double answer3 = 0;
		double division1 = 0;
		double division2 = 0;
		System.out.println("Please enter two numbers.");
		answer1 = SavitchIn.readLineDouble();
		answer2 = SavitchIn.readLineDouble();
		
		remainder = (answer1 % answer2);
		
		System.out.println("The remainder if you divide " + (int)answer1 + " by " + (int)answer2 + " is " + remainder + ".");
		
		if (remainder == 0)
		{
			System.out.println("\nThose two numbers are divisible!");
		}
		else
		{
			System.out.println("\nThose two numbers are not divisible. :(");
		}
		
		System.out.println("\nPlease enter a third number.");
		answer3 = SavitchIn.readLineDouble();
		division1 = answer3/100;
		division2 = answer3/10;
		
		System.out.println("\n" + (int)answer3 + " divided by 100 is " + division1 + ".");
		System.out.println("\n" + (int)answer3 + " divided by 10 is " + division2 + ".");
	}
}