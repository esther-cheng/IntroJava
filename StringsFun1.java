public class StringsFun1
{
	public static void main(String[] args)
	{
		String teacher = "";
		String response = "";
		System.out.println("Who is your Statistics teacher?");
		teacher = SavitchIn.readLine();
		
		System.out.println("\nWhy do you not like your teacher? (you must use the word 'hate')");
		response = SavitchIn.readLine();
		
		int location = 0;
		int locationEnd = 0;
		int location2 = 0;
		int locationEnd2 = 0;
		int length = 0;
		int teacherLength = 0;
		String response1 = "";
		String response2 = "";
		String response3 = "";
		String love = "";
		
		length = response.length();
		location = response.indexOf("hate");
		response1 = response.substring(0,location);
		locationEnd = location + 4;
		
		teacherLength = teacher.length();
		location2 = response.indexOf(" he ");
		locationEnd2 = location2 + 3;
		response2 = response.substring(locationEnd,location2);
		response3 = response.substring(locationEnd2,length);
		
		if(location > -1)
		{
			System.out.println("\n" + response1 + "love" + response2 + " " + teacher + "" + response3 + "");
		}
		else
		{
			System.out.println("\nIt doesn't seem like you have too much of a problem with your teacher!");
		}
	}
}