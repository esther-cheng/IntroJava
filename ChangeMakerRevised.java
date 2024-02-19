public class ChangeMakerRevised
{

	public static void main(String[] args)
	{
		double value = 0;
		System.out.println("Please input a value to make change for. Do not use '$' signs. Include a decimal point.");
		value = SavitchIn.readLineDouble();
		value = value * 100;
		System.out.println("\nYou need " + (int)(value/25)+ " quarter(s), " + (int)((value % 25)/10) + " dime(s), " + (int)(((value % 25) % 10)/5) + " nickel(s), and " + (int)(((value % 25) % 10) % 5) + " penny(s).");
	}
}