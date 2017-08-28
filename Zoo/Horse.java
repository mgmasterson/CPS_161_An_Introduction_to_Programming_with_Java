package Zoo;
/**
 * @author Michael Masterson
 * CPS 161
 * 
 * This a part of Zoo. It will generate responses for Horse.
 */
public class Horse extends Animal
{
	private double top_speed;

	public Horse()
	{

	}

	public Horse(String name, double weight, int age, double top_speed)
	{
		super(name, weight, age);
		this.top_speed = top_speed;
	}

	public String makeNoise()
	{
		return "Whinny";
	}

	public String toString()
	{
		return (super.toString() + top_speed);
	}	
}