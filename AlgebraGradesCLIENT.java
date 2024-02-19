public class AlgebraGradesCLIENT
{
	public static void main(String[] args)
	{
		double avg = 0;
		int As = 0;
		int Bs = 0;
		int Cs = 0;
		int Ds = 0;
		int Fs = 0;
		int lowest = 0;
		int highest = 0;
		
		CalculateGradesCLASS grades = new CalculateGradesCLASS();
		
		grades.displayGreeting();
		
		grades.enterScores();
		
		avg = grades.getAvg();
		System.out.println("\nThe average is " + avg + ".");
		
		As = grades.getAs();
		System.out.println("\nThe number of 'A's is " + As + ".");
		
		Bs = grades.getBs();
		System.out.println("\nThe number of 'B's is " + Bs + ".");
		
		Cs = grades.getCs();
		System.out.println("\nThe number of 'C's is " + Cs + ".");
		
		Ds = grades.getDs();
		System.out.println("\nThe number of 'D's is " + Ds + ".");
		
		Fs = grades.getFs();
		System.out.println("\nThe number of 'F's is " + Fs + ".");
		
		lowest = grades.getLowest();
		System.out.println("\nThe lowest score is " + lowest + ".");
		
		highest = grades.getHighest();
		System.out.println("\nThe highest score is " + highest + ".");
		
	}
}
		