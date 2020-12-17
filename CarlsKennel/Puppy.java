public class Puppy
{
    private String name;
    private String breed;
    private int age;
    private double weight;

    public Puppy( )
    {
        name = null;
        breed = null;
        age = 0;
        weight = 0.0;
    }

    public Puppy(String name, String breed, int age, double weight)
    {
        set(name, breed, age, weight);
    }

    public void setName(String name)
    {
        this.name = name;
    }
    
    public void setBreed(String breed)
    {
        this.breed = breed;
    }
    
    public void setAge(int age)
    {
        this.age = age;
    }
    
    public void setWeight(double weight)
    {
        this.weight = weight;
    }
    
    public void set(String name, String breed, int age, double weight)
    {
    	this.name = name;
        this.breed = breed;
        this.age = age;
        this.weight = weight;
    }
    
    public void set(String name, String breed)
    {
        this.name = name;
        this.breed = breed;
    }

    public String getname( )
    {
        return name;
    }

    public String getBreed( )
    {
        return breed;
    }
    
    public int getAge( )
    {
        return age;
    }

    public double getWeight( )
    {
        return weight;
    }



    public String toString( )
    {
        return (name + " " + breed + " " + age + " " + weight);
    }

    public boolean equals(Puppy otherPuppy)
    {
        return ( (name.equals(otherPuppy.name)) && (breed.equals(otherPuppy.breed))
                  && (age == otherPuppy.age) && (weight == otherPuppy.weight) );
    }

}
