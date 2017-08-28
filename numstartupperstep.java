import java.util.Scanner;
/**
 * @author Michael Masterson
 * CPS 161
 * 
 * This is a simple counting application. It was ask user to enter a number and a stop number.
 * based on the first number it will increase by 4 until the number is reached.
 *
 */
class numstartupperstep {
	public static void main(String[] args){
		System.out.println("Enter first number:");
		Scanner keyboard = new Scanner(System.in);
		int firstNumber = keyboard.nextInt(); 

		System.out.println("Enter upper bound:");
		int upperbound = keyboard.nextInt();

		int increment = firstNumber %2;
		firstNumber +=increment;
		int count =0;

		while(firstNumber < upperbound)
		{
			System.out.print(firstNumber + " ");
			firstNumber +=4;
			count+=1;
			if ((count % 10)== 0)
				System.out.println();
		}
	}
}