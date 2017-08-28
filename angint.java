import java.util.Scanner;
/**
 * @author Michael Masterson
 * CPS 161
 * 
 * This will take three numbers and then average them
 */
class angint {
	public static void main(String[] args){
		int num1; 
		int num2;
		int num3;
		int avg;

		Scanner keyboard = new Scanner(System.in);

		System.out.println("First number? ");
		num1 = keyboard.nextInt();


		System.out.println("Second number? ");
		num2 = keyboard.nextInt();


		System.out.println("Third number? ");
		num3 = keyboard.nextInt();

		avg = (num1 + num2 + num3) / 3;
		System.out.println("Your numbers are: " + num1 + " " + num2 + " " + num3);
		System.out.println("Your average is: " + avg);
	}
}