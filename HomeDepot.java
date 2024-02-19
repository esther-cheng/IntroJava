public class HomeDepot
{
	public static void main(String[] args)
	{
		String name = "";
		double refrigerator = 0;
		double microwave = 0;
		double dishwasher = 0;
		double stove = 0;
		double prices = 0;
		
		System.out.println("What's your name?");
		name = SavitchIn.readLine();
		
		System.out.println("\nHi, " + name + "! Welcome to Home Depot!");
		
		System.out.println("\nPlease enter the price of your refrigerator.");
		refrigerator = SavitchIn.readLineDouble();
		
		System.out.println("\nPlease enter the price of your microwave.");
		microwave = SavitchIn.readLineDouble();
		
		System.out.println("\nPlease enter the price of your dishwasher.");
		dishwasher = SavitchIn.readLineDouble();
		
		System.out.println("\nPlease enter the price of your stove.");
		stove = SavitchIn.readLineDouble();
		
		prices = (refrigerator + microwave + dishwasher + stove);
		System.out.println("\nYour total comes to $" + prices + ".");
		
		//////////////////////////////////////////////////////////////////////////
		char answer = ' ';
		double discount = 0;
		double subtotal = 0;
		int number = 0;
		double discountTotal = 0;
		double tax = 0;
		double taxTotal = 0;
		
		System.out.println("\nAre you a platinum shopping member? Answer Y or N.");
		answer = SavitchIn.readLineNonwhiteChar();
		
		if (answer == 'Y' || answer == 'y')
		{
			if (prices >= 3500)
			{
				discount = .3;
			}
			else if (prices >= 2000)
			{
				discount = .2;
			}
			else if (prices >= 1000)
			{
				discount = .1;
			}
			else
			{
				discount = 1;
			}
		}
		else if (answer == 'N' || answer == 'n')
		{
			System.out.println("\nYou have a 1/5 chance of winning a 25% off discount! Please choose a number between 1 and 10 (inclusive).");
			number = SavitchIn.readLineInt();
			
			if (number == 2 || number == 8)
			{
				discount = .25;
			}
			else
			{
				discount = 1;
			}
		}
		else
		{
			System.out.println("\nInvalid answer.");
		}
		
		if (discount < 1)
		{
			System.out.println("\nYou got a " + (discount * 100) + "% discount!");
		}
		else
		{
			System.out.println("\nYou didn't get a discount. Sorry!");
		}
		
		discountTotal = prices * discount;
		subtotal = (prices) - (discountTotal);
		
		tax = subtotal * .06;
		taxTotal = subtotal + tax;
		
		
		System.out.println("\nSubtotal: $" + prices + " \nDiscount: $" + discountTotal + " \nSubtotal: $" + subtotal + " \nTax: $" + tax + " \nFinal Total: $" + taxTotal + "");
	}
}