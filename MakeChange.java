import java.util.Scanner;
/**
 * @author Michael Masterson
 * CPS 161
 * 
 * This will ask user to in price of item and enter cash in hand. Then it will display
 * the changed returned.
 *
 */
class MakeChange {
	public static void main(String[] args){
		double purchaseamount;
		double cashinhand;
		double change;
		int dollars; 
		int cents;
		int pennies = 1;
		int quarters = 25;
		int nickels = 5;
		int dimes = 10;
		int tquarters;
		int tnickels;
		int tdimes;
		int tpennies;
		int remainingcents;

		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter Price: ");
		purchaseamount = keyboard.nextDouble();

		System.out.println("Cash in hand: ");
		cashinhand = keyboard.nextDouble();

		change = cashinhand - purchaseamount;
		dollars = (int)change;

		cents = (int) (change * 100) - (dollars * 100);
		tquarters = cents /quarters;

		remainingcents = cents % quarters;
		tdimes = remainingcents / dimes;

		remainingcents = remainingcents % dimes;

		tnickels = remainingcents / nickels;
		remainingcents = remainingcents % nickels;

		tpennies = remainingcents / pennies;


		System.out.println();
		System.out.println("Change Returned: ");
		System.out.println(dollars + " dollars and " + cents + " cents");
		System.out.println();
		System.out.println("Change returned is: " + cents + " cents is equal to " + tquarters + " quarters, " + tdimes + " dimes, " + tnickels + " nickels, and " + tpennies + " pennies.");
	}
}