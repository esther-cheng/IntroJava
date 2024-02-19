public class LoopAssn
{
	public static void main(String[] args)
	{
		int number = 0;
		int x = 0;
		
		while(x<20)
		{
			number = number + 1;
			System.out.println("" + number + "");
			x = x + 1;
		}
	
		System.out.println("\n");
		while(x<=20 && x>0)
		{
			System.out.println("" + number + "");
			number = number - 1;
			x = x - 1;
		}

		System.out.println("\n");	
		number = 1;
		
		while(x<20)
		{
			System.out.println("" + number + "");
			number = number + 2;
			x = x + 2;
		}

		System.out.println("\n");
		x = x - 20;
		number = 2;
		
		while(x<=18)
		{
			System.out.println("" + number + "");
			number = number + 2;
			x = x + 2;
		}
		
		x = x - 20;
		number = 1;
		System.out.println("\n");
		while(x<=20)
		{
			System.out.println("" + number + "");
			number = number + 3;
			x = x + 3;
		}
		

	}
}