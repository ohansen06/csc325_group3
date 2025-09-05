
package CSC325Assignment2.Animals;
/**
 * Base class for all animals in the zoo.
 */
public abstract class Animal {
    
    protected String species;

    /**
     * Constructs an Animal with the given species.
     * @param s The species name
     */
    public Animal(String s) {
        species = s;
    }

    /**
     * Default move method, to be overridden by subclasses.
     */
    public abstract void move();

    /**
     * Default makeSound method, to be overridden by subclasses.
     */
    public abstract void makeSound();
}
