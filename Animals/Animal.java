
package Animals;
/**
 * Base class for all animals in the zoo.
 */
public abstract class Animal {
    /**
     * The species of the animal.
     */
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
    public void move(){
        System.out.println("The " + species + " moved around.");
    }

    /**
     * Default makeSound method, to be overridden by subclasses.
     */
    public void makeSound(){
        System.out.println("The " + species + " made a sound.");
    }
}
