package Zoo;
/**
 * @author Michael Masterson
 * CPS 161
 * 
 * This a part of Zoo. It will generate responses for Snake.
 */
public class Snake extends Animal
{
	private double num_fangs;

	public Snake()
	{

	}

	public Snake(String name, double weight, int age, int num_fangs)
	{
		super(name, weight, age);
		this.num_fangs = num_fangs;
	}

	public String makeNoise()
	{
		return "Hisssssss";
	}

	public String toString()
	{
		return (super.toString() + num_fangs);
	}	
}