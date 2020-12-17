
public class Puppy {

	private String name;
	private String breed;
	private int age;
	private double weight;
	
	public Puppy(String name, String breed, int age, Double weight)
	{
		setPuppy(name, breed, age, weight);
	}
	
	public Puppy()
	{
		name = null;
		breed = null;
		age = 0;
		weight = 0.0;
	}
	
	public void setName(String newName)
	{
		name = newName;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setBreed(String newBreed)
	{
		breed = newBreed;
	}
	
	public String getBreed()
	{
		return breed;
	}
	
	public void setAge(int newAge)
	{
		age = newAge;
	}
	
	public int getAge()
	{
		return age;
	}
	
	public void setWeight(Double newWeight)
	{
		weight = newWeight;
	}
	
	public double newWeight()
	{
		return weight;
	}
	
	public void setPuppy(String name, String breed, int age, Double weight)
	{
		this.name = name;
		this.breed = breed;
		this.age = age;
		this.weight = weight;
	}
	
	public void setPuppy(String name, String breed)
	{
		this.name = name;
		this.breed = breed;
	}
	
	public boolean equals(Puppy otherPuppy)
	{
		return ((name.equals(otherPuppy.name)) 
				&& ((breed.equals(otherPuppy.breed)) 
						&& (age == otherPuppy.age)
						&& (weight == otherPuppy.weight)));
						
	}
	
	public String toString()
	{
		return(name + ", " + breed + ", " + age + ", " + weight);
	}
	
}
