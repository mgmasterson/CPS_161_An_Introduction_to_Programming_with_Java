import java.util.Scanner;
/**
 * @author Michael Masterson
 * CPS 161
 * 
 * This  will ask user to enter in Quarters, Dimes, Nickels, and Pennies. After it will count it up and display 
 * how many coins are in jar and then the dollar amount.
 */
class Jar {
	public static void main(String[] args){
		int quarters = 25; 
		int dimes = 10;
		int nickels = 5;
		int pennies = 1;
		int cents;
		int quarters1;
		int dimes1;
		int nickels1;
		int pennies1;

		Scanner keyboard = new Scanner(System.in);

		System.out.println("Quarters in Jar? ");
		quarters = keyboard.nextInt();

		System.out.println("Dimes in Jar? ");
		dimes = keyboard.nextInt();

		System.out.println("Nickels in Jar? ");
		nickels = keyboard.nextInt();

		System.out.println("Pennies in Jar? ");
		pennies = keyboard.nextInt();

		quarters1 = 25*quarters;
		dimes1 = 10*dimes;
		nickels1 = 5*nickels;
		pennies1 = 1*pennies;
		cents = (quarters1 + dimes1 + nickels1 + pennies1);

		System.out.println("The jar contains: " + cents);  
		System.out.format("Total: $ %,.2f", (double)cents/100);
	}
}