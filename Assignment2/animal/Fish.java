package Assignment2.animal;
import Assignment2.interfaces.Swimmable;
public class Fish extends Animal implements Swimmable {
    @SuppressWarnings("FieldMayBeFinal")
    private String species;

    public Fish(String species) {
        this.species = species;
    }

    @Override
    public void move() {
        System.out.println("The " + species + " swims in the water.");
    }

    @Override
    public void makeSound() {
        System.out.println("The " + species + " makes blub blub sound.");
    }
    @Override
    public void swim() {
        System.out.println("The " + species + " is swimming aroud.");
    }
    @Override
    public void canSwim() {
        System.out.println("All fish can swim.");
    }
}
