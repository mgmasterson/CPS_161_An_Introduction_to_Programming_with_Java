import java.util.*;
/**
 * @author Michael Masterson
 * CPS 161
 * 
 * This will as the user to enter an operation and it will then
 * prompt for a fraction and then prefrom said operation.
 */
public class Fraction
{
	private Scanner scan = new Scanner(System.in);     
	private int num=1;
	private int denom=1;

	public Fraction()
	{ 
	}

	public Fraction(int n, int d)
	{
		num = n;
		denom = d;
		reduce();
		// Fill in code (good to use setFraction)
	}

	public void setFraction(int n, int d)
	{
		num = n;
		denom = d;
		reduce();
		//Fill in code ... don't forget to reduce
	}

	public Fraction add(Fraction op)
	{
		int newNum = num*op.denom + denom*op.num;
		int newDemon = (denom*op.denom);

		Fraction f = new Fraction(newNum, newDemon);
		return f;
		//Fill in code ... don't forget to reduce
		// Algebra HINT:  a/b + c/d = (a*d + b*c)/(b*d)
	}  

	public Fraction subtract(Fraction op)
	{
		int newNum = ((num*op.denom)- (denom*op.num));
		int newDemon = (denom*op.denom);

		Fraction f = new Fraction(newNum, newDemon);
		return f;
		//Fill in code ... don't forget to reduce
		// Algebra HINT:  a/b - c/d = (a*d - b*c)/(b*d)
	} 

	public Fraction multiply(Fraction op)
	{
		int newNum = ((num*op.num)/(denom*op.denom));
		int newDemon = ((denom*op.denom)); 

		Fraction f = new Fraction(newNum, newDemon);
		return f;
		//Fill in code ... don't forget to reduce
		// Algebra HINT:  a/b * c/d = (a*c)/ (b*d)
	}  

	public Fraction divide(Fraction op)
	{
		int newNum = ((num*op.denom));
		int newDemon = ((denom*op.denom));

		Fraction f = new Fraction(newNum, newDemon);
		return f;
		//Fill in code ... don't forget to reduce
		// Algebra HINT:  a/b  /  c/d = (a*d)/ (b*c)
	}  


	private void reduce()
	{
		int smaller = Math.min(Math.abs(num), Math.abs(denom));
		for (int divisor = 2; divisor < smaller; divisor ++)
		{
			while ( (num % divisor == 0) && (denom % divisor == 0))
			{
				num = num / divisor;
				denom /= divisor;
				smaller /= divisor;
			}
		}
	}
	// Pseudo code:
	// set smaller = minimum ( abs(num), abs(denom));
	// Loop through the possible divisors: 2, 3, 4, ... smaller
	// For each possible divisor: 
	//      while (num and denom are evenly divisible by divisor)
	//      {
	//           num /= divisor;
	//           denom /= divisor;
	//           smaller /= divisor;
	//      }

	public boolean equals(Fraction f)
	{
		int x= num, x1 = denom, Y = f.num, Y1 = f.denom;
		if (x/x1 == Y/Y1)
			return false;
		else
			return true;	
	}
	// Assuming all fractions are reduced
	// Fill in code

	public String toString()
	{
		return num + "/" + denom;
		// Fill in code
	}

	public void readin(String label)
	{
		while (true) // Keep trying if bad input is received
		{
			System.out.println(label);
			String temp = scan.next();
			temp = temp.trim(); // get rid of white space at the beginning and end
			int index = temp.indexOf('/');
			if (index >= 0)
			{
				String numStr = temp.substring(0, index);
				String denomStr = temp.substring(index+1);
				int n = Integer.parseInt(numStr);
				int d = Integer.parseInt(denomStr);
				setFraction(n,d);
				return;
			}
			else
				System.out.println("Input Fraction missing / ");
		}//Keep trying until you get it right
	}

	public static void main(String[] args)
	{
		Fraction f1= new Fraction();
		Fraction f2= new Fraction();
		Fraction f3=null;
		Scanner scan = new Scanner(System.in);

		while(true)
		{
			System.out.println("Enter operation: + - * / q (q ==> quit) : ");
			String input = scan.next();
			if (input.charAt(0) == 'q') return; // All done

			f1.readin("Enter Fraction 1: ");
			f2.readin("Enter Fraction 2: ");
			System.out.println("f1 = " + f1);
			System.out.println("f2 = " + f2);

			if (f1.equals(f2))
				System.out.println("f1 and f2 are equal");
			else
				System.out.println("f1 and f2 are not equal");

			switch (input.charAt(0))
			{                
			case '+':
				f3 = f1.add(f2);
				System.out.println("f1+f2=" + f3);
				break;

			case '-':
				f3 = f1.subtract(f2);
				System.out.println("f1-f2=" + f3);
				break;

			case '*':
				f3 = f1.multiply(f2);
				System.out.println("f1*f2="+f3);
				break;

			case '/':
				f3 = f1.divide(f2);
				System.out.println("f1/f2="+f3);
				break;

			default:
				System.out.println("Illegal command: "  + input );
				break;

			}
		}// end of while loop

	}  // end of main 
}