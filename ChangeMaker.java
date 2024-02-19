public class ChangeMaker
{

	public static void main(String[] args)
	{
		double value = 0;
		double calculatedValue = 0;
		double penny = 0;
		double nickel = 0;
		double dime = 0;
		double quarter = 0;
		String p = " ";
		String n = " ";
		String d = " ";
		String q = " ";
		
		System.out.println("Please input a value to make change for. Do not use '$' signs. Include a decimal point.");
		value = SavitchIn.readLineDouble();
		calculatedValue = value * 100;
		
		quarter = calculatedValue/25;
		dime = (calculatedValue % 25)/10;
		nickel = ((calculatedValue % 25) % 10)/5;
		penny = ((calculatedValue % 25) % 10) % 5;
		
		if((int)penny==1)
		{
			p = "penny";
		}
		else
		{
			p = "pennies";
		}
		/////////////////////////////////////////////////////////////////////////
		if((int)nickel==1)
		{
			n = "nickel";
		}
		else
		{
			n = "nickels";
		}
		/////////////////////////////////////////////////////////////////////////
		if((int)dime==1)
		{
			d = "dime";
		}
		else
		{
			d = "dimes";
		}
		/////////////////////////////////////////////////////////////////////////
		if((int)quarter==1)
		{
			q = "quarter";
		}
		else
		{
			q = "quarters";
		}
		
		System.out.println("\nYou need " + (int)quarter + " " + q + ", " + (int)dime + " " + d + ", " + (int)nickel + " " + n + ", and " + (int)penny + " " + p + ".");
	
	}
}