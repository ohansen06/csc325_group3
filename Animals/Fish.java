
package Animals;
/**
 * Fish class that extends Animal.
 */
public class Fish extends Animal {
    
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
}
