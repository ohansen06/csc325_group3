package CSC325_Assignment2.animal;
import CSC325_Assignment2.interfaces.Swimmable;

public class Fish extends Animal implements Swimmable
{
    private String species;
    public Fish(String species)
    {
        this.species = species;
    }
    @Override
    public void makeSound()
    {
        System.out.println("Blub! Blug! Bluh!");
    }
    @Override
    public void move()
    {
        System.out.println("The " + species + " moves towards you! Look how cute.");
    }
    @Override
    public void canSwim()
    {
        System.out.println("All fish can swim! They're aquatic animals.");
    }
    @Override
    public void swim()
    {
        System.out.println("The " + species + " swims around.");
    }
    @Override
    public void setSpecies(String species)
    {
        this.species = species;
    }
    @Override
    public String getSpecies()
    {
        return species;
    }
}
