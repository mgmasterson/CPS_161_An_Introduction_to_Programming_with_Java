/**
 * @author Michael Masterson
 * CPS 161
 * 
 * This will take predetermined names and then reverse the name in order.
 */
public class firstNames {

	public static void main(String[] args) {
		String[] firstnames = new String[11];
		firstnames[0] = " George ";
		firstnames[1] = " Fred ";
		firstnames[2] = " Sam ";
		firstnames[3] = " Mary ";
		firstnames[4] = " Sarah ";
		firstnames[5] = " Bella ";
		firstnames[6] = " Joy ";
		firstnames[7] = " Rita ";
		firstnames[8] = " Martha ";
		firstnames[9] = " Sue ";
		firstnames[10] = " Nancy ";

		System.out.println("Names backwards: " + firstnames[10] + firstnames[9] + firstnames[8] + firstnames[7] +
				firstnames[6] + firstnames[5] + firstnames[4] + firstnames[3] + firstnames[2] +  firstnames[1]
						+ firstnames[0]);

	}

}
