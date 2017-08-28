import java.util.Scanner;
/**
 * @author Michael Masterson
 * CPS 161
 * 
 * This will ask the user to input feet and convert to miles.
 */
class feettomiles {
	public static void main(String[] args){
		int feetgiven; 
		int feettomiles;
		int feet;
		int miles = 5280;

		Scanner keyboard = new Scanner(System.in);
		System.out.println("How many feet (ft) ? ");
		feetgiven = keyboard.nextInt();

		feettomiles = feetgiven / miles;
		System.out.println("Your distance in miles is " + feettomiles);
	}
}