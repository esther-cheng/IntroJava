public class Triangle
{
	public static void main(String[] args)
	{
		int size = 0;
		
		System.out.println("Please enter the size you want the triangle to be.");
		size = SavitchIn.readLineInt();
		
		String asterisks = "";
		asterisks = "********************";
		
		while(size > asterisks.length())
		{
			asterisks = asterisks + asterisks;
		}
		
		System.out.println("");

		for(int x = 1; x < size; x++)
		{
			System.out.println(asterisks.substring(0,x));
		}
		
		for(int y = size; y >= 1; y--)
		{
			System.out.println(asterisks.substring(0,y));
		}
	}
}