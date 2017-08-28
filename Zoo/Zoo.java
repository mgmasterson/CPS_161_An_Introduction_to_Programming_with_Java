package Zoo;
/**
 * @author Michael Masterson
 * CPS 161
 * 
 * This a part of Zoo. It will generate responses from Snake, Cow, and Horse.
 */
public class Zoo
{
	private int actual_num_animals;
	private int num_cages;
	private Animal[] animals;

	public Zoo()
	{
		animals = new Animal[num_cages = 20];
		actual_num_animals = 0;
	}

	public Zoo(int num_cages)
	{
		animals = new Animal[num_cages = 20];
		actual_num_animals = 0;
	}

	void add(Animal a)
	{
		animals[actual_num_animals] = a;
		actual_num_animals++;
	}

	double total_weight()
	{
		double total = 0;
		for (int i = 0; i < actual_num_animals; i++)
		{
			total += animals[i].getWeight();
		}
		return total;
	}

	void make_all_noises()
	{
		for (int i = 0; i < actual_num_animals; i++)
		{
			System.out.println(animals[i].makeNoise());
		}
	}

	void print_all_animals()
	{
		for (int i = 0; i < actual_num_animals; i++)
		{
			System.out.println(animals[i]);
		}
	}

	public static void main(String[] args)
	{
		Zoo z = new Zoo();
		Snake sly = new Snake("Sly ", 5.0  , 2  , 2);
		Snake sly2 = new Snake("Slyme ", 10.0  , 1 , 2);
		Cow blossy = new Cow("Blossy ", 900., 5,  10);
		Horse prince = new Horse("Prince ", 1000., 5, 23.2);

		// Following not allowed because Animal is abstract
		//Animal spot = new Animal("Spot", 10., 4);

		z.add(sly);
		z.add(sly2);
		z.add(blossy);
		z.add(prince);

		z.make_all_noises();
		System.out.println("Total weight = " + z.total_weight());
		System.out.println("**************************");
		System.out.println("Animal Printout:");
		z.print_all_animals();  

	}
}