package Zoo;
/**
 * @author Michael Masterson
 * CPS 161
 * 
 * This a part of Zoo. It will generate responses for Cow.
 */
public class Cow extends Animal
{	
	private int num_spots;

	public Cow()
	{

	}

	public Cow(String name, double weight, int age, int num_spots)
	{
		super(name, weight, age);
		this.num_spots = num_spots;
	}

	public String makeNoise()
	{
		return "Moooo";
	}

	public String toString()
	{
		return (super.toString() + num_spots);
	}
}