public class Fruit
{
	public static void main(String[] args)
	{
		int answer = 0;
		System.out.println("Please enter an integer.");
		answer = SavitchIn.readLineInt();
		
		if (answer % 2 == 0 && answer > 17)
		{
			System.out.println("Rhubarb.");
		}
		else if (answer % 2 == 1 || answer < 10)
		{
			System.out.println("Banana.");
		}
		else
		{
			System.out.println("Invalid answer.");
		}
	}
}