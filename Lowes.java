public class Lowes
{
	public static void main(String[] args)
	{
		String name = "";
		double price = 0;
		int i = 0;
		int over50 = 0;
		int divisible3 = 0;
		double subtotal = 0;
		double discount = 0;
		double discount2 = 0;
		double total = 0;
		double tax = 0;
		double taxTotal = 0;
		char answer = ' ';
		char answerCard = ' ';
		
		System.out.println("Please enter your name.");
		name = SavitchIn.readLine();
		
		System.out.println("\nHi, " + name + "! Welcome to Lowe's!");
		
		do
		{
			i++;
			System.out.println("\nPlease enter the price of item #" + i + ". It must be in dollars.");
			price = SavitchIn.readLineDouble();
			
			while(price < 0)
			{
				System.out.println("\nYour price is negative! Try again.");
				price = SavitchIn.readLineDouble();
			}
			
			if(price > 50)
			{
				over50++;
			}
			
			if(price % 3 == 0)
			{
				divisible3++;
			}
			
			subtotal = subtotal + price;
			
			System.out.println("\nDo you want to enter another price? Please answer 'y' or 'n'.");
			answer = SavitchIn.readLineNonwhiteChar();
			
			while(answer != 'y' && answer != 'Y' && answer != 'n' && answer != 'N')
			{
				System.out.println("\nThat is not an answer provided. Try again.");
				answer = SavitchIn.readLineNonwhiteChar();
			}
		} while(answer == 'y' || answer == 'Y');
		
		System.out.println("\nYou entered " + i + " item(s). Out of those, " + over50 + " cost over 50 dollars, and " + divisible3 + " can be divided by 3.\n\nYour total comes to $" + subtotal + ".");
		System.out.println("\nDo you have a Lowe's card? Please answer 'y' or 'n'.");
		answerCard = SavitchIn.readLineNonwhiteChar();
		
		while(answerCard != 'y' && answerCard != 'Y' && answerCard != 'n' && answerCard != 'N')
		{
			System.out.println("\nThat is not an answer provided. Try again.");
			answerCard = SavitchIn.readLineNonwhiteChar();
		}
		
		if(answerCard == 'y' || answerCard == 'Y')
		{
			discount = subtotal * .05;
			total = subtotal - discount;
		}
		else
		{
			total = subtotal;
		}
		
		if(subtotal > 500)
		{
			discount2 = subtotal * .1;
			total = total - discount2;
		}
		else
		{
			total = total;
		}
		
		System.out.println("\nYour discount comes to $" + (discount + discount2) + "");
		
		tax = total * .06;
		taxTotal = total + tax;
		System.out.println("\nPre-tax Total: $" + total + " \nTax: $" + tax + " \nTotal: $" + taxTotal + "");
	}
}
		
		
		
		