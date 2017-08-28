import java.util.Scanner;  
/**
 * @author Michael Masterson
 * CPS 161
 * 
 * This is a String analyzer. It will fist ask for the user to enter a string.
 * It will then break it down to Big letters, number of a's, and upper and lower case letters.
 * Also, it has predetermined strings.
 *
 */
public class MyStringMethods {

	private String myStr="";

	public void readString()
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter String: ");
		myStr = keyboard.nextLine();

		keyboard.close();
		// Prompt the user and read in a String from a Scanner class from the keyboard  
		// with the nextLine() method and store it in "myStr"
	}
	public void setString(String s)
	{
		myStr =s;
	}
	public int countOccurrences(String s)
	{
		int count = 0;
		int index = myStr.indexOf(s);
		//System.out.println("indexOf is " + index);

		while (index >= 0)
		{
			count++;
			index = myStr.indexOf (s,index +1);
		}

		return count;
		// use indexOf and return the number of occurrences of the string "s"
	}
	public int countOccurrences(char c)
	{
		int count = 0;
		int index = myStr.indexOf(c);
		//System.out.println("indexOf is " + index);

		while (index >= 0)
		{
			count++;
			index = myStr.indexOf (c,index +1);
		}

		return count;
		// use indexOf and return the number of occurrences of the character "c"
	}
	int countUpperCaseLetters()
	{
		int count = 0;
		for(int h =0; h < myStr.length(); h++) {

			if (myStr.charAt(h) >= 'A' && myStr.charAt(h) <= 'Z')
				count ++;

		}

		return count;
		// return the number of upper case letters
	}

	int countLowerCaseLetters()
	{
		int count = 0;
		for(int i = 0; i < myStr.length(); i++)
		{	
			if (myStr.charAt(i) >= 'a' && myStr.charAt(i) <= 'z')
				count ++;

		}

		return count;
	}
	// return the number of lower case letters
	public void printCounts(String s, char c)
	{
		System.out.println("***************************************");
		System.out.println("Analyzing: myStr="+myStr);
		System.out.println("Number of "+s + " is "+ countOccurrences(s));
		System.out.println("Number of "+c + " is "+ countOccurrences(c));
		System.out.println("Number of Upper case letters="+ countUpperCaseLetters());
		System.out.println("Number of Lower case letters="+ countLowerCaseLetters());
	}

	public static void main(String[] args) {
		MyStringMethods msm = new MyStringMethods();
		msm.readString();
		msm.printCounts("big", 'a');

		msm.setString("Parked in a van down by the river bank .... The van had was near a lot of other vans");
		msm.printCounts("van", 'a');

		MyStringMethods msm2 = new MyStringMethods();
		msm2.setString("the elephant in the room wouldn't budge");
		msm2.printCounts("the", 'i');
	}
}