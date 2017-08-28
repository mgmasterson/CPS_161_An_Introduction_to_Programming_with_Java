package fantfootball;
import java.util.Scanner;
/**
 * @author Michael Masterson
 * CPS 161
 * 
 * This is a fantasy football.
 * Enter in number of teams and weeks then scores for each team/week and
 * will display average
 */
public class FantasyFootball
{

	private int numberOfTeams; // Same as studentAverage.length.
	private int numberOfWeeks; // Same as quizeAverage.length.
	private String names[];

	private int[][] score; //numberOfStudents rows and numberOfQuizzes columns.
	private int[] teamAverage;
	private int[] quizAverage;

	public FantasyFootball (int[][] a)
	{
		if (a.length == 0 || a[0].length == 0)
		{
			System.out.println("Empty grade records. Aborting.");
			System.exit(0);
		}

		numberOfTeams = a.length;
		numberOfWeeks = a[0].length;
		fillGrade(a);
		fillTeamAverage( );
		fillQuizAverage( );
	}

	public FantasyFootball(FantasyFootball book)
	{
		numberOfTeams = book.numberOfTeams;
		numberOfWeeks = book.numberOfWeeks;
		fillGrade(book.score);
		fillTeamAverage( );
		fillQuizAverage( );
	}

	public FantasyFootball( )
	{
		Scanner keyboard = new Scanner(System.in);

		System.out.println("Enter number of teams:");
		numberOfTeams = keyboard.nextInt( );

		System.out.println("Enter number of weeks:");
		numberOfWeeks = keyboard.nextInt( );

		score = new int[numberOfTeams][numberOfWeeks];

		for (int studentNumber = 1; 
				studentNumber <= numberOfTeams; studentNumber++)
		{
			names = new String[numberOfTeams];
			keyboard.nextLine();
			for (int i = 0; i < names.length; i++)
			{
				System.out.print("Type a name: ");
				names[i] = keyboard.nextLine();
			}
			for (int quizNumber = 1; 
					quizNumber <= numberOfWeeks; quizNumber++)
			{
				System.out.println("Enter score for Team "
						+ names);
				System.out.println("Score for week " + quizNumber);
				score[studentNumber - 1][quizNumber - 1] =
						keyboard.nextInt( );
			}
		}

		fillTeamAverage( );
		fillQuizAverage( );
	}

	private void fillGrade(int[][] a)
	{
		score = new int[numberOfTeams][numberOfWeeks];

		for (int studentNumber = 1; 
				studentNumber <= numberOfTeams; studentNumber++)
		{
			for (int quizNumber = 1; 
					quizNumber <= numberOfWeeks; quizNumber++)
				score[studentNumber][quizNumber] = 
				a[studentNumber][quizNumber];
		}
	}

	/**
      Fills the array studentAverage using the data from the array grade.
	 */
	private void fillTeamAverage( )
	{
		teamAverage = new int [numberOfTeams];

		for (int studentNumber = 1; 
				studentNumber <= numberOfTeams; studentNumber++)
		{//Process one studentNumber:
			int sum = 0;
			for (int quizNumber = 1; 
					quizNumber <= numberOfWeeks; quizNumber++)
				sum = sum + score[studentNumber - 1][quizNumber - 1];
			//sum contains the sum of the quiz scores for student number studentNumber.
			teamAverage[studentNumber - 1] = sum/numberOfWeeks;
			//Average for student studentNumber is studentAverage[studentNumber - 1]
		}
	}

	/**
      Fills the array quizAverage using the data from the array grade.
	 */
	private void fillQuizAverage( )
	{
		quizAverage = new int [numberOfWeeks];

		for (int quizNumber = 1; quizNumber <= numberOfWeeks; quizNumber++)
		{//Process one quiz (for all students):
			int sum = 0;
			for (int studentNumber = 1; 
					studentNumber <= numberOfTeams; studentNumber++)
				sum = sum + score[studentNumber - 1][quizNumber - 1];
			//sum contains the sum of all student scores on quiz number quizNumber.
			quizAverage[quizNumber - 1] = sum/numberOfTeams;
			//Average for quiz quizNumber is the value of quizAverage[quizNumber - 1]
		}
	}

	public void display( )
	{
		for (int teamNumber = 1; 
				teamNumber <= numberOfTeams; teamNumber++)

		{//Display for one studentNumber:
			System.out.print(names);
			for (int quizNumber = 1; 
					quizNumber <= numberOfWeeks; quizNumber++)
				System.out.print(score[teamNumber - 1][quizNumber - 1] + " ");
			System.out.println(" Avg = " + teamAverage[teamNumber - 1] );
		}

		System.out.println("Weekly averages: ");
		for (int teamNumber = 1; teamNumber <= numberOfWeeks; teamNumber++)
			System.out.print("      " + " Avg = " + quizAverage[teamNumber - 1] + " ");
		System.out.println( );
	}
	public static void main(String[] args) 
	{
		FantasyFootball book = new FantasyFootball( );
		book.display( );
	}
}