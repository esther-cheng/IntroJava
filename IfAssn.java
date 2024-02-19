public class IfAssn
{

	public static void main(String[] args)
	{
		String name = " ";
		System.out.println("What's your name?");
		name = SavitchIn.readLine();
		
		if (name.equalsIgnoreCase("Esther"))
		{
			System.out.println("\nThat's my name, too!");
		}
		else
		{
			System.out.println("\nHi, " + name + ".");
		}
		
		int year = 0;
		System.out.println("\nWhat year were you born in?");
		year = SavitchIn.readLineInt();
		
		if (year==1999)
		{
			System.out.println("\nYou turn 18 this year! Cool!");
		}
		else if (year>1999)
		{
			System.out.println("\nSorry, you can't vote.");
		}
		else if (year>1890)
		{
			System.out.println("\nYou can vote!");
		}
		else
		{
			System.out.println("\nInvalid answer.");
		}
		
	///////////////////////////////////////////////////////////////////
		String answerShow = "";
		char answerCharFG = ' ';
		char answerCharSP = ' ';
		
		System.out.println("\nDo you like Family Guy or South Park better?");
		answerShow = SavitchIn.readLine();
		
		if (answerShow.equalsIgnoreCase("Family Guy"))
		{
			System.out.println("\nWho is your favorite character?\n     a) Peter Griffin\n     b) Meg Griffin\n     c) Lois Griffin");
			answerCharFG = SavitchIn.readLineNonwhiteChar();
			
			if (answerCharFG == 'a')
			{
				System.out.println("\nGood choice! He's my favorite character, too!");
			}
			else if (answerCharFG == 'b')
			{
				System.out.println("\nSorry. She's not my favorite, but she's a great character!");
			}
			else if (answerCharFG == 'c')
			{
				System.out.println("\nLois is a good character, but she isn't my favorite. Sorry!");
			}
			else
			{
				System.out.println("\nThat wasn't an answer choice provided. Invalid answer.");
			}
		}
		else if (answerShow.equalsIgnoreCase("South Park"))
		{
			System.out.println("\nWho is your favorite character?\n     a) Kenny McCormick\n     b) Eric Cartman\n     c) Kyle Broflovski");
			answerCharSP = SavitchIn.readLineNonwhiteChar();
			
			if (answerCharSP == 'a')
			{
				System.out.println("\nKenny is such a good character, but he's not my favorite!");
			}
			else if (answerCharSP == 'b')
			{
				System.out.println("\nEric is my favorite character, too! Great choice!");
			}
			else if (answerCharSP == 'c')
			{
				System.out.println("\nKyle isn't my favorite character, but he's a good one!");
			}
			else
			{
				System.out.println("\nThat wasn't an answer choice provided. Invalid answer.");
			}
		}
		//////////////////////////////////////////////////////////////////////////////
		char favAnimal = ' ';
		
		System.out.println("\nOut of these four, which is your favorite animal?\n     a) Panda\n     b) Dolphin\n     c) Dog\n     d) Elephant");
		favAnimal = SavitchIn.readLineNonwhiteChar();
		
		if (favAnimal == 'a')
		{
			System.out.println("\nI love pandas, but they aren't my favorite animal. So cute, though. Sorry!");
		}
		else if (favAnimal == 'b')
		{
			System.out.println("\nDolphins are so adorable! Sorry, though. They aren't my favorite animal.");
		}
		else if (favAnimal == 'c')
		{
			System.out.println("\nWhat an excellent choice! Dogs are my favorite animals, too!");
		}
		else if (favAnimal == 'd')
		{
			System.out.println("\nElephants are so cute! Unfortunately, I can't say they're my favorite animal.");
		}
		else
		{
			System.out.println("\nThat wasn't an answer choice provided. Invalid answer.");
		}
	}
}