package Animals;
import Interfaces.Sittable;

public class Mammal extends Animal implements Sittable {
private final String species;

public Mammal(String s){
    species = s;
}
@Override
public void move() {
System.out.println("The " + species + " walked around.");
}
@Override
public void makeSound() {
System.out.println("The " + species + " made a sound.");
}
@Override
    public String toString() {
        return species;
    }
@Override
public void sitDown() {
    System.out.println("The " + species + " sat down.");    
}
@Override
public void standUp() {
    System.out.println("The " + species + " stood up.");
}
}