package CSC325_Assignment2.animal;
import CSC325_Assignment2.interfaces.Swimmable;
import CSC325_Assignment2.interfaces.Walkable;

public class Bird extends Animal implements Walkable, Swimmable
{
    private String species;
    public Bird(String species)
    {
        this.species = species;
    }
    @Override
    public void makeSound()
    {
        System.out.println("Chirp! Squack! Quack!");
    }
    @Override
    public void move()
    {
        System.out.println("The " + species + " waddles towards you! Look how cute.");
    }
    @Override
    public void canWalk()
    {
        System.out.println(species + "s can walk! Birds have two feet to walk on.");
    }
    @Override
    public void walk()
    {
        System.out.println("The " + species + " takes a couple steps around!");
    }
    @Override
    public void canSwim()
    {
        System.out.println("Many different species of birds can swim!");
    }
    @Override
    public void swim()
    {
        System.out.println("The " + species + " swims forward. Fingers crossed it's good at it!");
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
