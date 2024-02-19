public class NameFinder
{
	public static void main(String[] args)
	{
		String sentence = "";
		int location = 0;
		
		System.out.println("Please enter a sentence.");
		sentence = SavitchIn.readLine();
		sentence = sentence.toLowerCase();
		
		location = sentence.indexOf("esther");
		
		if (location > -1)
		{
			System.out.println("\nName found at index #" + location + ".");
		}
		else
		{
			System.out.println("\nName not found.");
		}
	}
}
