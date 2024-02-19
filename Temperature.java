public class Temperature
{
	public static void main(String[] args)
	{
		double temperature = 0;
		char unit = ' ';
		char answer = ' ';
		
		do
		{
	
			System.out.println("Please enter a temperature.");
			temperature = SavitchIn.readLineDouble();
		
			System.out.println("\nPlease enter a C for Celsius or an F for Fahrenheit.");
			unit = SavitchIn.readLineNonwhiteChar();
		
			while(unit != 'c' && unit != 'C' && unit != 'f' && unit != 'F')
			{
				System.out.println("\nThat is not a proper unit! Try again.");
				unit = SavitchIn.readLineNonwhiteChar();
			}
		
			if(unit == 'c' || unit == 'C')
			{
				temperature = (9 * (temperature/5)) + 32;
				System.out.println("\nConverted to Fahrenheit, your temperature is " + temperature + " degrees F.");
			}
			else
			{
				temperature = ((5 * (temperature-32))/9);
				System.out.println("\nConverted to Celsius, your temperature is " + temperature + " degrees C.");
			}
		
			System.out.println("\nEnter 'q' to quit and any other key to enter another temperature.");
			answer = SavitchIn.readLineNonwhiteChar();
			
		} while(answer != 'q' && answer != 'Q');
	}
}		