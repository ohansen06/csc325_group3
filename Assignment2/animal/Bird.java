package Assignment2.animal;
import Assignment2.interfaces.Swimmable;
import Assignment2.interfaces.Walkable;
public class Bird extends Animal implements Walkable, Swimmable {
    @SuppressWarnings("FieldMayBeFinal")
    private String species;

    public Bird(String species) {
        this.species = species;
    }

    @Override
    public void move() {
        System.out.println("The " + species + " flies in the sky.");
    }

    @Override
    public void makeSound() {
        System.out.println("The " + species + " makes chirp chirp sound.");
    }

    @Override
    public void walk() {
        System.out.println("The " + species + " is walking.");
    }

    @Override
    public void canWalk() {
        System.out.println("Most birds can walk.");
    }

    @Override
    public void swim() {
        System.out.println("The " + species + " is swimming.");
    }

    @Override
    public void canSwim() {
        System.out.println("Some birds can swim.");
    }
    
    public void fly() {
        System.out.println("The " + species + " is flying.");
    }
}
