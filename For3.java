public class For3
{
	public static void main(String[] args)
	{
		int enemies = 0;
		int age = 0;
		int total = 0;
		int over16 = 0;
		int twenties = 0;
		int age23 = 0;
		int divisible6 = 0;
		int highestAge = 0;
		int lowestAge = 0;
		int average = 0;
		char answer = ' ';
		
		System.out.println("How many enemies do you have? Must be between 5 and 10.");
		enemies = SavitchIn.readLineInt();
		
		while(enemies > 10 || enemies < 5)
		{
			System.out.println("\nThat is not within 5 and 10! Try again.");
			enemies = SavitchIn.readLineInt();
		}
		
		for(int x = 1; x <= enemies; x++)
		{
			System.out.println("\nPlease enter the age (in years) of enemy #" + x + ".");
			age = SavitchIn.readLineInt();
			
			while(age < 0 || age > 140)
			{
				System.out.println("\nThat age is not possible! Try again.");
				age = SavitchIn.readLineInt();
			}
		
			System.out.println("\nDo you want to continue entering ages? Please enter 'y' or 'n'.");
			answer = SavitchIn.readLineNonwhiteChar();			
			
			if(age > 16)
			{
				over16++;
			}
			
			if(age >= 20 && age < 30)
			{
				twenties++;
			}
			
			if(age == 23)
			{
				age23++;
			}
			
			if(age % 6 == 0)
			{
				divisible6++;
			}
			
			if(age > highestAge)
			{
				highestAge = age;
			}
			
			if(x == 1 || age < lowestAge)
			{
				lowestAge = age;
			}
			
			total = total + age;
			
			if(age == 111)
			{
				break;
			}
			
			average = total/x;
			
			if(answer == 'n' || answer == 'N')
			{
				break;
			}
		}
		
		System.out.println("\nYour enemies' average age is " + average + ". There are " + over16 + " enemies who are older than 16, " + twenties + " enemies who are in their twenties, " + age23 + " enemies who are 23, and " + divisible6 + " enemies whose ages are divisible by 6. The highest age is " + highestAge + ", and the lowest age is " + lowestAge + ".");
	}
}