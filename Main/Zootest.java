package Main;
import Animals.Animal;
import Animals.Bird;
import Animals.Fish;
import Animals.Mammal;
import Animals.ZooManager;
import Interfaces.Flyable;
import Interfaces.Sittable;
import java.util.ArrayList;
/**
 * Main class to test the ZooManager and animal classes.
 */
public class Zootest {

    /**
     * Main method to start the ZooManager menu.
     * @param args Command line arguments
     */
    public static void main(String[] args) {
        //example of zoo manager menu
        ZooManager.menu();

        //example of usage of polymorphism and interfaces
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

