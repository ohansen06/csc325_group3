
package Animals;
import Interfaces.Swimable;
/**
 * Fish class that extends Animal and implements swimable
 */
public class Fish extends Animal implements Swimable {
    
    /**
     * Constructs a Fish with the given species.
     * @param species The species name
     */
    public Fish(String species) {
        super(species);
    }

    /**
     * Move method that prints a message indicating the fish is swimming.
     */
    @Override
    public void move() {
        System.out.println("The " + species + " swam around.");
    }

    /**
     * Sound method that prints a message indicating the fish blubbed.
     */
    @Override
    public void makeSound() {
        System.out.println("The " + species + " blubbed.");
    }

    /**
     * Returns the species of the fish.
     * @return species name
     */
    @Override
    public String toString() {
        return species;
    }

     /**
     * Walkable interface method: prints a message indicating the fish can swim
     */
    @Override
     public void canSwim(){
        System.out.println("This " + species + " can swim.");
    }

     /**
     * Walkable interface method: prints a message indicating the fish swam deeper
     */
    @Override
    public void diveDown() {
        System.out.println("The " + species + " swam deeper.");
}
}