public class For2
{
	public static void main(String[] args)
	{
		int total = 0;
		int start = 0;
		int end = 0;
		
		System.out.println("What number should the loop begin with?");
		start = SavitchIn.readLineInt();
		
		System.out.println("\nWhat number should the loop end with?");
		end = SavitchIn.readLineInt();
		
		System.out.println("\n");
		if(start<end)
		{
			for(int x = start; x <= end; x++)
			{
				System.out.println(x);
				total = total + x;
			}
		}
		else
		{
			for(int x = start; x >= end; x--)
			{
				System.out.println(x);
				total = total + x;
			}
		}
		System.out.println("\n" + total);	
	}
}