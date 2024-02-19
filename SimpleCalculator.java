public class SimpleCalculator
{

	public static void main(String[] args)
	{
		String firstName = "";
		char mInitial = ' ';
		String lastName = "";
		double x = 0;
		double y = 0;
		double sum = 0;
		double difference = 0;
		double product = 0;
		double quotient = 0;
		
		System.out.println("What is your first name?");
		firstName = SavitchIn.readLine();
		
		System.out.println("\nWhat is your middle initial?");
		mInitial = SavitchIn.readLineNonwhiteChar();
		
		System.out.println("\nWhat is your last name?");
		lastName = SavitchIn.readLine();
		
		System.out.println("\nGood morning, " + firstName + " " + mInitial + ". " + lastName + "!");
		
		System.out.println("\nCould you give me two different numbers?");
		x = SavitchIn.readLineInt();
		y = SavitchIn.readLineInt();
		
		System.out.println("\nYou entered the numbers " + x + " and " + y + ".");
		
		sum = (int)x + (int)y;
		System.out.println("\n\n" + (int)x + " + " + (int)y + " = " + (int)sum + ".");
		
		difference = (int)x - (int)y;
		System.out.println("\n\n" + (int)x + " - " + (int)y + " = " + (int)difference + "." );
		
		product = (int)x * (int)y;
		System.out.println("\n\n" + (int)x + " * " + (int)y + " = " + (int)product + "." );
		
		quotient = x / y;
		System.out.println("\n\n" + (int)x + " / " + (int)y + " = " + quotient + "." );		
		
	}
}
		
		