import java.util.Scanner;
/**
 * @author Michael Masterson
 * CPS 161
 * 
 * Will go through the whole alphabet and see which one is a consonant or vowel
 *
 */
public class vowel2 {

	public static void main(String[] args) {
		char letter = 'a';

		while(true) {
			//System.out.println(letter++);
			if (letter == 'z'+1){
				break;

			}
			if (letter == 'a' || letter == 'e'||letter == 'i' 
					|| letter == 'o'||letter =='u'||letter == 'y')
				System.out.println(letter + " is a vowel");
			else{
				System.out.println(letter + " is a consonant");
			}
			letter++;
		}
	}

}