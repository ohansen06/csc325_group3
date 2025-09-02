
package Animals;
import Interfaces.Sittable;
/**
 * Mammal class that extends Animal and implements Sittable interface.
 */
public class Mammal extends Animal implements Sittable {

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
     * Sittable interface method: prints a message indicating the mammal sat down.
     */
    @Override
    public void sitDown() {
        System.out.println("The " + species + " sat down.");    
    }

    /**
     * Sittable interface method: prints a message indicating the mammal stood up.
     */
    @Override
    public void standUp() {
        System.out.println("The " + species + " stood up.");
    }
}