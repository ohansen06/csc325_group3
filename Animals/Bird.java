
package Animals;
import Interfaces.Swimable;
import Interfaces.Walkable;
/**
 * Bird class that extends Animal and implements walkable and swimable interfaces
 */
public class Bird extends Animal implements Walkable, Swimable {

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
     * Walkable interface method: prints a message indicating the bird can walk
     */
    @Override
    public void canWalk() {
        System.out.println("This " + species + " can walk.");
    }
    

    /**
     * Walkable interface method: prints a message indicating the bird walked forward.
     */
    @Override
 public void walk() {
        System.out.println("The " + species + " walked forward.");
    }

     /**
     * Walkable interface method: prints a message indicating the bird can swim
     */
    @Override
    public void canSwim(){
        System.out.println("This " + species + " can swim.");
    }

     /**
     * Walkable interface method: prints a message indicating the bird swam deeper
     */
    @Override
    public void diveDown() {
        System.out.println("The " + species + " swam deeper.");
   
    }
    
}

