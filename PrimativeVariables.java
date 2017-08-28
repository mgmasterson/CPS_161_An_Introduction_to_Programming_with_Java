import java.util.Scanner; 
/**
 * @author Michael Masterson
 * CPS 161
 * 
 * This will as user to enter two numbers and add them together.
 *
 */
public class PrimativeVariables {


	public static void main(String[] args) {
		int double1;   // variable to hold our first input
		int double2;   // variable to hold our second input
		int answer2; // variable to hold our answer

		// Open up the keyboard for user input
		Scanner keyboard = new Scanner(System.in);

		System.out.println("Enter first number:");
		double1 = (int) keyboard.nextDouble();

		System.out.println("Enter second number:");
		double2 = (int) keyboard.nextDouble();

		answer2 = double1 + double2;  // simple variable arithmetic

		System.out.println("The answer = "+ answer2);     
	}

}