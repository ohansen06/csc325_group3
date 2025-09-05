
package CSC325Assignment2.Animals;
import CSC325Assignment2.Interfaces.Swimable;
import CSC325Assignment2.Interfaces.Walkable;
/**
 * Mammal class that extends Animal and implements walkable and swimable interfaces
 */
public class Mammal extends Animal implements Walkable, Swimable {

    /**
     * Constructs a Mammal with the given species.
     * @param species The species name
     */
    public Mammal(String species){
        super(species);
    }

    /**
     * Move method that prints a message indicating the mammal is walking.
     */
    @Override
    public void move() {
        System.out.println("The " + species + " walked around.");
    }

    /**
     * Sound method that prints a message indicating the mammal made a sound.
     */
    @Override
    public void makeSound() {
        System.out.println("The " + species + " made a sound.");
    }

    /**
     * Returns the species of the mammal.
     * @return species name
     */
    @Override
    public String toString() {
        return species;
    }

    /**
     * Walkable interface method: prints a message indicating the mammal can walk
     */
    
    @Override
    public void canWalk() {
        System.out.println("This " + species + " can walk.");
    }

    /**
     * Walkable interface method: prints a message indicating the mammal walked forward.
     */
    @Override
    public void walk() {
        System.out.println("The " + species + " walked forward.");
    }

     /**
     * Walkable interface method: prints a message indicating the mammal can swim
     */
    @Override
     public void canSwim(){
        System.out.println("This " + species + " can swim.");
    }

     /**
     * Walkable interface method: prints a message indicating the mammal swam deeper
     */
    @Override
    public void diveDown() {
        System.out.println("The " + species + " swam deeper.");
    }
}