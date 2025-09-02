
package Animals;
import Interfaces.Flyable;
/**
 * Bird class that extends Animal and implements Flyable interface.
 */
public class Bird extends Animal implements Flyable {

    /**
     * Constructs a Bird with the given species.
     * @param species The species name
     */
    public Bird(String species) {
        super(species);
    }

    /**
     * Move method that prints a message indicating the bird is flying.
     */
    @Override
    public void move() {
        System.out.println("The " + species + " flew around.");
    }

    /**
     * Sound method that prints a message indicating the bird chirped.
     */
    @Override 
    public void makeSound() {
        System.out.println("The " + species + " chirped.");
    }

    /**
     * Returns the species of the bird.
     * @return species name
     */
    @Override
    public String toString() {
        return species;
    }

    /**
     * Flyable interface method: prints a message indicating the bird dove down.
     */
    @Override
    public void diveDown() {
        System.out.println("The " + species + " dove down.");
    }     

    /**
     * Flyable interface method: prints a message indicating the bird flew up.
     */
    @Override
    public void flyUp() {
        System.out.println("The " + species + " flew up.");
    }
}

