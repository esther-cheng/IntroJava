public class Bottles
{
	public static void main(String[] args)
	{
		int bottles = 99;
		int x = 0;
	
		while(x<=99 && bottles>1)
		{
			System.out.println(""+ bottles + " bottles of beer on the wall, " + bottles + " bottles of beer.");
			bottles = bottles - 1;
			
			if(bottles==1)
			{
				System.out.println("Take one down and pass it around, " + bottles + " bottle of beer on the wall.\n");
			}
			else
			{
				System.out.println("Take one down and pass it around, " + bottles + " bottles of beer on the wall.\n");
			}
			x = x + 1;
		}
		System.out.println("No more bottles of beer on the wall, no more bottles of beer. \nGo to the store and buy some more, 99 bottles of beer on the wall.");
	}
}