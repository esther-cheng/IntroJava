public class MyMathCLASS
{
	int sum = 0;
	int difference = 0;
	int product = 0;
	int quotient = 0;
	int squared = 0;
	int cubed = 0;
	int value = 0;
	String evenOdd = "";
	char letter = ' ';
	
	public int add(int x, int y)
	{
		sum = (x+y);
		return sum;
	}
	
	public int subtract(int x, int y)
	{
		difference = (x-y);
		return difference;
	}
	
	public int multiply(int x, int y)
	{
		product = (x*y);
		return product;
	}
	
	public int divide(int x, int y)
	{
		quotient = (x/y);
		return quotient;
	}
	
	public int square(int z)
	{
		squared = (z*z);
		return squared;
	}
	
	public int cube(int w)
	{
		cubed = (w*w*w);
		return cubed;
	}
	
	public int abs(int a)
	{
		if(a < 0)
		{
			value = (a*-1);
		}
		else
		{
			value = a;
		}
		
		return value;
	}
	
	public String oddOrEven(int b)
	{
		if(b % 2 == 1)
		{
			evenOdd = "ODD";
		}
		else
		{
			evenOdd = "EVEN";
		}
		
		return evenOdd;
	}
	
	public int grade(int c)
	{
		if(c <= 100 && c >= 90)
		{
			letter = 'A';
		}
		else if(c <= 89 && c >= 80)
		{
			letter = 'B';
		}
		else if(c <= 79 && c >= 70)
		{
			letter = 'C';
		}
		else if(c <= 69 && c >= 60)
		{
			letter = 'D';
		}
		else
		{
			letter = 'F';
		}
		
		return letter;
	}
}