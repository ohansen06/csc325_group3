package Animals;
import Interfaces.Flyable;

public class Bird extends Animal implements Flyable {
private final String species;

    public Bird(String s) {
        species = s;
    }
    @Override
    public void move() {
        System.out.println("The " + species + " flew around.");
}
    @Override 
    public void makeSound() {
        System.out.println("The " + species + " chirped.");
    }
    @Override
    public void diveDown() {
         System.out.println("The " + species + " dove down.");
    }     
@Override
    public String toString() {
        return species;
    }
@Override
    public void flyUp() {
        System.out.println("The " + species + " flew up.");
    }
}

