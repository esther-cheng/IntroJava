public class Rand
{
	public static void main(String[] args)
	{
		int y = 0;
		int highestNumb = 0;
		int lowestNumb = 0;
		int total = 0;
		int average = 0;
		int twoDigit = 0;
		int evens = 0;
		int odds = 0;
		
		for(int x = 1; x <= 12; x++)
		{
			y =	(int)(Math.random() * 125 + 1);
			System.out.println(y);
			
			total = total + y;
			
			if(y > highestNumb)
			{
				highestNumb = y;
			}
			
			if(y < lowestNumb || x == 1)
			{
				lowestNumb = y;
			}
			
			if(y > 9 && y < 100)
			{
				twoDigit++;
			}
			
			if(y % 2 == 0)
			{
				evens++;
			}
			else
			{
				odds++;
			}
			
			average = total/x;
		}
		
		System.out.println("\nThe average of those numbers is " + average + ", the highest number is " + highestNumb + ", and the lowest number is " + lowestNumb + ".");
		System.out.println("\nThere are " + twoDigit + " number(s) that are two digits long, " + evens + " even number(s), and " + odds + " odd number(s).");
	}
}