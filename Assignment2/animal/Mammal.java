package Assignment2.animal;
import Assignment2.interfaces.Swimmable;
import assignment2.interfaces.Walkable;
public class Mammal extends Animal implements Walkable, Swimmable {
    private String species;

    public Mammal(String species) {
        this.species = species;
    }
    @Override
    public void move() {
        System.out.println("the "+ species + " moves");
    }

    @Override
    public void makeSound() {
        System.err.println("Roar!");
    }

    @Override
    public void walk() {
        System.out.println("the "+ species + " walks towrds its food.");
    }
    @Override
    public void canWalk() {
        System.out.println("Mammals tend to be able to walk.");
    }
    @Override
    public void swim() {
        System.out.println("the "+ species + " swims in the water.");
    }
    @Override
    public void canSwim() {
        System.out.println("Some mammals can swim.");
    }
}
