package Zoo;
/**
 * @author Michael Masterson
 * CPS 161
 * 
 * This a part of Zoo. Constructor for Animals.
 */
public abstract class Animal 
{
	private String name;
	private double weight;
	private int age;

	Animal()
	{

	}

	Animal(String n, double weight, int age)
	{
		this.name = n;
		this.weight = weight;
		this.age = age;
	}

	public abstract String makeNoise();

	double getWeight()
	{
		return weight;
	}

	public String toString()
	{
		return (name + weight + age);
	}
}