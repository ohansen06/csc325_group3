package Main;

import java.util.ArrayList;

import Animals.Animal;
import Animals.Bird;
import Animals.Fish;
import Animals.Mammal;
import Interfaces.Flyable;
import Interfaces.Sittable;

public class Main {

    public static void main(String[] args) {
        
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(new Bird("Blue Jay"));
        animals.add(new Fish("Goldfish"));
        animals.add(new Mammal("Raccoon"));

    
    for (Animal a : animals) {
        System.out.println("Species: " + a.toString());
        a.move();
        a.makeSound();
        if (a instanceof Flyable f) {
            f.diveDown();
            f.flyUp();
        }
        if (a instanceof Sittable s) {
            s.sitDown();
            s.standUp();
        }
    }
}
}
