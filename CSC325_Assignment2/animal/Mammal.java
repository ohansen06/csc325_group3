package CSC325_Assignment2.animal;
import CSC325_Assignment2.interfaces.Swimmable;
import CSC325_Assignment2.interfaces.Walkable;

public class Mammal extends Animal implements Walkable, Swimmable
{
    private String species;
    public Mammal(String species)
    {
        this.species = species;
    }
    @Override
    public void makeSound()
    {
        System.out.println("Grrrr! Rawr! Mrrrr!");
    }
    @Override
    public void move()
    {
        System.out.println("The " + species + " lumbers towards you! Look how cute.");
    }
    @Override
    public void canWalk()
    {
        System.out.println(species + "s can walk! Most mammals have two or four feet to walk on.");
    }
    @Override
    public void walk()
    {
        System.out.println("The " + species + " takes a couple steps around!");
    }
    @Override
    public void canSwim()
    {
        System.out.println("Most mammals can swim! Some are even entirely aquatic!");
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
