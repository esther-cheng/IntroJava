public class Digits
{
	public static void main(String[] args)
	{
		int answer1 = 0;
		int digit1 = 0;
		int digit2 = 0;
		int digit3 = 0;
		
		System.out.println("Please enter a 3-digit number.");
		answer1 = SavitchIn.readLineInt();
		digit1 = answer1 / 100;
		digit2 = (answer1 % 100)/10;
		digit3 = (answer1 % 100 % 10);
		System.out.println("\n" + digit1 + " \n" + digit2 + " \n" + digit3 + "");
	}
}