import java.util.Scanner;
/**
 * @author Michael Masterson
 * CPS 161
 * 
 * This will as the user or Centigrade temp and convert to Fahrenheit.
 */
class ftoc2 {
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);
		double avg_c;
		double avg_f;
		double input = 0.00;
		double fah;
		int count =0;

		while(input > -100){
			System.out.println("Enter Centigrade or : -100 to quit");
			input = keyboard.nextInt();
			if (input > -100)
				count++;
			fah = ((9.0/5.0)*input + 32.0);
			System.out.println("Temperture is: " + fah + "F" + input + "C");
		}
		fah = ((9.0/5.0)*input + 32.0);
		avg_f = fah/count;
		avg_c = input/count;
		System.out.println("Average Centigrade " + avg_c);
		System.out.println("Average Fahrenheit " + avg_f);
	}
}