public class Kohls
{

	public static void main(String[] args)
	{
		String result = "";
		char coupon = ' ';
		double couponValue = 0;
		System.out.println("Please select the value of your coupon below.\n     a) 15%\n     b) 20%\n     c) 30%\n     d) I don't have a coupon.");
		coupon = SavitchIn.readLineNonwhiteChar();
		
		if (coupon == 'a')
		{
			couponValue = .15;
		}
		else if (coupon == 'b')
		{
			couponValue = .20;
		}
		else if (coupon == 'c')
		{
			couponValue = .30;
		}
		else if (coupon == 'd')
		{
			couponValue = 1.0;
		}
		else
		{
			System.out.println("Invalid answer.");
		}
		
		double item1 = 0;
		double item2 = 0;
		double item3 = 0;
		double item4 = 0;
		double item5 = 0;
		double subtotal = 0;
		double discount = 0;
		double preTax = 0;
		
		System.out.println("\nPlease enter the pre-discount price of your items.");
		item1 = SavitchIn.readLineDouble();
		item2 = SavitchIn.readLineDouble();
		item3 = SavitchIn.readLineDouble();
		item4 = SavitchIn.readLineDouble();
		item5 = SavitchIn.readLineDouble();
		
		subtotal = (item1 + item2 + item3 + item4 + item5);
		System.out.println("\nYour subtotal comes to $" + subtotal + ".");
		
		discount = (subtotal * couponValue);
		System.out.println("\nCongratulations! You saved $" + discount + "!");
		
		double salesTax = 0;
		salesTax = .06;
		preTax = (subtotal - discount);
		double tax = 0;
		tax = (preTax * salesTax);
		double total = 0;
		total = (preTax + tax);
		
		System.out.println("\nYour tax amount is $" + tax + ". \n\nThis brings your total to $" + total + "." );
		
		double shipping = 0;
		double shippingCost = 0;
		shippingCost = (preTax * shipping);
		double withShipping = 0;
		withShipping = (total + shippingCost);
		
		
		if (preTax  < 75)
		{
			shipping = .12;
			System.out.println("\nYour shipping cost comes to " + shippingCost + ".");
		}
		else
		{
			shipping = 0;
			System.out.println("\nCongrats! You got free shipping!");
		}
		
		double preKohlsCash = 0;
		preKohlsCash = (preTax/50);
		int kohlsCash = ((int)preKohlsCash * 10);
		
		System.out.println("\nSubtotal: $" + subtotal + " \nDiscount: $" + discount + " \nTotal: $" + preTax + " \nTax: $" + tax + " \nShipping: $" + shippingCost + " \nFinal Total: $" + withShipping + " \nKohl's Cash: $" + kohlsCash +"");
		
	}
}