public class NamesAndChange
{
	public static void main(String[] args)
	{
		String name = "";
		String name1 = "";
		String name2 = "";
		String name3 = "";
		String nameDivide = "";
		char initial1 = ' ';
		char initial2 = ' ';
		char initial3 = ' ';
		int location = 0;
		int location2 = 0;
		int length = 0;
		int length2 = 0;
		int lengthName1 = 0;
		int lengthName2 = 0;
		int lengthName3 = 0;
		System.out.println("Please enter your full name (middle included). If you do not have a middle name, please make one up.");
		name = SavitchIn.readLine();
		
		length = name.length();
		location = name.indexOf(" ");
		name1 = name.substring(0,location + 1);
		
		nameDivide = name.substring((location + 1),(length));
		length2 = nameDivide.length();
		location2 = nameDivide.indexOf(" ");
		name2 = nameDivide.substring(0,location2);
		name3 = nameDivide.substring((location2 + 1),(length2));
		
		initial1 = name.charAt(0);
		initial2 = nameDivide.charAt(0);
		initial3 = nameDivide.charAt(location2 + 1);
		
		lengthName1 = name1.length();
		lengthName2 = name2.length();
		lengthName3 = name3.length();
		
		if(lengthName1 >= lengthName2 && lengthName1 >= lengthName3)
		{
			System.out.println("\n" + name1 + " \n" + name2 + " \n" + name3 + " \n" + initial1 + "." + initial2 + "." + initial3 + ". \n" + name1 + "");
		}
		else if(lengthName2 > lengthName1 && lengthName2 >= lengthName3)
		{
			System.out.println("\n" + name1 + " \n" + name2 + " \n" + name3 + " \n" + initial1 + "." + initial2 + "." + initial3 + ". \n" + name2 + "");
		}
		else
		{
			System.out.println("\n" + name1 + " \n" + name2 + " \n" + name3 + " \n" + initial1 + "." + initial2 + "." + initial3 + ". \n" + name3 + "");
		}
	}
}
		
		
		